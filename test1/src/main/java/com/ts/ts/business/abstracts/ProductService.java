package com.ts.ts.business.abstracts;

import com.ts.ts.business.requests.CreateProductRequest;
import com.ts.ts.business.responses.GetAllProductsResponse;

import java.util.List;

public interface ProductService {
    public void addProduct(CreateProductRequest createProductRequest);
    public List<GetAllProductsResponse> getAll();
}
