package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DniPassAmbos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dni_pass_ambos)


        var buttondni =  findViewById(R.id.buttondni) as Button
        var buttonpassi =  findViewById(R.id.buttonpass) as Button
        var buttonboth =  findViewById(R.id.buttonboth) as Button



        val intent = Intent(this, selectProvComis::class.java)

        buttondni.setOnClickListener{
            startActivity(intent)

        }
        buttonpassi.setOnClickListener{
            startActivity(intent)

        }
        buttonboth.setOnClickListener{
            startActivity(intent)

        }



    }



}
