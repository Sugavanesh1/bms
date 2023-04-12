package com.bookmyshow.movieservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seat {

    public long seatId; // primaryKey
    public long screenId; // foreign Key
    public boolean isBooked;
    public User userId;

    public String seatName;

}
