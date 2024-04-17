package com.example.app_calculo_gasto_combustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class a_tela_Inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)

        val btn_Iniciar = findViewById<Button>(R.id.btn_Iniciar)

        btn_Iniciar.setOnClickListener {

            val intent = Intent (this, b_tela_preco_combustivel::class.java)
            startActivity(intent)
        }
    }
}