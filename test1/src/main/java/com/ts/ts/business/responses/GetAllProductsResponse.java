package com.ts.ts.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductsResponse {
    private int id;
    private int serialNo;
    private String ownerTitle;
    private String userTitle;
    private String brand;
    private String model;
}
