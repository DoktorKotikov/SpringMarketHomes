package com.geek.lesson2.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private ProductRepository productRepository;
    private List<Product> productsCart;
    @Autowired
    public Cart(ProductRepository productRepository, List<Product> productsCart) {
        this.productRepository = productRepository;
        this.productsCart = productsCart;
    }

    public void saveProductToCartByID(Long id){
        productsCart.add(productRepository.getProductById(id));
    }

    public void deleteProductFromCartById(Long id){
        productsCart.removeIf(product -> product.getId().equals(id));
    }

    @Override
    public String toString() {
        return "Cart{" +
                " productsCart=" + productsCart +
                '}';
    }
}
