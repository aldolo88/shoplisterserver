package com.example.shoplisterserver.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "measure")
@Data
public class Measure {
    @Id
    private String name;

}
