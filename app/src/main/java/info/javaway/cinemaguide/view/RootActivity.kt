package info.javaway.cinemaguide.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.javaway.cinemaguide.R

class RootActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}