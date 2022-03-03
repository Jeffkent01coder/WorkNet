package com.example.worknet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worknet.R
import com.example.worknet.databinding.ActivityMyWorkBinding
import com.example.worknet.model.WorkData
import com.example.worknet.workAdapter.WorkAdapter

class MyWork : AppCompatActivity() {
    private lateinit var binding: ActivityMyWorkBinding
    lateinit var workAdapter: WorkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMyWorkBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        workAdapter = WorkAdapter(workData())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = workAdapter
    }

    fun workData(): ArrayList<WorkData> {
        return arrayListOf<WorkData>(
            WorkData(R.drawable.fw, "1. Farm Work:", "See More"),
            WorkData(R.drawable.ow, "2. Office Work:", "See More"),
            WorkData(R.drawable.tw, "3. Fence Cutting:", "See More"),
            WorkData(R.drawable.wo, "4. Planting: ", "See More"),
            WorkData(R.drawable.ss, "5. Harvesting:", "See More"),
            WorkData(R.drawable.dd, "6.  Programming: ", "See More"),
            WorkData(R.drawable.me, "7.  Compound Cleaning: ", "See More"),
            WorkData(R.drawable.ccw, "8. Office Work: ", "See More"),
            WorkData(R.drawable.km, "9. Contract Work :", "See More"),
            WorkData(R.drawable.ow, "10. Manual Work:", "See More")
        )
    }
}