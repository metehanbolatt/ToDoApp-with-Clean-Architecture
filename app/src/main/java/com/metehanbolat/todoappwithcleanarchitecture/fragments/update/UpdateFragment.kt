package com.metehanbolat.todoappwithcleanarchitecture.fragments.update

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.metehanbolat.todoappwithcleanarchitecture.R

class UpdateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)

        return inflater.inflate(R.layout.fragment_update, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_fragment_menu, menu)
    }

}