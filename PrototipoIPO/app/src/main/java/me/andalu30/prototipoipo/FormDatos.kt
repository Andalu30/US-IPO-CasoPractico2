package me.andalu30.prototipoipo

import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.DialogInterface
import android.view.accessibility.AccessibilityEvent
import android.widget.EditText



class FormDatos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_datos)

        var nextbutt = findViewById<Button>(R.id.buttonnex)
        val intent = Intent(this, select_hora::class.java)


        val alertDialog = AlertDialog.Builder(this@FormDatos).create()
        alertDialog.setTitle("Datos en blanco!")
        alertDialog.setMessage("El formulario no puede tener datos en blanco")
        alertDialog.setButton(
            AlertDialog.BUTTON_POSITIVE, "Continuar"
        ) { dialog, id -> startActivity(intent) }
        alertDialog.setButton(
            AlertDialog.BUTTON_NEGATIVE, "Cambiar datos"
        ) { dialog, id -> }

        nextbutt.setOnClickListener{
            alertDialog.show()
        }

    }
}
