package com.app.binaryveda
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapterLP(private val mList: List<LandingPageModel>) : RecyclerView.Adapter<CustomAdapterLP.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lp_row, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]
        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.textViewheading.text = ItemsViewModel.textheading
        holder.textViewdescription.text = ItemsViewModel.textdescription
    }
    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv)
        val textViewheading: TextView = itemView.findViewById(R.id.tv_heading)
        val textViewdescription: TextView = itemView.findViewById(R.id.tv_description)
    }
}