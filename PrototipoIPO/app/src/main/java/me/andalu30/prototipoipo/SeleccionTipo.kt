package me.andalu30.prototipoipo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class SeleccionTipo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_tipo)


        var dnibutt =  findViewById(R.id.dni) as Button
        var niebutt =  findViewById(R.id.nie) as Button


        val intent = Intent(this, DniPassAmbos::class.java)
        val intent2 = Intent(this, selectProvComis::class.java)


        dnibutt.setOnClickListener{
            startActivity(intent)
        }
        niebutt.setOnClickListener{
            startActivity(intent2)
        }

    }

}
