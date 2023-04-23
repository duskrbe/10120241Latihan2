package edu.arbyfebrian.a10120241latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//Tanggal Pengerjaan : 24-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnVer = findViewById<Button>(R.id.bt_verify)

        btnVer.setOnClickListener {
            Intent(this, MainActivity4::class.java).also {
                startActivity(it)
            }
        }
    }
}