package com.example.booking.service;

import com.example.booking.entities.Cinema;
import com.example.booking.entities.CinemaRepository;
import com.example.booking.entities.Show;
import com.example.booking.entities.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private ShowRepository showRepository;

    public List<Cinema> getTheatersRunningShows(Long movieId, String date) {
        List<Show> shows = showRepository.findByMovieIdAndStartTimeGreaterThanEqual(movieId, LocalDate.parse(date));

        List<Cinema> theaters = new ArrayList<>();
        for (Show show : shows) {
            theaters.add(show.getCinemaHall().getCinema());
        }

        return theaters;
    }
}
