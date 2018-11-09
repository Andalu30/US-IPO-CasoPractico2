package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class resumeninfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumeninfo)

        var confbutt = findViewById<Button>(R.id.confbutt)
        var backbutt = findViewById<Button>(R.id.atrasresumen)

        val intent = Intent(this, Confirmacion::class.java)
        val intent2 = Intent(this, select_hora::class.java)


        confbutt.setOnClickListener { startActivity(intent) }
        backbutt.setOnClickListener { startActivity(intent2) }


    }
}
