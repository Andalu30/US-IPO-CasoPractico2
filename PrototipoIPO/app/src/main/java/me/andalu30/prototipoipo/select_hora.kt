package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class select_hora : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_hora)

        var b1 = findViewById<Button>(R.id.verde1)
        var b2 = findViewById<Button>(R.id.verde2)
        var b3 = findViewById<Button>(R.id.verde3)

        val intent = Intent(this, resumeninfo::class.java)


        b1.setOnClickListener{
            startActivity(intent)
        }
        b2.setOnClickListener{
            startActivity(intent)
        }
        b3.setOnClickListener{
            startActivity(intent)
        }
    }

}
