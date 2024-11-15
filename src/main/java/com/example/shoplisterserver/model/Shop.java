package com.example.shoplisterserver.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "shop")
@Data
public class Shop {
    @Id
    private String name;

}
