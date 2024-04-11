package com.example.app_calculo_gasto_combustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class c_tela_consumo_carro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo_carro)

        val btn_Próximo2 = findViewById<Button>(R.id.btn_Próximo2)

        btn_Próximo2.setOnClickListener {
            val Intent = Intent(this, d_distancia::class.java)
            startActivity(Intent)
        }
    }
}