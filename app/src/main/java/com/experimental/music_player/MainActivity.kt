package com.experimental.music_player

import android.os.Bundle
import elementx.media.playback.*

class MainActivity : MediaCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
