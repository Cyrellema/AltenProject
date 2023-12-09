package com.project.back.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.back.Model.Product;
import com.project.back.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepo;

    @Override
    public String createProduct(Product product) {
        productRepo.save(product);
        return "/product";
    }

    @Override
    public String updateProduct(int id, Product product) {
        Product oldProduct = productRepo.findById(id).get();

        if (product.getName() != null) {
            oldProduct.setName(product.getName());
        }
        if (product.getCode() != null) {
            oldProduct.setCode(product.getCode());
        }
        if (product.getDescription() != null) {
            oldProduct.setDescription(product.getDescription());
        }
        if (product.getCategory() != null) {
            oldProduct.setCategory(product.getCategory());
        }
        if (product.getInventoryStatus() != null) {
            oldProduct.setInventoryStatus(product.getInventoryStatus());
        }
        if (product.getPrice() != oldProduct.getPrice()) {
            oldProduct.setPrice(product.getPrice());
        }
        if (product.getQuantity() != oldProduct.getQuantity()) {
            oldProduct.setQuantity(product.getQuantity());
        }
        if (product.getId() != oldProduct.getId()) {
            oldProduct.setId(product.getId());
        }
        if (product.getImage() != null) {
            oldProduct.setImage(product.getImage());
        }
        productRepo.save(oldProduct);
        return "/product";
    }

    @Override
    public String deleteProduct(int id) {
        productRepo.deleteById(id);
        return "/product";
    }

    @Override
    public List<Product> getProducts() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }
}
