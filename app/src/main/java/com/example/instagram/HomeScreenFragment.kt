package com.example.instagram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.instagram.recyclerview.ImagesAdap
import com.example.instagram.recyclerview.StoriesAdap
import com.example.instagram.datasources.DataPost
import com.example.instagram.datasources.DataStory


class HomeScreenFragment : Fragment() {


    private lateinit var pAdapter: ImagesAdap
    private lateinit var sAdapter: StoriesAdap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home_screen, container, false)
        val images: RecyclerView = view.findViewById(R.id.imageList)
        val story: RecyclerView = view.findViewById(R.id.storyList)
        images.apply {
            layoutManager = LinearLayoutManager(context)
            pAdapter = ImagesAdap()
            adapter = pAdapter
        }
        story.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            sAdapter = StoriesAdap()
            adapter = sAdapter
        }
        val pData = DataPost.pPost()
        val sData = DataStory.sStory()
        pAdapter.pList(pData)
        view.findViewById<ImageButton>(R.id.inbox).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeScreenFragment_to_messageFragment)
        }
        sAdapter.sList(sData)
        return view
    }
}