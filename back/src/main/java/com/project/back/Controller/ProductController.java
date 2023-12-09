package com.project.back.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.back.Model.Product;
import com.project.back.Service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService ProductService;


     @GetMapping(path = "/get")
    public ResponseEntity<List<Product>> getProduct() {
        return new ResponseEntity<>(ProductService.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public String createProduct(@RequestBody Product product) {
       ProductService.createProduct(product);
        return "Saved";
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        ProductService.deleteProduct(id);
        return "Deleted";
    }

    @PatchMapping(path = "/update/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product){
        ProductService.updateProduct(id, product);
        return "Updated";
    }
}
