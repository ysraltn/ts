package com.ts.ts.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomersResponse {
    private int id;
    private long customerNo;
    private String title;
    private List<GetAllAddressesResponse> addresses;
    private List<GetAllProductsResponse> ownProducts;
    private List<GetAllProductsResponse> useProducts;
}
