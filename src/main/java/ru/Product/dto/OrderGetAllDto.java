package ru.Product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderGetAllDto {
    private UUID id;
    private List<ProductDto> product;
    private LocalDate dateTime;
    private BigDecimal totalPrice;
    private String status;
    private UserDto user;
}
