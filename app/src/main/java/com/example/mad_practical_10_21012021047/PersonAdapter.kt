package com.example.mad_practical_10_21012021047

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import org.w3c.dom.Text

class PersonAdapter(context:Context,val array:ArrayList<Person>):ArrayAdapter<Person>(context,0,array) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
        val person_data = array.get(position)
        view.findViewById<TextView>(R.id.textview1).text=person_data.name
        view.findViewById<TextView>(R.id.textview2).text=person_data.phoneNo
        view.findViewById<TextView>(R.id.textview3).text=person_data.emailid
        view.findViewById<TextView>(R.id.textview4).text=person_data.address
        view.findViewById<MaterialButton>(R.id.material_button_2).setOnClickListener {
            Intent(parent.context,MapsActivity::class.java).putExtra("Object",person_data).apply { context.startActivity(this) }
        }
        return view
    }

}