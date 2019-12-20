package br.com.carinadidomenico.fawkes

import android.graphics.Bitmap
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.web_activity.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_activity)

        wbweb.settings.javaScriptEnabled = true
        wbweb.loadUrl("http://br.cellep.com")

        wbweb.webViewClient = object : WebViewClient(){

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)

                Inpbusca.setText(url)

            }

        }


        btnVoltar.setOnClickListener {
            wbweb.goBack()

        }


        btnAvançar.setOnClickListener {
            wbweb.goForward()

        }


        btnRefresh.setOnClickListener {
            wbweb.reload()

        }

        btnPesquisar.setOnClickListener {
            var pesquisa = Inpbusca.text.toString().trim()

            if (Inpbusca.text.toString().trim().indexOf("www.") < 0) {
                pesquisa = "www.$pesquisa"
            }
            if (Inpbusca.text.toString().trim().indexOf("https://") < 0) {
                pesquisa = "https://$pesquisa"
            }
            if (Inpbusca.text.toString().trim().indexOf(".com") < 0) {
                pesquisa = "$pesquisa.com"
            }
            if (Inpbusca.text.toString().trim().isEmpty()) {
                Toast.makeText(this@WebActivity, "Campo vazio ", Toast.LENGTH_LONG).show()
            } else {
                wbweb.loadUrl(pesquisa)
                Inpbusca.setText(pesquisa)

            }

        }
    }
}