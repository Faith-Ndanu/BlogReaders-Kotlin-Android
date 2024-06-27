package com.example.blogreaderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvBlogs.layoutManager= LinearLayoutManager(this)
        displayAuthors()

    }
    fun displayAuthors(){
        val author1=MyContactBlog("Abdi","Blossoms","20-10-2011","")
        val author2=MyContactBlog("Kesa","Kigogo","11-12-2023","")
        val author3=MyContactBlog("Kashuna","  Arise & Shine","12-13-2014","")
        val author4=MyContactBlog("Eshe","The Peral","21-02-2011","")
        val author5=MyContactBlog("Aziz","Dolls House","21-09-4567","")
        val author6=MyContactBlog("Ndanu","Kidahgaa Kimemwozea","21-6-90","")
        val author7=MyContactBlog("Kayago","Betrayal in city","12-45-6772","")
        val author8=MyContactBlog("Kamau","Caucasian chalk circle","12-09-45","")
        val author9=MyContactBlog("mbambazi","Memories we lost","67-87-678","")
        val author10=MyContactBlog("mutesi","The sunset","13-34-5679","")

        val myAuthors= listOf(author1,author2,author3,author4,author5,author6,author7,author8,author9,author10)

        val myBlogAuthor=MyBlogAuthor(myAuthors)
        binding.rvBlogs.adapter=myBlogAuthor


    }

}