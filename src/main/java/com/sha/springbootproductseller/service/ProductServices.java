package com.sha.springbootproductseller.service;

import com.sha.springbootproductseller.model.Product;

import java.util.List;

public interface ProductServices
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
