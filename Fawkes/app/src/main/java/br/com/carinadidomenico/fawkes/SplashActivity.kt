package br.com.carinadidomenico.fawkes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        Handler().postDelayed({


            //criando a intent

            //redireciona para a login/mainActivity
            startActivity(Intent(this@SplashActivity,WebActivity::class.java))
            finish()

        },3000)

    }
}
