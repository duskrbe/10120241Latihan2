package edu.arbyfebrian.a10120241latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//Tanggal Pengerjaan : 23-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btnReg2 = findViewById<Button>(R.id.bt_register)

        btnReg2.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }
    }
}