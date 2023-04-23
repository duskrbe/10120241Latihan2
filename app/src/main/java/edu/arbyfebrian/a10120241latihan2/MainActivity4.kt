package edu.arbyfebrian.a10120241latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//Tanggal Pengerjaan : 24-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnSend = findViewById<Button>(R.id.bt_send)

        btnSend.setOnClickListener {
            Intent(this, MainActivity5::class.java).also {
                startActivity(it)
            }
        }
    }
}