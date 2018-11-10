package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_miscitas.*

class miscitas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miscitas)


        var boton1 = findViewById<Button>(R.id.button2)
        var boton2 = findViewById<Button>(R.id.button4)
        var boton3 = findViewById<Button>(R.id.button5)
        var boton4 = findViewById<Button>(R.id.button6)
        var boton5 = findViewById<Button>(R.id.button7)

        val intent = Intent(this, borracita::class.java)

        boton1.setOnClickListener { startActivity(intent) }
        boton2.setOnClickListener { startActivity(intent) }
        boton3.setOnClickListener { startActivity(intent) }
        boton4.setOnClickListener { startActivity(intent) }
        boton5.setOnClickListener { startActivity(intent) }




    }
}
