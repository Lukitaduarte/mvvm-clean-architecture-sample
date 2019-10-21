package br.com.duarti.features.repositories.presentation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer

import br.com.duarti.R
import br.com.duarti.databinding.RepositoryFragmentBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class RepositoriesFragment : Fragment() {

    private val viewModel: RepositoriesViewModel by viewModel()
    private val adapter: RepositoriesAdapter by inject()

    private lateinit var fragmentRepositoriesBinding: RepositoryFragmentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.loadUserRepositories()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentRepositoriesBinding = DataBindingUtil.inflate(inflater, R.layout.repository_fragment, container, false)
        fragmentRepositoriesBinding.repositoriesViewModel = viewModel
        fragmentRepositoriesBinding.recyclerView.adapter = adapter

        viewModel.repositories.observe(this, Observer { repositories ->
            adapter.addData(repositories)
        })

        return fragmentRepositoriesBinding.root

    }

    companion object {
        fun newInstance() = RepositoriesFragment()
        const val FRAGMENT_TAG = "RepositoriesFragment"
    }

}
