package ru.Product.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CategoryDto {
    private UUID id;
    private String name;
    private String image;
}
