package com.bookmyshow.movieservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Show {

    public long showId; // primaryKey
    public String name;
    public String showTime;
    public Movie movie;
    public Screen screen;
    public List<Seat> seatList;



}
