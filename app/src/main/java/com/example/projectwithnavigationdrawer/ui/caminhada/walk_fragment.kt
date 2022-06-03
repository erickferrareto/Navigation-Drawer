package com.example.projectwithnavigationdrawer.ui.caminhada

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.projectwithnavigationdrawer.R

class walk_fragment : Fragment() {

    private lateinit var seekBarVolume: SeekBar
    private lateinit var textResult: TextView
    private lateinit var textKm: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val numero = 0
        seekBarVolume.findViewById<SeekBar>(R.id.seekBar)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_walk_fragment, container, false)
    }

    companion object {

    }
}