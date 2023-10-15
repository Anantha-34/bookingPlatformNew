package com.example.booking.controller;

import com.example.booking.entities.Cinema;
import com.example.booking.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/cinemas/running-shows/{movieId}/{date}")
    public List<Cinema> getCinemasRunningShows(@PathVariable Long movieId, @PathVariable String date) {
        return cinemaService.getTheatersRunningShows(movieId, date);
    }

}
