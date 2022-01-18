package com.example.movierating.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movierating.R
import com.example.movierating.databinding.MovieListFragmentBinding
import com.example.movierating.viewmodel.MovieListViewModel

class MovieListFragment : Fragment() {

    companion object {
        fun newInstance() = MovieListFragment()
    }

    private lateinit var viewModel: MovieListViewModel
    private lateinit var binding: MovieListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.movie_list_fragment, container, false)
        binding = MovieListFragmentBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}