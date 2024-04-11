package com.example.app_calculo_gasto_combustvel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class b_tela_preco_combustivel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preco_combustivel)

        val btn_Próximo1 = findViewById<Button>(R.id.btn_Próximo1)

        btn_Próximo1.setOnClickListener{
            val Intent = Intent(this, c_tela_consumo_carro::class.java)
            startActivity(Intent)
        }





        }

    }