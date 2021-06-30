package com.example.instagram.datasources

import com.example.instagram.R
import com.example.instagram.recyclerview.Images

class DataPost {

    companion object {

        fun pPost(): ArrayList<Images> {

            val pList = ArrayList<Images>()
            pList.add(
                Images(
                    "user",
                    R.drawable.cheems,
                    R.drawable.cheems1)
            )
            pList.add(
                Images(
                    "cheems",
                    R.drawable.cheems1,
                    R.drawable.cheems)
            )
            pList.add(
                Images(
                    "user",
                    R.drawable.cheems,
                    R.drawable.cheems1)
            )
            pList.add(
                Images(
                    "cheems",
                    R.drawable.cheems1,
                    R.drawable.cheems)
            )
            pList.add(
                Images(
                    "user",
                    R.drawable.cheems,
                    R.drawable.cheems1)
            )
            pList.add(
                Images("cheems",
                    R.drawable.cheems1,
                    R.drawable.cheems)
            )

            return pList
        }
    }
}
