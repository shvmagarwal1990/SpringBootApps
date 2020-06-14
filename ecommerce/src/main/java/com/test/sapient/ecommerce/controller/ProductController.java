package com.test.sapient.ecommerce.controller;

import com.test.sapient.ecommerce.model.CategoryWiseProductStat;
import com.test.sapient.ecommerce.model.Product;
import com.test.sapient.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("")
    public List<Product> addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable final String productId)
    {
        return productService.getProductById(productId);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/aggregate")
    public List<CategoryWiseProductStat> getAllCategoriesAggregate(){

        return productService.getAllCategoriesAggregateStat();
    }
    @DeleteMapping("/all")
    public void deleteAllProducts(){
        productService.deleteAllProducts();
    }

    @DeleteMapping("/{productId}}")
    public void deleteProductById(@PathVariable final String productId){
        productService.deleteProductById(productId);
    }
}
