package com.example.vaccine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var ki:CheckBox
    private lateinit var ara:CheckBox
    private lateinit var name:EditText
    private lateinit var send:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ki = findViewById(R.id.ki)
        ara = findViewById(R.id.ara)
        name= findViewById(R.id.name)
        send = findViewById(R.id.send)

        send.setOnClickListener {
            if((ki.isChecked && !ara.isChecked || !ki.isChecked && ara.isChecked ) && name.text.toString() == ""){
                Toast.makeText(this, "უპასუხეთ ორივე შეკითხვას!", Toast.LENGTH_SHORT).show()
            }
            if (ara.isChecked && name.text.toString() !== ""){
                Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
            }
        }
    }
}