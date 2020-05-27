package de.neuefische.orderdbweb.db;

import de.neuefische.orderdbweb.model.Order;
import de.neuefische.orderdbweb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDb {

  private final List<Order> orders = List.of(new Order("3", List.of(new Product("7", "Some Other Product"))));

  public List<Order> getAllOrders(){
    return orders;
  }
}
