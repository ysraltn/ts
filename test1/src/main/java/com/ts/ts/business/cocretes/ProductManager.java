package com.ts.ts.business.cocretes;

import com.ts.ts.business.abstracts.ProductService;
import com.ts.ts.business.requests.CreateProductRequest;
import com.ts.ts.business.responses.GetAllProductsResponse;
import com.ts.ts.core.utilities.mappers.ModelMapperService;
import com.ts.ts.dataAccess.abstracts.ProductRepository;
import com.ts.ts.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductManager implements ProductService {
    ProductRepository productRepository;
    ModelMapperService modelMapperService;

    @Autowired
    public ProductManager(ProductRepository productRepository, ModelMapperService modelMapperService) {
        this.productRepository = productRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public void addProduct(CreateProductRequest createProductRequest) {
        Product product = this.modelMapperService.forRequest().map(createProductRequest, Product.class);
        productRepository.save(product);
    }

    @Override
    public List<GetAllProductsResponse> getAll() {
        List<Product> products = productRepository.findAll();
        List<GetAllProductsResponse> productsResponse = products.stream()
                .map(product->this.modelMapperService.forResponse()
                        .map(product, GetAllProductsResponse.class))
                .collect(Collectors.toList());
        return productsResponse;
    }
}
