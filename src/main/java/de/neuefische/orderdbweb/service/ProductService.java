package de.neuefische.orderdbweb.service;

import de.neuefische.orderdbweb.controller.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  public List<Product> getProducts() {
    return List.of(new Product("1", "Möhre"),
        new Product("2", "kartoffel"));
  }
}
