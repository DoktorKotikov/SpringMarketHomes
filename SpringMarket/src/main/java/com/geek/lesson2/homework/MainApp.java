package com.geek.lesson2.homework;

import com.geek.lesson2.homework.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart1 = context.getBean(Cart.class);
        Cart cart2 = context.getBean(Cart.class);


        cart1.saveProductToCartByID(1L);
        cart1.saveProductToCartByID(2L);
        cart2.saveProductToCartByID(3L);
        cart2.saveProductToCartByID(4L);
        cart2.saveProductToCartByID(5L);
        System.out.println(cart1);
        System.out.println(cart2);

        cart1.deleteProductFromCartById(1L);
        cart2.deleteProductFromCartById(4L);
        cart2.deleteProductFromCartById(5L);

        System.out.println(cart1);
        System.out.println(cart2);
        context.close();
    }
}
