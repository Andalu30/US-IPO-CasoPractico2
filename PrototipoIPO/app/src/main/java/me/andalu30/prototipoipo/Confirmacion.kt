package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.io.BufferedReader

class Confirmacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        var fin = findViewById<Button>(R.id.fin)
        val intent = Intent(this, PantallaInicial::class.java)


        fin.setOnClickListener {

            Toast.makeText(this, "Se ha confirmado su cita", Toast.LENGTH_LONG).show()
            startActivity(intent) }

    }
}
