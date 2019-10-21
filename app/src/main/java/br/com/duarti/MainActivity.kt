package br.com.duarti

import android.os.Bundle
import br.com.duarti.presentation.base.BaseActivity
import br.com.duarti.features.repositories.presentation.RepositoriesFragment
import org.koin.android.ext.android.inject


class MainActivity : BaseActivity() {

    private val repositoriesFragment: RepositoriesFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(R.id.mainFragmentId, repositoriesFragment, RepositoriesFragment.FRAGMENT_TAG)

    }
}
