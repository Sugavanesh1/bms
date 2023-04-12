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
public class Theatre {

    public long theatreId; // primaryKey
    public long cityId; // foreign Key
    public String name;
    public List<Screen> screenList;
}
