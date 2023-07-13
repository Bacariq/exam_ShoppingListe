package com.example.exam_shoppingliste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.exam_shoppingliste.data.itemsFood
import com.example.exam_shoppingliste.databinding.ActivityMainBinding
import com.example.exam_shoppingliste.fragment.FoodListFragmentDirections
import androidx.navigation.fragment.findNavController
import com.example.exam_shoppingliste.fragment.FoodDetailFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(itemsFood.size == 0){
            binding.fragmentContainerView.visibility = View.INVISIBLE
            binding.ArticlesCount.visibility = View.VISIBLE
        }
        else {
            binding.fragmentContainerView.visibility = View.VISIBLE
            binding.ArticlesCount.visibility = View.INVISIBLE
        }

        binding.btnAdd.setOnClickListener(){
            val action = FoodListFragmentDirections.actionFoodListFragmentToFoodDetailFragment()
            findNavController(R.id.fragmentContainerView).navigate(action)
        }
    }

}