package me.andalu30.prototipoipo

import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class borracita : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_borracita)

        var anulacita = findViewById<Button>(R.id.anulabutt)
        val intent = Intent(this, PantallaInicial::class.java)

        val alertDialog = AlertDialog.Builder(this@borracita).create()
        alertDialog.setTitle("Confirme la operacion")
        alertDialog.setMessage("Esta seguro de que desea anular sus citas")
        alertDialog.setButton(
            AlertDialog.BUTTON_POSITIVE, "Si"
        ) { dialog, id -> startActivity(intent) }
        alertDialog.setButton(
            AlertDialog.BUTTON_NEGATIVE, "No"
        ) { dialog, id -> }


        anulacita.setOnClickListener { alertDialog.show() }


    }
}
