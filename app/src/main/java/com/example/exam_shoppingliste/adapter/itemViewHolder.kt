package com.example.exam_shoppingliste.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.exam_shoppingliste.R
import com.example.exam_shoppingliste.data.FoodType
import com.example.exam_shoppingliste.data.foodData
import com.google.android.material.snackbar.Snackbar


class itemViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
    val _Intitule : TextView = view.findViewById(R.id.ItemTitre)
    val _Qte : TextView = view.findViewById(R.id.ItemQte)
    val _Image : ImageView = view.findViewById(R.id.ItemImg)

    private fun AfficherNom(message: String) {
        val rootView: View = view
        val duration = Snackbar.LENGTH_SHORT
        Snackbar.make(rootView, message, duration).show()
    }

    public fun SetupData(food : foodData){
        _Intitule.text = food._Intitule
        _Qte.text = "Qte : " + food._Qte.toString()

        when (food._Type) {
            FoodType.Boisson -> {
                _Image.setImageResource(R.drawable.drink)
                _Intitule.setTextColor(ContextCompat.getColor(view.context, R.color.purple))
            }
            FoodType.Alimentation-> {
                _Image.setImageResource(R.drawable.food)
                _Intitule.setTextColor(ContextCompat.getColor(view.context, R.color.blue))
            }
            FoodType.Hygiene-> {
                _Image.setImageResource(R.drawable.health)
                _Intitule.setTextColor(ContextCompat.getColor(view.context, R.color.yellow))
            }
            FoodType.Maison-> {
                _Image.setImageResource(R.drawable.home)
                _Intitule.setTextColor(ContextCompat.getColor(view.context, R.color.pink))
            }
            else -> {
                //_Image.setImageResource(R.drawable.)
            }
        }

        view.setOnClickListener {
            val message = "Cliqué sur : ${food._Intitule}"
            AfficherNom(message)
        }
    }
}
