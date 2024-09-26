package com.aula.agendacontatorc.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aula.agendacontatorc.R
import com.aula.agendacontatorc.model.Contato
import com.aula.agendacontatorc.recyclerview.ContatoAdapter

class ContatoListaActivity : Activity() {

    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        setContentView(R.layout.contato_lista_activity_layout)

        val obj = intent.extras?.getSerializable("LISTA")
        val lista = obj as ArrayList<Contato>


        val rcvContato = findViewById<RecyclerView>(R.id.contato_rcv)
        val adaptador = ContatoAdapter(this, lista)
        rcvContato.adapter = adaptador
        rcvContato.layoutManager = LinearLayoutManager(this)
    }
}