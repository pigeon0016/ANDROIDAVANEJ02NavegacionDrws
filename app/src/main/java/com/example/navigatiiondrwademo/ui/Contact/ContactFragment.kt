package com.example.navigatiiondrwademo.ui.Contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewTreeLifecycleOwner
import com.example.navigatiiondrwademo.databinding.FragmentContactBinding
import com.example.navigatiiondrwademo.databinding.FragmentGalleryBinding
import com.example.navigatiiondrwademo.ui.home.HomeViewModel
import java.util.zip.Inflater

class ContactFragment : Fragment() {
    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val contactViewModel = ViewModelProvider(this).get(ContactViewModel::class.java)

        _binding = FragmentContactBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textContact
        contactViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}