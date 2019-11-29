package br.com.matheus_candido.tela_login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Abrindo o Shared Preferences

        val minhaPreferencia = getSharedPreferences("cadastro", Context.MODE_PRIVATE)

        val nome = minhaPreferencia.getString("nome", "Erro Preference")
        val sobrenome = minhaPreferencia.getString("sobrenome", "Erro Preference")
        val email = minhaPreferencia.getString("email", "Erro Preference")
        val sexo = minhaPreferencia.getString("sexo", "Erro Preference")


        txvNome.text = "$nome $sobrenome"
        txvEmail.text = email
        txvSexo.text = sexo

        btnSair.setOnClickListener {
            startActivity(Intent(this@Main2Activity, MainActivity::class.java))
            finishAffinity() // fecha as outras telas que estão embaixo
        }

        btnWeb.setOnClickListener {
            startActivity(Intent(this@Main2Activity, WebActivity::class.java))
        }
    }
}







