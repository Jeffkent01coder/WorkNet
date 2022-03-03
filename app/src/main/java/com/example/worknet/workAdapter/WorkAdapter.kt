package com.example.worknet.workAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.worknet.databinding.WorkItemBinding
import com.example.worknet.model.WorkData

class WorkAdapter(val workData: ArrayList<WorkData>): RecyclerView.Adapter<WorkAdapter.WorkViewHolder>(){

    inner class WorkViewHolder(val myItem : WorkItemBinding) : RecyclerView.ViewHolder(myItem.root){
        fun bind(song:WorkData){
            myItem.ivWorkImage.setImageResource(song.wImg)
            myItem.workMore.text = song.wViewMOre
            myItem.workName.text = song.wTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val item = WorkItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WorkViewHolder(item)
    }

    override fun onBindViewHolder(holder: WorkViewHolder, position: Int) {
        holder.bind(workData[position])
    }

    override fun getItemCount(): Int {
        return workData.size
    }

}