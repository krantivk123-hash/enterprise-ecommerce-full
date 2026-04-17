
package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  private final ProductService service;

  public ProductController(ProductService service){
    this.service = service;
  }

  @GetMapping
  public List<Product> all(){
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Product get(@PathVariable Long id){
    return service.get(id);
  }

  @PostMapping
  public Product create(@RequestBody Product p){
    return service.save(p);
  }
}
