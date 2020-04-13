package com.springgcpgradle.models;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;
    private String description;
}
