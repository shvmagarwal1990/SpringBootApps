package com.test.sapient.ecommerce.repo;

import com.test.sapient.ecommerce.model.Category;
import com.test.sapient.ecommerce.model.CategoryWiseProductStat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryRepository")
public interface CategoryRepository extends CrudRepository<Category,String> {

}
