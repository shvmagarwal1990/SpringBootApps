package com.test.sapient.ecommerce.repo;

import com.test.sapient.ecommerce.model.CategoryWiseProductStat;
import com.test.sapient.ecommerce.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, String> {

    @Query(value = "select new com.test.sapient.ecommerce.model.CategoryWiseProductStat(product.category.id as id," +
            " max(product.price) as maxPrice," +
            " min(product.price) as minPrice, sum(product.quantity) as sumQuantity,avg(product.price) as averagePrice," +
            " count(product.name) as count) " +
            " from Product product group by product.category.id", nativeQuery = false)
    public List<CategoryWiseProductStat> findAllCategoriesAggregateStat();


}
