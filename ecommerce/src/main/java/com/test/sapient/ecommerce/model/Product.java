package com.test.sapient.ecommerce.model;

import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="product")
public class Product extends AuditModel{

    private String id;
    private String name;
    private String description;
    private Category category;
    private BigDecimal price;
    private int quantity;
    private String version;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name="category_id", referencedColumnName = "id", insertable = true, updatable = false, nullable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
