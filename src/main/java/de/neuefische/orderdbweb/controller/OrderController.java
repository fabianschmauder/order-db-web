package de.neuefische.orderdbweb.controller;

import de.neuefische.orderdbweb.model.Order;
import de.neuefische.orderdbweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

  private final OrderService orderService;

  @Autowired
  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping
  public List<Order> getAllOrders(){
    return orderService.getAllOrders();
  }

  @PutMapping
  public Order addOrder(@RequestBody List<String> productIds){
    return orderService.addOrder(productIds);
  }

}
