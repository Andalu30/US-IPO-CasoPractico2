package me.andalu30.prototipoipo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ArrayAdapter
import android.widget.Spinner


class selectProvComis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_prov_comis)

        //Boton y activity
        var nextbutton = findViewById<Button>(R.id.select1)
        var nextbutton2 = findViewById<Button>(R.id.select2)
        var nextbutton3 = findViewById<Button>(R.id.select3)


        val intent = Intent(this, FormDatos::class.java)

        nextbutton.setOnClickListener{
            startActivity(intent)

        }
        nextbutton2.setOnClickListener{
            startActivity(intent)

        }
        nextbutton3.setOnClickListener{
            startActivity(intent)

        }

        //Spinner
        val spinner = findViewById<Spinner>(R.id.spinnerprovs)
        val adapter = ArrayAdapter.createFromResource(this, R.array.provincias, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter



    }
}
