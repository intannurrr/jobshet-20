package com.example.jobshet20intan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<siswa>()
    val listnama = arrayOf(
        "IBNU RIF'AN",
        "JIHAN SALWA FITRIANI",
        "KHOTIMATUS SA'ADAH",
        "LADA'ARDI SACHIO LAWIDY",
        "LATIFAH IRSYADIAH",
        "MAULIDA INTAN NUR AINI",
        "MIFTAKHUL JANNAH",
        "MUH ASA SUSILO FARIKH",
        "MUHAMMAD HAIKAL",
        "MUHAMMAD RIFQIL KHANIF",
        "NABHAN AFLAHU SYAFIQ"
    )

    val listNis = arrayOf(
        "2997",
        "3000",
        "3002",
        "3003",
        "3005",
        "3008",
        "3010",
        "3011",
        "3013",
        "3015",
        "3017"
    )

    lateinit var makananView: RecyclerView
    lateinit var  makananAdapter: makananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.nama)
        makananView.layoutManager = LinearLayoutManager( this)

        for (i in listnama.indices){
            list.add(siswa(listnama[i], listNis[i]))
        }

        makananAdapter = makananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}