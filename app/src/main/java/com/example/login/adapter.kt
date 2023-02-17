package com.example.login

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*
import java.time.Instant


class adapter(val userlist:ArrayList<data>):RecyclerView.Adapter<adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: data = userlist[position]
        holder.name.text=data.derpartment
        holder.myImages.setImageResource(data.image)
    }


    override fun getItemCount(): Int {
        return userlist.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        init{
            itemView.setOnClickListener{
                val position:Int=adapterPosition
                if(position==0){
                    var my_intent=Intent(itemView.context,TransactionBetweenDepartments::class.java)
                    itemView.context.startActivity(my_intent)}
                else if(position==1){

                    var my_intent2=Intent(itemView.context,Clothes::class.java)
                    itemView.context.startActivity(my_intent2)
                }
                else if(position==2){var my_intent3=Intent(itemView.context,Electronics::class.java)
                    itemView.context.startActivity(my_intent3)}
                else if(position==3){
                    var my_intent4=Intent(itemView.context,DairyProducts::class.java)
                    itemView.context.startActivity(my_intent4)
                }
                else if(position==4){
                    var my_intent5=Intent(itemView.context,FruitsAndVegetables::class.java)
                    itemView.context.startActivity(my_intent5)
                }
                else{
                    var my_intent4=Intent(itemView.context,Frozenprodcts::class.java)
                    itemView.context.startActivity(my_intent4)
                }

        }
        }

        val myImages=itemView.cardlist as ImageView
        val name=itemView.textlist as TextView


    }



}