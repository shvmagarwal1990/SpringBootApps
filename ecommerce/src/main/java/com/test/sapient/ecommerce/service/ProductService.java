package com.test.sapient.ecommerce.service;

import com.test.sapient.ecommerce.model.CategoryWiseProductStat;
import com.test.sapient.ecommerce.model.Product;
import com.test.sapient.ecommerce.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("productService")
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> addProduct(Product product){
        productRepository.save(product);
        return (List) productRepository.findAll();
    }

    public Product getProductById(String productId) {
        return productRepository.findById(productId).orElse(null) ;
    }

    public List<Product> getAllProducts() {
        return (List)productRepository.findAll();
    }

    public void deleteAllProducts() {
        productRepository.deleteAll();
    }

    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }

    public List<CategoryWiseProductStat> getAllCategoriesAggregateStat() {
        return productRepository.findAllCategoriesAggregateStat();
    }
}
