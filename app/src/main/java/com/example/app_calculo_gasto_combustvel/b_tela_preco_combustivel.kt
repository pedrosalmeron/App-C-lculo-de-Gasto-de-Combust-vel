package com.example.app_calculo_gasto_combustvel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class b_tela_preco_combustivel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preco_combustivel)

        val btn_arrow_back1 = findViewById<FloatingActionButton>(R.id.btn_arrow_back1)
        val ti_preço_combustível = findViewById<TextInputEditText>(R.id.textinput_preço_combustivel)
        val btn_Próximo1 = findViewById<Button>(R.id.btn_Próximo1)

        btn_arrow_back1.setOnClickListener {

            val intentBack1 = Intent(this, a_tela_Inicial::class.java)

            startActivity(intentBack1)
        }

        btn_Próximo1.setOnClickListener {

            val preçoStr : String = ti_preço_combustível.text.toString()

            if (preçoStr== "") {

                Snackbar.make(
                    ti_preço_combustível,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG,
                )
                    .show()

            } else {

                val intent = Intent(this, c_tela_consumo_carro::class.java)

                val preçoFloat : Float = preçoStr.toFloat()

                intent.putExtra("KR_Preço",preçoFloat)

                startActivity(intent)
            }
        }
    }
}