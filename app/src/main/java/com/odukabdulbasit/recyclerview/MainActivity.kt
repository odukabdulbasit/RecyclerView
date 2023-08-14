package com.odukabdulbasit.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.odukabdulbasit.data.ItemModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private val itemList = mutableListOf<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create sample data
        itemList.add(ItemModel("Item 1"))
        itemList.add(ItemModel("Item 2"))
        itemList.add(ItemModel("Item 3"))
        itemList.add(ItemModel("Item 4"))
        itemList.add(ItemModel("Item 5"))
        itemList.add(ItemModel("Item 6"))

        itemAdapter = ItemAdapter(itemList)
        recyclerView.adapter = itemAdapter
    }
}