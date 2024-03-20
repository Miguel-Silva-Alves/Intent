package com.masdeveloper.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masdeveloper.intent.databinding.ActivityParametroBinding

class ParametroActivity : AppCompatActivity() {

    private val amb: ActivityParametroBinding by lazy {
        ActivityParametroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parametro)

        amb.mainTb.apply {
            title = getString(R.string.app_name)
            subtitle = this@ParametroActivity.javaClass.simpleName
            setSupportActionBar(this)
        }
    }


}