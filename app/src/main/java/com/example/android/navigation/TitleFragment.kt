package com.example.android.navigation


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // binding object to inflate the fragment's view
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
                inflater, R.layout.fragment_title, container, false)

        // bind button to set onClickListener with Navigation
//        binding.playButton.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//        }
        binding.apply {
            playButton.setOnClickListener { view: View ->
                view.findNavController()
                        .navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
            }

            rulesButton.setOnClickListener { view: View ->
                view.findNavController()
                        .navigate(R.id.action_titleFragment_to_rulesFragment)
            }

            aboutButton.setOnClickListener { view: View ->
                view.findNavController()
                        .navigate(R.id.action_titleFragment_to_aboutFragment)
            }
        }

        // set options menu
        setHasOptionsMenu(true)

        // Log.i()
        Log.i("TitleFragment", "onCreateView() CALLED")

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("TitleFragment", "onAttached() CALLED")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TitleFragment", "onCreate() CALLED")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("TitleFragment", "onActivityCreated() CALLED")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TitleFragment", "onStart() CALLED")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TitleFragment", "onResume() CALLED")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TitleFragment", "onPause() CALLED")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TitleFragment", "onStop() CALLED")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("TitleFragment", "onDestroyView() CALLED")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("TitleFragment", "onDetach() CALLED")
    }


    //----- Inflate options_menu res file -----//
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
                view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

}
