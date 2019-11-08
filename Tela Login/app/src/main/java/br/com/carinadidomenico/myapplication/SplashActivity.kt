package br.com.carinadidomenico.telalogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import br.com.carinadidomenico.myapplication.MainActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Definindo o tempo Splash
        Handler().postDelayed({

            // Criando a Intent
            startActivity(Intent(this@SplashActivity, MainActivity :: class.java))
            finish()
        }, 3000)
    }
}