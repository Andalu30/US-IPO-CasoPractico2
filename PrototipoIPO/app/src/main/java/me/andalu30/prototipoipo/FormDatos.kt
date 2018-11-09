package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormDatos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_datos)

        var nextbutt = findViewById<Button>(R.id.buttonnex)
        val intent = Intent(this, select_hora::class.java)

        nextbutt.setOnClickListener{
            startActivity(intent)
        }

    }
}
