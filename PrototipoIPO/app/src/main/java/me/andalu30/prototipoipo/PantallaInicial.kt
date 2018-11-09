package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PantallaInicial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicial)

        var boton =  findViewById(R.id.button) as Button

        val intent = Intent(this, SeleccionTipo::class.java)

        boton.setOnClickListener{
            startActivity(intent)

        }

    }




}
