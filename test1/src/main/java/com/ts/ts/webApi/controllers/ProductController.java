package com.ts.ts.webApi.controllers;

import com.ts.ts.business.abstracts.ProductService;
import com.ts.ts.business.requests.CreateProductRequest;
import com.ts.ts.business.responses.GetAllProductsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<GetAllProductsResponse> getAll(){
        return productService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addProduct(@RequestBody CreateProductRequest createProductRequest){

        productService.addProduct(createProductRequest);
    }
}
