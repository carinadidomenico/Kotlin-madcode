package br.com.carinadidomenico.fawkes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.web_activity.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_activity)

        wbvWeb.settings.javaScriptEnabled = true

        wbvWeb.setWebViewClient(WebViewClient())
        wbvWeb.loadUrl("http://br.cellep.com")

        btnVoltar.setOnClickListener {
            wbvWeb.goBack()
        }
        btnAvancar.setOnClickListener {
            wbvWeb.goForward()
        }
        btnAtt.setOnClickListener {
            wbvWeb.reload()
        }
        btnPesquisar.setOnClickListener {
            wbvWeb.loadUrl(inpBusca.getText().toString())
        }
    }

}
