package com.dicoding.firstapp

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListKpopAdapter (val listKpop: ArrayList<Kpop>) :
    RecyclerView.Adapter<ListKpopAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kpops, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListKpopAdapter.ListViewHolder, position: Int) {
        val kpop = listKpop[position]

        Glide.with(holder.itemView.context)
            .load(kpop.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = kpop.name
        holder.tvDetails.text = kpop.detail

        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Bagikan "
                + listKpop[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailKpop::class.java)
            moveDetail.putExtra(DetailKpop.EXTRA_PHOTO, kpop.photo)
            moveDetail.putExtra(DetailKpop.EXTRA_NAME, kpop.name)
            moveDetail.putExtra(DetailKpop.EXTRA_INFORMASI, kpop.detail)
            moveDetail.putExtra(DetailKpop.EXTRA_HOBY, kpop.hoby)
            moveDetail.putExtra(DetailKpop.EXTRA_MAKANAN, kpop.makanan)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listKpop.size
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgPhoto: ImageView= itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView= itemView.findViewById(R.id.tv_item_name)
        val tvDetails: TextView= itemView.findViewById(R.id.tv_item_detail)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}