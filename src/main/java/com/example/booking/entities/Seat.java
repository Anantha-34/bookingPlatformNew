package com.example.booking.entities;

import jakarta.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

//    @Column(name = "row_number", columnDefinition = "INTEGER")
//    private Integer seatNumber;

//    @ManyToOne
//    @JoinColumn(name = "cinema_hall_id")
//        private CinemaHall cinemaHall;

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

//    public Integer getSeatNumber() {
//        return seatNumber;
//    }
//
//    public void setSeatNumber(Integer seatNumber) {
//        this.seatNumber = seatNumber;
//    }

//    public CinemaHall getCinemaHall() {
//        return cinemaHall;
//    }
//
//    public void setCinemaHall(CinemaHall cinemaHall) {
//        this.cinemaHall = cinemaHall;
//    }
}