package com.example.app_calculo_gasto_combustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class d_distancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distancia)

        val ti_distância = findViewById<TextInputEditText>(R.id.ti_distância)

        val btn_Resultado = findViewById<Button>(R.id.btn_Resultado)

        btn_Resultado.setOnClickListener {

            val distânciaStr: String = ti_distância.text.toString()

            if (distânciaStr == "") {

                Snackbar.make(
                    ti_distância,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG,
                )
                    .show()

            } else {

                val KR_Preço = intent.getFloatExtra("KR_Preço",0f)
                val KR_Consumo = intent.getFloatExtra("KR_Consumo",0f)

                val KR_Distância : Float = distânciaStr.toFloat()

                val resultado : Float = (KR_Distância/KR_Consumo)*KR_Preço

                val intent = Intent(this,e_result::class.java)

                intent.putExtra("KR_Preço",KR_Preço)
                intent.putExtra("KR_Consumo",KR_Consumo)
                intent.putExtra("KR_Distância",KR_Distância)
                intent.putExtra("KR_Resultado",resultado)

                startActivity(intent)
            }
        }
    }
}