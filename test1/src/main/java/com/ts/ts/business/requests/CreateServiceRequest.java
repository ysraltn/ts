package com.ts.ts.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateServiceRequest {
    private int productId;
    private String serviceType;
    private String status;
    private String process;
}
