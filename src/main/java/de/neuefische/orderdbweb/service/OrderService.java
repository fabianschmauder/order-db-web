package de.neuefische.orderdbweb.service;

import de.neuefische.orderdbweb.db.OrderDb;
import de.neuefische.orderdbweb.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

  private final OrderDb orderDb;

  @Autowired
  public OrderService(OrderDb orderDb) {
    this.orderDb = orderDb;
  }

  public List<Order> getAllOrders(){
    return orderDb.getAllOrders();
  }
}
