package br.com.duarti.features.repositories.presentation

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.duarti.features.repositories.domain.model.Repositories

class RepositoriesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var repositories: MutableList<Repositories> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        RepositoriesViewHolder.create(
            parent
        )

    override fun getItemCount() = repositories.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RepositoriesViewHolder).bindTo(repositories[position])
    }

    fun addData(list: List<Repositories>) {
        repositories.clear()
        repositories.addAll(list)
        notifyDataSetChanged()
    }

}