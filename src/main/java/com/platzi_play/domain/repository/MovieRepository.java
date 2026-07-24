package com.platzi_play.domain.repository;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.domain.dto.UpdateMovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAllMovies();
    MovieDto findMovieById(Long id);
    MovieDto saveMovie(MovieDto movieDto);
    MovieDto updateMovie(long id , UpdateMovieDto updateMovieDto);
    void deleteMovie(long id);
}
