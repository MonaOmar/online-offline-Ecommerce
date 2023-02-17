package com.example.login.adapters


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.login.*
import com.example.login.model.CharItem


class AlphaAdapters(var context: Context, var arrayList: ArrayList<CharItem>) :
    RecyclerView.Adapter<AlphaAdapters.ItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_view_layout_items, parent, false)
        return ItemHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val charItem: CharItem = arrayList.get(position)

        holder.icons.setImageResource(charItem.icons!!)
        holder.titles.text = charItem.alpha



    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
        var titles = itemView.findViewById<TextView>(R.id.title_text_view)
        init {
            itemView.setOnClickListener {
                val position:Int=adapterPosition
                if (position==0){
                    var my_intent= Intent(itemView.context,detions::class.java)
                    itemView.context.startActivity(my_intent)}
                else if (position==1){
                    var my_intent1=Intent(itemView.context,product2::class.java)
                    itemView.context.startActivity(my_intent1)}
                else if (position==2){
                    var my_intent2=Intent(itemView.context,product3::class.java)
                    itemView.context.startActivity(my_intent2)}
                else if (position==3){
                    var my_intent3=Intent(itemView.context,product4::class.java)
                    itemView.context.startActivity(my_intent3)}
                else if (position==4){
                    var my_intent4=Intent(itemView.context,product5::class.java)
                    itemView.context.startActivity(my_intent4)}
                else  if( position==5){
                    var my_intent5=Intent(itemView.context,product6::class.java)
                    itemView.context.startActivity(my_intent5)}

            }
        }
    }


}
