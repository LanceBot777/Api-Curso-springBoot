package com.platzi_play.web.controller;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.domain.dto.SuggestRequestDto;
import com.platzi_play.domain.dto.UpdateMovieDto;
import com.platzi_play.domain.service.MovieService;
import com.platzi_play.domain.service.PlatziPlayAiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping ("/movies")
@Tag(name = "Pelis", description = "Operaciones sobre peliculas")
public class MovieController {

    private final MovieService movieService;
    private final PlatziPlayAiService  aiService;


    public MovieController(MovieService movieService,  PlatziPlayAiService aiService) {

        this.movieService = movieService;
        this.aiService = aiService;
    }

    @GetMapping // Ya no es necesario pasar el parametro dado a que automaticamente lee /movies
    public ResponseEntity<List<MovieDto>> findAll() {

        return ResponseEntity.ok(this.movieService.getAllMovies());
    }


    @GetMapping("/{id}")
    @Operation(
            summary = "Obtener una pelicula por su ID",
            description = "Retorna una pelicula segun el ID enviado",
            responses = {
                    @ApiResponse(responseCode = "200" , description = "Pelicula encontrada"),
                    @ApiResponse(responseCode = "404" , description = "Pelicula no encontrada", content = @Content)
            }
    )
    public ResponseEntity<MovieDto> findById(@Parameter(description = "Identificador de la pelicula a recuperar",
            example = "3") @PathVariable Long id) {

        MovieDto movieDto = this.movieService.getById(id);

        if (movieDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(movieDto);
    }
    /*
    @PostMapping ("/suggest")
    public ResponseEntity<String> generateMoviesSuggestion(@RequestBody SuggestRequestDto suggestRequestDto) {

        return ResponseEntity.ok(this.aiService.generateMovieSuggestion(suggestRequestDto.userPreferences()));
    }

     */

    @PostMapping
    public ResponseEntity<List<MovieDto>> add(@RequestBody MovieDto movieDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonList(this.movieService.addMovie(movieDto)));
    }

    @PutMapping ("/{id}")
    public  ResponseEntity<MovieDto> update(@PathVariable Long id, @RequestBody @Valid UpdateMovieDto updateMovieDto) {

    return ResponseEntity.ok(this.movieService.updateMovie(id, updateMovieDto));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        this.movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }
}
