package com.ts.ts.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllServicesRespond {
    private int id;
    private int productId;
    private int serialNo;
    private String brand;
    private String model;
    private String ownerTitle;
    private String userTitle;
    private String serviceType;
    private String status;
    private String process;
}
