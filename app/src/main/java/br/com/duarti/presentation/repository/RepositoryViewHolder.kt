package br.com.duarti.presentation.repository

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.duarti.R
import br.com.duarti.data.model.Repository
import kotlinx.android.synthetic.main.repository_line.view.*

class RepositoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bindTo(
        repository: Repository?
    ) {
        itemView.repositoryTitle.text = repository?.fullName
        itemView.repositoryTitle.text = repository?.description
    }

    companion object {
        fun create(parent: ViewGroup) : RepositoryViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val view = layoutInflater.inflate(R.layout.repository_line, parent, false)
            return RepositoryViewHolder(view)
        }
    }
}