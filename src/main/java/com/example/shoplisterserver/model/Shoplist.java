package com.example.shoplisterserver.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;


@Document(value = "shoplist")
@Data
public class Shoplist {
    @Id
    private String name;
    private Map<String, Integer> itemQuantity;
}
