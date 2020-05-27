package de.neuefische.orderdbweb.service;

import de.neuefische.orderdbweb.model.Order;
import de.neuefische.orderdbweb.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


  public List<Order> getAllOrders(){
    return List.of(new Order("3", List.of(new Product("7", "Some Product"))));
  }
}
