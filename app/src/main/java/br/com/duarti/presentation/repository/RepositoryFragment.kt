package br.com.duarti.presentation.repository

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.duarti.R
import kotlinx.android.synthetic.main.repository_fragment.*

class RepositoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepositoryFragment()
        const val FRAGMENT_TAG = "RepositoryFragment"
    }

    private lateinit var viewModel: RepositoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.repository_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RepositoryViewModel::class.java)

        initAdapter()
    }

    private fun initAdapter() {
        recyclerView.adapter =
    }

}
