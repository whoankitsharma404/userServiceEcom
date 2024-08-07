package com.example.userServiceEcom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private String categoryName;
    private Double price;
    private Double weight;
    private String description;
    private String imageName;
}