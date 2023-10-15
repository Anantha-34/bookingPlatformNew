package com.example.booking.controller;

import com.example.booking.entities.Cinema;
import com.example.booking.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/cinemas/running-shows/{movieId}/{date}")
    public List<Cinema> getCinemasRunningShows(@PathVariable Long movieId, @PathVariable String date) {
        return cinemaService.getTheatersRunningShows(movieId, date);
    }
    @GetMapping("/cinemas/running-shows/")
    public List<Cinema> getCinemasRunningShows1(@RequestHeader(name ="movieId" ) Long movieId, @RequestHeader(name ="date" ) String date) {
        return cinemaService.getTheatersRunningShows(movieId, date);
    }

}
