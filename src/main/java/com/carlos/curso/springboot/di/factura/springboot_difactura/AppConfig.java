package com.carlos.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.carlos.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.carlos.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean("default")
    // @Primary
    List<Item> itemsInvoice() {
        
        Product p1= new Product("Piano Stainway & Sons", 500);
        Product p2= new Product("Piano Yamaha", 5000);
        Product p3= new Product("Piano Designed By Stainway", 1500);
        List<Item> items = Arrays.asList(new Item(p1,2),new Item(p2,3), new Item(p3,6));
        return items;

    }

    @Bean
    List<Item> itemsInvoiceGuitar() {
        
        Product p1= new Product("Guitarra Alhambra", 200);
        Product p2= new Product("Guitarra Yamaha",150);
        List<Item> items = Arrays.asList(new Item(p1,1),new Item(p2,2));
        return items;

    }

}
