package com.crud.pokemon.controller;

import com.crud.pokemon.entity.Pokemon;
import com.crud.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @PostMapping("/pokemon")
    private void createPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.createPokemon(pokemon);
    }
}

