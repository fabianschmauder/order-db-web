package de.neuefische.orderdbweb.db;

import de.neuefische.orderdbweb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDb {

  private final List<Product> products = List.of(
      new Product("1", "Möhre"),
      new Product("2", "kartoffel"),
      new Product("3", "Dumbo"));


  public List<Product> getProducts() {
    return products;
  }

  public Optional<Product> findById(String productId) {
    for (Product product : products) {
      if(product.getId().equals(productId)){
        return Optional.of(product);
      }
    }
    return Optional.empty();
  }
}
