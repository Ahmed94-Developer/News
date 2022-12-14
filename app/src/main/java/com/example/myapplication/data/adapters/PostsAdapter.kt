package com.example.myapplication.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.retrofit.model.Posts

class PostsAdapter(val postsList : List<Posts>) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PostsViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.posts_row, parent, false)
        return PostsViewHolder(v)
    }

    override fun onBindViewHolder(holder: PostsViewHolder, p1: Int) {
        val posts : Posts = postsList[p1]
        holder.titleTxt.setText(posts.title)
        holder.bodTxt.setText(posts.body)
    }

    override fun getItemCount(): Int {
        return  postsList.size
    }
    class PostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTxt : TextView = itemView.findViewById(R.id.txt_title)
        val bodTxt : TextView = itemView.findViewById(R.id.txt_body)

    }

}