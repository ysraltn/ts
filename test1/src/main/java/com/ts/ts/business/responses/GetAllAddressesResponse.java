package com.ts.ts.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAddressesResponse {
    private String customerTitle;
    private String address;
}
