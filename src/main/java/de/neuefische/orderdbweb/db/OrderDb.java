package de.neuefische.orderdbweb.db;

import de.neuefische.orderdbweb.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDb {

  private final List<Order> orders = new ArrayList<>();

  public List<Order> getAllOrders(){
    return orders;
  }

  public void addOrder(Order newOrder) {
    this.orders.add(newOrder);
  }
}
