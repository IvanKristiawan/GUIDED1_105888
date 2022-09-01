package com.example.guided4_bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import  com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nama: TextInputEditText
    private lateinit var nim: TextInputEditText
    private lateinit var fakultas: TextInputEditText
    private lateinit var prodi: TextInputEditText
    private lateinit var btnRegister: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.namaTextField)
        nim = findViewById(R.id.nimTextField)
        fakultas = findViewById(R.id.fakultasTextField)
        prodi = findViewById(R.id.programStudiTextField)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener{
            val intent = Intent(this,NextActivity::class.java)
            val mBundle = Bundle()
            //memasukkan data ke dalam bundle
            mBundle.putString("nama", nama.text.toString())
            mBundle.putString("nim", nim.text.toString())
            mBundle.putString("fakultas", fakultas.text.toString())
            mBundle.putString("prodi", prodi.text.toString())
            //melakukan intent dengan memanggil bundle
            intent.putExtra("register",mBundle)

            startActivity(intent)
        }

    }
}