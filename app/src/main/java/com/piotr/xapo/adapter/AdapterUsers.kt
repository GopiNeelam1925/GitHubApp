package com.piotr.xapo.adapter

import android.os.Build
import com.piotr.xapo.model.User
import java.util.ArrayList
import android.view.LayoutInflater
import android.view.View
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.piotr.xapo.databinding.RowUserBinding

public class AdapterUsers : RecyclerView.Adapter<AdapterUsers.AdapterViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null
    private var data: MutableList<User> = ArrayList()

    init {
        setHasStableIds(true)
    }

    override fun getItemId(position: Int): Long = data.get(position).id.toLong()
    override fun getItemCount(): Int = data.size

    interface OnItemClickListener {
        fun onItemClick(position: Int, item: User, image: View): Unit
    }


    class AdapterViewHolder(val view: RowUserBinding) : RecyclerView.ViewHolder(view.root) {
        val image: ImageView = view.ivProfile
    }


    fun setData(newData: List<User>) {
        val dataSize: Int = data.size
        data.clear()
        notifyItemRangeRemoved(0, dataSize)
        data.addAll(newData)
        notifyItemRangeInserted(0, data.size)
    }


    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): AdapterViewHolder {
        val row: RowUserBinding = RowUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

        val user: User = data.get(position)
        viewHolder.view.user = user

    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

}
                