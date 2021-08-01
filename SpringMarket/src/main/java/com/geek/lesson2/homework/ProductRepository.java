package com.geek.lesson2.homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>(Arrays.asList(
             new Product(1L, "Sprite", 30),
             new Product(2L, "Fanta", 40),
             new Product(3L, "Cola", 50),
             new Product(4L, "MTN", 60),
             new Product(5L, "7UP", 70)

        ));
    }

    public List<Product> findAll(){
        return products;
    }


    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }


}
