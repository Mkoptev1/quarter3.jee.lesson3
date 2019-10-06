package ru.geekbrains.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.entities.Product;
import ru.geekbrains.repositories.ProductRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.SQLException;

@WebListener
public class ContextListener implements ServletContextListener {
    public static final String PRODUCT_REPO = "productRepo";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        ProductRepository ProductRepository = new ProductRepository();
        sc.setAttribute(PRODUCT_REPO, ProductRepository);

        try {
            ProductRepository.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}