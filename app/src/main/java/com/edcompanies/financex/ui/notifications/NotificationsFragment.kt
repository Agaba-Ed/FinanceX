package com.edcompanies.financex.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.edcompanies.financex.adapter.NotificationsAdapter
import com.edcompanies.financex.data.DataManager
import com.edcompanies.financex.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.notifRecyclerview.layoutManager=LinearLayoutManager(context)
        val dataset=DataManager().loadNotifications()
        binding.notifRecyclerview.adapter=NotificationsAdapter(dataset)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}