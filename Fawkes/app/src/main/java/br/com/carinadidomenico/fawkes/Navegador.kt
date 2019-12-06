package br.com.carinadidomenico.fawkes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Navegador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegador)

        wbvWeb.settings.javaScriptEnabled = true
        wbvWeb.loadUrl("http://google.com.br")
    }


}
