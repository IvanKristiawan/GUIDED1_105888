package com.example.guided4_bundle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var nim: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var mBunlde: Bundle

    lateinit var vNama: String
    lateinit var vNim: String
    lateinit var vFakultas: String
    lateinit var vProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle() {
        //mengambil bundle dari activity sebelumnya dnegan menggunakan key register
        mBunlde = intent.getBundleExtra("register")!!
        //mengambil data dari bundle
        vNama = mBunlde.getString("nama")!!
        vNim = mBunlde.getString("nim")!!
        vFakultas = mBunlde.getString("fakultas")!!
        vProdi = mBunlde.getString("prodi")!!
    }

    fun setText() {
        nama = findViewById(R.id.namaView)
        nama.setText(vNama)
        nim = findViewById(R.id.nimView)
        nim.setText(vNim)
        fakultas = findViewById(R.id.fakultasView)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.programStudiView)
        prodi.setText(vProdi)
    }
}