package com.example.shoplisterserver.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "item")
@Data
public class Item {
    @Id
    private String name;
    private String shop;
    private String measure;

}
