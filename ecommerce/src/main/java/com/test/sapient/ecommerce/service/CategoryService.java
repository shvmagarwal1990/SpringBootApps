package com.test.sapient.ecommerce.service;

import com.test.sapient.ecommerce.controller.CategoryController;
import com.test.sapient.ecommerce.model.Category;
import com.test.sapient.ecommerce.model.CategoryWiseProductStat;
import com.test.sapient.ecommerce.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> addCategory(Category category) {
        try {
            categoryRepository.save(category);
        }
        catch(Exception e){
            e.printStackTrace();
            throw new DataIntegrityViolationException("DataIntegrityViolationException occured");
        }
        return (List) categoryRepository.findAll();
    }

    public List<Category> getAllCategories() {
        return (List)categoryRepository.findAll();
    }

    public Category getCategoryById(String categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    public void deleteCategoryById(String id) {
        categoryRepository.deleteById(id);
    }

}
