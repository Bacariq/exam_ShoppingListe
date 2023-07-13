package com.example.exam_shoppingliste.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.exam_shoppingliste.R
import com.example.exam_shoppingliste.data.FoodType
import com.example.exam_shoppingliste.data.foodData
import com.example.exam_shoppingliste.data.itemsFood
import com.example.exam_shoppingliste.databinding.FragmentFoodDetailBinding
import com.example.exam_shoppingliste.databinding.FragmentFoodListBinding

class FoodDetailFragment : Fragment() {

    private lateinit var binding : FragmentFoodDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodDetailBinding.inflate(inflater, container, false)

        binding.DetailRadHome.setOnClickListener(){
            var myData = foodData( binding.DetailName.text.toString(), FoodType.Boisson,  binding.DetailQte.text.toString().toLong())
            if(binding.DetailRadFood.isChecked == true){
                myData._Type = FoodType.Alimentation
            }
            if(binding.DetailRadDrink.isChecked == true){
                myData._Type = FoodType.Boisson
            }
            if(binding.DetailRadHealth.isChecked == true){
                myData._Type = FoodType.Hygiene
            }
            if(binding.DetailRadHome.isChecked == true){
                myData._Type = FoodType.Maison
            }
            itemsFood.add(myData)

            //val action = FoodDetailFragmentDirections.actionFoodDetailFragmentToFoodListFragment()
            val action = R.id.action_foodDetailFragment_to_foodListFragment
            findNavController().navigate(action)
        }
        return binding.root
    }

}