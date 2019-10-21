package br.com.duarti.domain.usecase

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

abstract class SingleUseCase<T, in Params> {

    private val disposables = CompositeDisposable()

    protected abstract fun buildUseCaseObservable(params: Params? = null): Single<T>

    open fun execute(
        onSuccess: ((t: T) -> Unit),
        onError: ((t: Throwable) -> Unit),
        onFinished: () -> Unit = {}
    ) {

        val single = buildUseCaseObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doAfterTerminate(onFinished)
            .subscribe(onSuccess, onError)

        addDisposable(single)

    }

    fun dispose() {
        if (!disposables.isDisposed) disposables.dispose()
    }

    private fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

}