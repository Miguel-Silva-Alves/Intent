package com.masdeveloper.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masdeveloper.intent.Constantes.PARAMETRO_EXTRA
import com.masdeveloper.intent.Constantes.PARAMETRO_REQUEST_CODE
import com.masdeveloper.intent.databinding.ActivityParametroBinding

class ParametroActivity : AppCompatActivity() {

    private val amb: ActivityParametroBinding by lazy {
        ActivityParametroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        intent.getStringExtra(PARAMETRO_EXTRA)?.let {
            amb.parametroEt.setText(it)
        }

        amb.mainTb.apply {
            title = getString(R.string.app_name)
            subtitle = this@ParametroActivity.javaClass.simpleName
            setSupportActionBar(this)
        }

        amb.enviarParametroBt.setOnClickListener{
            val parametro = amb.parametroEt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra(PARAMETRO_EXTRA, parametro)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }


}