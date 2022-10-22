package com.example.pokemonapi.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapi.databinding.ItemPokemonListBinding
import com.example.pokemonapi.models.PokemonModel

class PokemonListAdapter(private val list: MutableList<PokemonModel>) :
    RecyclerView.Adapter<PokemonListAdapter.PokemonListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListViewHolder =
        PokemonListViewHolder(
            ItemPokemonListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class PokemonListViewHolder(private val binding: ItemPokemonListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.tvName.text = model.name
        }

    }
}