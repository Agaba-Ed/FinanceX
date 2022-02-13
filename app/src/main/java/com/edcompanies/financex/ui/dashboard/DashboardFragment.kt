package com.edcompanies.financex.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.edcompanies.financex.adapter.DashboardAdapter
import com.edcompanies.financex.data.DataManager
import com.edcompanies.financex.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.dashboardRecyclerview.layoutManager=GridLayoutManager(context,2)
        val dataset=DataManager().loadDashboardItems()
        binding.dashboardRecyclerview.adapter=DashboardAdapter(dataset)


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}