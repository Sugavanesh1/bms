package com.bookmyshow.movieservice.entity.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateMovie {

    String movieName;
}
