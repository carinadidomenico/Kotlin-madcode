package br.com.carinadidomenico.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.carinadidomenico.telalogin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // criando o clique do botão entrar
        btnEntrar.setOnClickListener {
            val usuario = edtUsuario.text.toString().trim()
            val senha = edtSenha.text.toString().trim()

            // Condição para verificar se usuário e senha estão corretos

            // Verificando se os campos estão vazios
            if(usuario.isEmpty()) {
                txvResultado.text = "Digite o usuário"
            } else if(senha.isEmpty()) {
                txvResultado.text = "Digite a senha"
            }
            //Verificando se usuário e senha estão corretos
            else if(usuario == "carinadidomenico") {
                if(senha == "123456") {
                    txvResultado.text = "Usuário logado"
                } else {
                    txvResultado.text = "Senha incorreta"
                }
            } else {
                txvResultado.text = "Usuário incorreto"
            }
        }

    }
}
