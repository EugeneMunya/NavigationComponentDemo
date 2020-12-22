package com.example.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation

class FragmentB : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.send_btn).setOnClickListener {
            val message:String = view.findViewById<EditText>(R.id.message_txt).text.toString()
            if(message.isNotEmpty()){
                var action = FragmentBDirections.actionFragmentBToFragmentC(message)
                Navigation.findNavController(view).navigate(action)


            }else{
                Toast.makeText(activity,"Please not text you wrote", Toast.LENGTH_SHORT).show()
            }
        }

    }


}