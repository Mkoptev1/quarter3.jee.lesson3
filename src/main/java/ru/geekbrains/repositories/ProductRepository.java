package ru.geekbrains.repositories;

import ru.geekbrains.entities.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
  public List<Product> findAll() throws SQLException {
    List<Product> productList = new ArrayList<>();
    productList.add( new Product(1L, "Шуба", 100L));
    productList.add( new Product(2L, "Пальто", 200L));
    productList.add( new Product(3L, "Куртка", 300L));
    productList.add( new Product(4L, "Кофта", 150L));
    productList.add( new Product(5L, "Брюки", 250L));
    productList.add( new Product(6L, "Кеды", 350L));
    productList.add( new Product(7L, "Шарф", 170L));
    productList.add( new Product(8L, "Шляпа", 290L));
    productList.add( new Product(9L, "Кепка", 370L));
    return productList;
    }
}