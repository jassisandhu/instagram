package com.example.instagram.datasources

import com.example.instagram.R
import com.example.instagram.recyclerview.Messages

class DataMessage {

    companion object {

        fun mMessages(): ArrayList<Messages> {
            val mList = ArrayList<Messages>()
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems1,
                    "cheems",
                    "liked a message")
            )
            mList.add(
                Messages(
                    R.drawable.cheems,
                    "someone",
                    "Mentioned you in a story")
            )
            mList.add(
                Messages(
                    R.drawable.cheems,
                    "someone",
                    "Mentioned you in a story")
            )
            return mList
        }
    }
}