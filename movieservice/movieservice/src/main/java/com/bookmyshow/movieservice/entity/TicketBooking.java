package com.bookmyshow.movieservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketBooking {

    public long ticketId; // primaryKey
    public int totalNoOfPersons;
    public User user;
    public int paymentId;
    public int showId;
}
