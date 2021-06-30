package com.example.instagram.datasources

import com.example.instagram.R
import com.example.instagram.recyclerview.ModelStory

class DataStory {

    companion object{

        fun sStory(): ArrayList<ModelStory>{

            val sList = ArrayList<ModelStory>()
            sList.add(
                ModelStory(
                    R.drawable.cheems,
                    "User")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems1,
                    "Cheems")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems,
                    "User")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems1,
                    "Cheems")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems,
                    "User")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems1,
                    "Cheems")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems,
                    "User")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems1,
                    "Cheems")
            )
            sList.add(
                ModelStory(
                    R.drawable.cheems,
                    "User")
            )
            return sList
        }
    }
}