package br.com.matheus_candido.tela_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando o clique do botão entrar

        btnEntrar.setOnClickListener {

            val usuario = edpUsuario.text.toString().trim();

            val senha = edpSenha.text.toString().trim();


            //Condição para verificar se os campos estão corretos

            if (usuario.isEmpty()){
                txvResultado.text= "Usuario vazio"
            }else if (senha.isEmpty()){
                txvResultado.text= "Senha vazio"
            }

            else if (usuario == "carina"){

                if (senha == "1234"){
                    txvResultado.text= "Acesso valido"
                        startActivity(Intent(this@MainActivity, Main2Activity::class.java))
                } else {
                    txvResultado.text= "Dados incorretos"}
            } else{
                txvResultado.text= "Usuario não encontrado"
            }

        }

        btnCadastro.setOnClickListener {

            startActivity(Intent(this@MainActivity,CadastroActivity::class.java))
        }

    }
}
