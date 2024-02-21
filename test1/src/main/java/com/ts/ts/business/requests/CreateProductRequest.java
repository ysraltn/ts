package com.ts.ts.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
    private int serialNo;
    private int ownerId;
    private int userId;
    private String brand;
    private String model;
}
