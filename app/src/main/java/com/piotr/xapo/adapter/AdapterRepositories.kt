package com.piotr.xapo.adapter

import android.os.Build
import java.util.ArrayList
import android.view.LayoutInflater
import android.view.View
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.ImageView
import com.piotr.xapo.databinding.RowRepositoryBinding
import com.piotr.xapo.model.Repository

public class AdapterRepositories : RecyclerView.Adapter<AdapterRepositories.AdapterViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null
    private var data: MutableList<Repository> = ArrayList()

    override fun getItemCount(): Int = data.size

    interface OnItemClickListener {
        fun onItemClick(position: Int, item: Repository, image: View)
    }


    class AdapterViewHolder(val view: RowRepositoryBinding) : RecyclerView.ViewHolder(view.root) {
        val image: ImageView = view.ivProfile
    }


    fun setData(newData: List<Repository>) {
        val dataSize: Int = data.size
        data.clear()
        notifyItemRangeRemoved(0, dataSize)
        data.addAll(newData)
        notifyItemRangeInserted(0, data.size)
        Log.e("XXX", "Set data " + newData.size)
    }


    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): AdapterViewHolder {
        val row: RowRepositoryBinding = RowRepositoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AdapterViewHolder(row);

    }

    override fun onBindViewHolder(viewHolder: AdapterViewHolder, position: Int) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            viewHolder.image.transitionName = "profile_$position"
        }
        viewHolder.itemView.setOnClickListener {
            if (onItemClickListener != null)
                onItemClickListener?.onItemClick(position, data.get(position), viewHolder.image);
        }

        val repository: Repository = data.get(position)
        viewHolder.view.repository = repository

    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

}
                