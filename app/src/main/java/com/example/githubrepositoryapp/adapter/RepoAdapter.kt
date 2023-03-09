package com.example.githubrepositoryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepositoryapp.databinding.ItemRepoBinding
import com.example.githubrepositoryapp.model.Repo


// 4. 레포 가져오기 - 유정의 레포 띄우기
// 6.
class RepoAdapter(private val onClick: (Repo) -> Unit) : ListAdapter<Repo, RepoAdapter.RepoViewHolder>(repoDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val inflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val binding = ItemRepoBinding.inflate(inflater, parent, false)
        return RepoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val repoDiff = object: DiffUtil.ItemCallback<Repo>() {
            override fun areItemsTheSame(oldItem: Repo, newItem: Repo): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Repo, newItem: Repo): Boolean {
                return oldItem == newItem
            }
        }
    }

    inner class RepoViewHolder(private val binding: ItemRepoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Repo) {
            binding.repoNameTextView.text = item.name
            binding.descriptionTextView.text = item.description
            binding.starCountTextView.text = item.startCount.toString()
            binding.forkCountTextView.text = item.forkCount.toString()

            binding.root.setOnClickListener {
                onClick(item)
            }
        }
    }
}