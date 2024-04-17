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

        val resultadoFormatado = String.format("%.2f", resultado)
        val preçoFormatado = String.format("%.2f", preço)
        val consumoFormatado = String.format("%.2f", consumo)
        val distânciaFormatado = String.format("%.2f", distância)

        val tv_resultado = findViewById<TextView>(R.id.tv_resultado)
        val tv_preço2 = findViewById<TextView>(R.id.tv_preço2)
        val tv_consumo2 = findViewById<TextView>(R.id.tv_consumo2)
        val tv_distancia2 = findViewById<TextView>(R.id.tv_distancia2)
        val btn_Novo_Cálculo = findViewById<Button>(R.id.btn_Novo_Cálculo)

        tv_resultado.text = "R$ $resultadoFormatado"
        tv_preço2.text = "R$ $preçoFormatado"
        tv_consumo2.text = "$consumoFormatado Km/L"
        tv_distancia2.text = "$distânciaFormatado Km"

        btn_Novo_Cálculo.setOnClickListener {

            val intent = Intent(this, a_tela_Inicial::class.java)
            startActivity(intent)

        }
    }
}