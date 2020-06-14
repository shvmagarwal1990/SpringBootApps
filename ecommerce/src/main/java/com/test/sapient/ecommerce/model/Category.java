package com.test.sapient.ecommerce.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="category")
public class Category extends AuditModel{

    private String id;


    @Length(max = 20)
    @Size(max = 20, min = 5)
    private String name;
    //private Set<Product> products = new HashSet<>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @OneToMany(targetEntity=Product.class, referencedColumnName="id",mappedBy="category",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", referencedColumnName = "id", insertable = true, updatable = false)
    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }*/
}
