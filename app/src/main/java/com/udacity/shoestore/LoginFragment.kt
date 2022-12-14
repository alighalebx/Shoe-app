package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.udacity.shoestore.databinding.FragmentLoginBinding



class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding : FragmentLoginBinding = DataBindingUtil.inflate(
        inflater, R.layout.fragment_login, container, false)
        //The complete onClickListener with Navigation
//        binding.signInButton.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_loginFragment_to_welcomeScreen)
//        }

        binding.signInButton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_welcomeScreen))
        return binding.root
    }

}