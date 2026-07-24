package com.platzi_play.domain.service;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.domain.dto.UpdateMovieDto;
import com.platzi_play.domain.repository.MovieRepository;
import com.platzi_play.persistence.entity.MovieEntity;
import dev.langchain4j.agent.tool.Tool;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

   // @Tool ("Busca todas las peliculas que existan en la plataforma")
    public List<MovieDto> getAllMovies() {
        return this.movieRepository.getAllMovies();
    }

    public MovieDto getById(Long id) {
            return this.movieRepository.findMovieById(id);
        }

    public MovieDto addMovie(MovieDto movieDto) { return this.movieRepository.saveMovie(movieDto); }

    public MovieDto updateMovie(long id, UpdateMovieDto updateMovieDto) {
        return this.movieRepository.updateMovie(id, updateMovieDto);
    }

    public void deleteMovie(long id) {
        this.movieRepository.deleteMovie(id);
    }
}
