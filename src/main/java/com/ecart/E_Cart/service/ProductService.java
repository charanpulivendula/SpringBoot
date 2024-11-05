package com.ecart.E_Cart.service;

import com.ecart.E_Cart.Repository.ProductRepo;
import com.ecart.E_Cart.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<Product>(Arrays.asList(new Product(101,"samsung",5000),
//            new Product(102,"apple",300),
//            new Product(103,"oneplus",500)));
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
