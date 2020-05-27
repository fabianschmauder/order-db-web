package de.neuefische.orderdbweb.controller;

import de.neuefische.orderdbweb.controller.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

  @GetMapping
  public List<Product> getProducts(){
    return List.of(new Product("1", "Möhre"),
        new Product("2", "kartoffel"),
        new Product("3", "Spargel") );
  }

}
