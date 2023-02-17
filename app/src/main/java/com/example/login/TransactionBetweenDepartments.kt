package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.login.adapters.AlphaAdapters
import com.example.login.model.CharItem

class TransactionBetweenDepartments : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<CharItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_between_departments)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapters(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters
    }
    private fun setAlphas(): ArrayList<CharItem> {

        var arrayList: ArrayList<CharItem> = ArrayList()

        arrayList.add(CharItem(R.drawable.img1, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img3, "iphone"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img7, "television"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))
        arrayList.add(CharItem(R.drawable.img1, "samsung"))


        return arrayList

    }
}