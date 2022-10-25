package com.crud.pokemon.services;

import com.crud.pokemon.entity.Pokemon;
import com.crud.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//esto es una update a proposito
@Service("/PokemonServices")
public class PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;

    public void createPokemon(Pokemon Pokemon){
        pokemonRepository.save(Pokemon);

    }
    public void verPokemon(){

    }
    public void deletePokemon(Integer id){

    }

    public void updatePokemon(Integer id){

    }

}

