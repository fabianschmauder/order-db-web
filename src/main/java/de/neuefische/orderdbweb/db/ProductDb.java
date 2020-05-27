package de.neuefische.orderdbweb.db;

import de.neuefische.orderdbweb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDb {

  private final List<Product> products = List.of(
      new Product("1", "Möhre"),
      new Product("2", "kartoffel"),
      new Product("3", "Dumbo"));


  public List<Product> getProducts() {
    return products;
  }

  public Product findById(String productId) {
    for (Product product : products) {
      if(product.getId().equals(productId)){
        return product;
      }
    }
    return null;
  }
}
