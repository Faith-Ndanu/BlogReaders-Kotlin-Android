package com.example.blogreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyBlogAuthor (var contactsList: List<MyContactBlog>): RecyclerView.Adapter<AuthorsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.contacts_profile_list,parent,false)
        return AuthorsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {
        val contact=contactsList[position]
        holder.tvAuthorName.text=contact.authorName
        holder.tvPublishDate.text=contact.publishDate
        holder.tvTitle.text=contact.title


    }


    override fun getItemCount(): Int {
        return contactsList.size

    }
}
class AuthorsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvAuthorName=itemView.findViewById<TextView>(R.id.tvAuthorName)
    var tvPublishDate=itemView.findViewById<TextView>(R.id.tvPublishDate)
    var tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
}