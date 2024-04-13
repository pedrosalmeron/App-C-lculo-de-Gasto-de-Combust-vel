package com.example.app_calculo_gasto_combustvel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class e_result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultado = intent.getFloatExtra("KR_Resultado",0f)
        val preço = intent.getFloatExtra("KR_Preço",0f)
        val consumo = intent.getFloatExtra("KR_Consumo",0f)
        val distância = intent.getFloatExtra("KR_Distância",0f)

        val tv_resultado = findViewById<TextView>(R.id.tv_resultado)
        val tv_preço = findViewById<TextView>(R.id.tv_preço)
        val tv_consumo = findViewById<TextView>(R.id.tv_consumo)
        val tv_distancia = findViewById<TextView>(R.id.tv_distancia)
        val btn_Novo_Cálculo = findViewById<Button>(R.id.btn_Novo_Cálculo)

        tv_resultado.text = resultado.toString()
        tv_preço.text = preço.toString()
        tv_consumo.text = consumo.toString()
        tv_distancia.text = distância.toString()

        btn_Novo_Cálculo.setOnClickListener {

            val intent = Intent(this, b_tela_preco_combustivel::class.java)
            startActivity(intent)

        }
    }
}