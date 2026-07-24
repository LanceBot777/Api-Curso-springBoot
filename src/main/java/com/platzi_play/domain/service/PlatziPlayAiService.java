package com.platzi_play.domain.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {

    //ACA PODEMOS INGRESAR UN PROM
    @UserMessage ("""
            Genera un saludo de bienvenida a la plataforma de Gestion de Peliculas {{plataform}}.
            Usa menos de 120 caracteres y hazlo con el estilo PLatzi.
            """)
    String generateGreeting(@V("plataform") String plataform);

    /*
    @SystemMessage (""" 
    Eres un en cine que recomienda los del usuario.
    Debes recomendar måximo 3
    No que estén por fuera de la Platz iPlay.

            """)
    String generateMovieSuggestion(@UserMessage String userMessage);
    */
}
