package de.neuefische.orderdbweb.service;

import de.neuefische.orderdbweb.model.Product;
import de.neuefische.orderdbweb.db.ProductDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  private final ProductDb productDb;

  @Autowired
  public ProductService(ProductDb productDb) {
    this.productDb = productDb;
  }

  public List<Product> getProducts() {
    return productDb.getProducts();
  }
}
