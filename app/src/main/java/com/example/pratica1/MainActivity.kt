package com.example.pratica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        R.drawable.smile
        val botao:Button = findViewById(R.id.buttonT)

        botao.setOnClickListener(){
            val mensagem = "Você clicou no botão para mostrar o TOAST"
            val duracao = Toast.LENGTH_SHORT

            Toast.makeText(this, mensagem, duracao).show()//mostra o toast passando a activity, mensagem, duração e chama para mostrar
        }
    }
}