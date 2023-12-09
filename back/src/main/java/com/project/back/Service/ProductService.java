package com.project.back.Service;

import java.util.Collection;
import java.util.List;

import com.project.back.Model.Product;

public interface ProductService {

    public abstract String createProduct(Product product);

    public abstract String updateProduct(int id, Product product);

    public abstract String deleteProduct(int id);
    
    public abstract Collection<Product> getProducts();

    List<Product> findAll();
}
