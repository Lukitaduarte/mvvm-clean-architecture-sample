package br.com.duarti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Retrofit
import com.google.gson.GsonBuilder
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import br.com.duarti.data.api.GithubService
import br.com.duarti.presentation.base.BaseActivity
import br.com.duarti.presentation.repository.RepositoryFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(R.id.mainFragmentId, RepositoryFragment.newInstance(), RepositoryFragment.FRAGMENT_TAG)

//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://api.github.com")
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
//            .build()
//
//        val service = retrofit.create<GithubService>(GithubService::class.java)
//
//        service.getUserRepos("lukitaduarte")
//            .toList()
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe { t1, t2 -> Log.d("TESTE", t1.toString()) }

    }
}
