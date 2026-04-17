
package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {
  private final ProductRepository repo;

  public ProductService(ProductRepository repo){
    this.repo = repo;
  }

  public List<Product> getAll(){
    return repo.findAll();
  }

  public Product get(Long id){
    return repo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
  }

  public Product save(Product p){
    return repo.save(p);
  }
}
