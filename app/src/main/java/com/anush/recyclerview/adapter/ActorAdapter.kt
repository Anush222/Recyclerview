package com.anush.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anush.recyclerview.R
import com.anush.recyclerview.model.Actor
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class ActorAdapter(
    val lstActors: ArrayList<Actor>,
    val context:Context

) :
RecyclerView.Adapter<ActorAdapter.ActorViewHolder>()
{
    class ActorViewHolder(view: View)
        : RecyclerView.ViewHolder(view){

        val imgprofile: CircleImageView
        val tvName: TextView
        val tvAddress: TextView
        val tvsalary: TextView

        init {
            imgprofile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvsalary = view.findViewById(R.id.tvSalary)

        }
    }

    //view tanne kam

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.actor_layout,parent,false)
        return ActorViewHolder(view)

    }


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
//Data tanne kam
    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
    val actor = lstActors[position]
    holder.tvName.text = actor.actorName
    holder.tvAddress.text = actor.actorAddress
    holder.tvsalary.text = actor.actorSalary.toString()

    Glide.with(context)
        .load(actor.actorImage)
        .into(holder.imgprofile)
        TODO("Not yet implemented")
    }
}