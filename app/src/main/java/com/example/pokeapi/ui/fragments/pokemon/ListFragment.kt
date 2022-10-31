package com.example.pokeapi.ui.fragments.pokemon

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.pokeapi.base.BaseFragment
import com.example.pokeapi.ui.adapters.PokemonAdapter
import com.example.pokemonapi.R
import com.example.pokemonapi.databinding.FragmentListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : BaseFragment<FragmentListBinding, ListViewModel>(R.layout.fragment_list) {

    override val binding by viewBinding(FragmentListBinding::bind)
    override val viewModel: ListViewModel by viewModels()
    private val adapter = PokemonAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvListPokemon.adapter = adapter
    }

    override fun setupSubscribes() {
        viewModel.fetchPokemonName().subscribe(
            onSuccess = {
                adapter.submitList(it.result)
            },
            onError = {
                Log.e("pokemon", it )
            }
        )
    }
}

