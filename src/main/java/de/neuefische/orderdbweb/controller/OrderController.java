package de.neuefische.orderdbweb.controller;

import de.neuefische.orderdbweb.model.Order;
import de.neuefische.orderdbweb.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

  @GetMapping
  public List<Order> getAllOrders(){
    return List.of(new Order("1", List.of(new Product("7", "Some Product"))));
  }

}
