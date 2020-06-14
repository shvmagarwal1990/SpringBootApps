package com.test.sapient.ecommerce.controller;

import com.test.sapient.ecommerce.model.Category;
import com.test.sapient.ecommerce.model.CategoryWiseProductStat;
import com.test.sapient.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("")
    public List<Category> addCategory(@RequestBody final Category category) {
        return categoryService.addCategory(category);
    }

    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable final String categoryId){
        return categoryService.getCategoryById(categoryId);
    }

    @GetMapping("/all")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }



    @DeleteMapping("/all")
    public void deleteAllCategories(){
        categoryService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteAllCategories(@PathVariable final String id){
        categoryService.deleteCategoryById(id);
    }
}
