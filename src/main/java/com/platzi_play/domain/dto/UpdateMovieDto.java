package com.platzi_play.domain.dto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "El titulo es obligatorio") // maneja vacios
        String title,

        @PastOrPresent(message = "La fecha de lanzamiento no debe pasar la fecha actual")
        LocalDate releaseDate,

        @Min(value = 0, message = "El rating no debe ser menor a 0")
        @Max(value = 5, message = "El rating no debe ser mayor a 5")
        Double rating

) {
}
