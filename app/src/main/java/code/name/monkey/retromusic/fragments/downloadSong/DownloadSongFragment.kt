/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package code.name.monkey.retromusic.fragments.downloadSong

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import code.name.monkey.retromusic.R
import code.name.monkey.retromusic.extensions.openUrl


class DownloadSongFragment : Fragment(R.layout.download_song_website), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        openUrl("https://myfreemp3.to/")
        val button = view.findViewById<Button>(R.id.go_downloadePage)

button.setOnClickListener{
    openUrl("https://myfreemp3.to/")
}

    }










    override fun onDestroyView() {
        super.onDestroyView()

    }

    override fun onClick(p0: View?) {

    }
}
