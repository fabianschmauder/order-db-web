package de.neuefische.orderdbweb.service;

import de.neuefische.orderdbweb.db.OrderDb;
import de.neuefische.orderdbweb.db.ProductDb;
import de.neuefische.orderdbweb.model.Order;
import de.neuefische.orderdbweb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

  private final OrderDb orderDb;
  private final ProductDb productDb;

  @Autowired
  public OrderService(OrderDb orderDb, ProductDb productDb) {
    this.orderDb = orderDb;
    this.productDb = productDb;
  }

  public List<Order> getAllOrders(){
    return orderDb.getAllOrders();
  }

  public Order addOrder(List<String> productIds) {
    List<Product> productsToOrder = new ArrayList<>();

    for (String productId : productIds) {
      Product product = productDb.findById(productId);
      productsToOrder.add(product);
    }


    String uuid = UUID.randomUUID().toString();
    Order newOrder = new Order(uuid, productsToOrder);
    orderDb.addOrder(newOrder);
    return newOrder;
  }
}
