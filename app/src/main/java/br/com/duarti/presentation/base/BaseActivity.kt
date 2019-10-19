package br.com.duarti.presentation.base

import androidx.appcompat.app.AppCompatActivity
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment


open class BaseActivity : AppCompatActivity() {

    protected fun addFragment(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        fragmentTag: String
    ) {
        supportFragmentManager
            .beginTransaction()
            .add(containerViewId, fragment, fragmentTag)
            .disallowAddToBackStack()
            .commit()
    }

}