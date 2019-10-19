package br.com.duarti.presentation.repository

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.duarti.data.model.Repository

class RepositoryAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var repositories: MutableList<Repository> = mutableListOf()
        set(value) {
            field.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RepositoryViewHolder.create(parent)

    override fun getItemCount() = repositories.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RepositoryViewHolder).bindTo(repositories[position])
    }

}