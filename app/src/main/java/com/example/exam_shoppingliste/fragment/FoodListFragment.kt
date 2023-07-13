package com.example.exam_shoppingliste.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam_shoppingliste.R
import com.example.exam_shoppingliste.adapter.itemAdapter
import com.example.exam_shoppingliste.data.itemsFood
import com.example.exam_shoppingliste.databinding.ActivityMainBinding
import com.example.exam_shoppingliste.databinding.FragmentFoodListBinding

class FoodListFragment : Fragment() {

    private lateinit var binding : FragmentFoodListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodListBinding.inflate(inflater, container, false)
        setupRecyclerView()
        return binding.root
    }




    private fun setupRecyclerView() {
        val recyclerView = binding.foodRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, RecyclerView.VERTICAL, false)
        val adapter = itemAdapter(itemsFood)
        recyclerView.adapter = adapter
    }

}