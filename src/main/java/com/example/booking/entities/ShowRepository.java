package com.example.booking.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {

    List<Show> findByMovieIdAndStartTimeGreaterThanEqual(Long movieId, LocalDate date);
}
