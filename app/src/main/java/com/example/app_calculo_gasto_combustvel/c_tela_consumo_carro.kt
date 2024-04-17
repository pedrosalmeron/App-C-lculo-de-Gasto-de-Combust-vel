package com.example.app_calculo_gasto_combustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class c_tela_consumo_carro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo_carro)

        val btn_arrow_back2 = findViewById<FloatingActionButton>(R.id.btn_arrow_back2)
        val ti_consumo_carro = findViewById<TextInputEditText>(R.id.ti_consumo_carro)
        val btn_Próximo2 = findViewById<Button>(R.id.btn_Próximo2)

        btn_arrow_back2.setOnClickListener {

            val intentBack1 = Intent(this, b_tela_preco_combustivel::class.java)

            startActivity(intentBack1)
        }

        btn_Próximo2.setOnClickListener {

            val consumoStr: String = ti_consumo_carro.text.toString()

            if (consumoStr == "") {

                Snackbar.make(
                    ti_consumo_carro,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG,
                )
                    .show()

            } else {

                val KR_Preço = intent.getFloatExtra("KR_Preço",0f)

                val intent = Intent(this, d_distancia::class.java)

                val consumoFloat : Float = consumoStr.toFloat()

                intent.putExtra("KR_Preço",KR_Preço)
                intent.putExtra("KR_Consumo",consumoFloat)

                startActivity(intent)
            }
        }
    }
}