package com.masdeveloper.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masdeveloper.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val amb: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        amb.mainTb.apply {
            title = getString(R.string.app_name)
            subtitle = this@MainActivity.javaClass.simpleName
            setSupportActionBar(this)
        }
    }
}