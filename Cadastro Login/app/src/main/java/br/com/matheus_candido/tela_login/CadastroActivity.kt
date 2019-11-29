package br.com.matheus_candido.tela_login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_cadastro_activity.*

class CadastroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_activity)

        // Criando a preferência (SharedPreferences)

        val minhaPreferencia = getSharedPreferences("cadastro", Context.MODE_PRIVATE)



        // Criando o editor da preferência

        val meuEditor = minhaPreferencia.edit()



        // Criando a lista de sexo

        val listaSexo = arrayListOf("Selecione o sexo", "Feminino", "Masculino", "Não informar")



        // Criando o adapter (juntas a lista com o layout do spinner/'select')

        val sexoAdapter = ArrayAdapter(
            this@CadastroActivity,
            android.R.layout.simple_spinner_dropdown_item, // usa o layout padrão do spinner
            listaSexo
        )



        //Adicionar o adapter no spinner

        spnSexo.adapter = sexoAdapter



        // Criando o editor do shareoiunr

        btnCadastrar.setOnClickListener {

            val nome = edtNome.text.toString().trim().toUpperCase()

            val sobrenome = edtSobrenome.text.toString().trim().toUpperCase()

            val email = edtEmail.text.toString().trim().toLowerCase()

            val senha = edtSenha.text.toString().trim()



            //Definindo as variaveis para validação dos inputs

            if (nome.isEmpty() || sobrenome.isEmpty()|| email.isEmpty()|| senha.isEmpty()){
                    Toast.makeText(this@CadastroActivity,"Preencha todos os campos", Toast.LENGTH_LONG).show()

            } else if(spnSexo.selectedItem == "Selecione o sexo") {
                Toast.makeText(this@CadastroActivity,"Preencha todos os campos", Toast.LENGTH_LONG).show()

            } else {

                meuEditor.putString("nome", nome).apply()
                meuEditor.putString("sobrenome", sobrenome).apply()
                meuEditor.putString("email", email).apply()
                meuEditor.putString("senha", senha).apply()
                meuEditor.putString("sexo", spnSexo.selectedItem.toString()).apply()

                AlertDialog.Builder(this@CadastroActivity)
                    .setTitle("Sucesso")
                    .setMessage("Usuário cadastrado!")
                    .setPositiveButton("Ok") {_,_ ->
                        startActivity(Intent(this@CadastroActivity, Main2Activity:: class.java))

                    }
                    .setCancelable(false)
                    .create()
                    .show()
            }

        }
    }
}
