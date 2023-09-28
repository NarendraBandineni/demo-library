package com.example.librarydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.narenlibrary.DemoFrag

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragmant_container, DemoFrag()).commit()

    }
}