package com.ecart.E_Cart.controller;

import com.ecart.E_Cart.model.Product;
import com.ecart.E_Cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping ("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
