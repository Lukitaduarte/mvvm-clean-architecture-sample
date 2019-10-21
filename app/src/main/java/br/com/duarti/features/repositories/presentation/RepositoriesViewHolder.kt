package br.com.duarti.features.repositories.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.duarti.R
import br.com.duarti.features.repositories.domain.model.Repositories
import kotlinx.android.synthetic.main.repository_line.view.*

class RepositoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bindTo(
        repositories: Repositories?
    ) {
        itemView.repositoryTitle.text = repositories?.fullName
        itemView.repositoryDescription.text = repositories?.description
    }

    companion object {
        fun create(parent: ViewGroup) : RepositoriesViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val view = layoutInflater.inflate(R.layout.repository_line, parent, false)
            return RepositoriesViewHolder(view)
        }
    }
}