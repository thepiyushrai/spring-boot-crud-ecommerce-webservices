package com.sha.springbootproductseller.repository;

import com.sha.springbootproductseller.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author piyush
 * @date 18.12.2021

 */
public interface ProductRepository extends JpaRepository<Product, Long>
{
}
