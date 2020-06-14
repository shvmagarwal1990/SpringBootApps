package com.test.sapient.ecommerce.model;

import java.math.BigDecimal;

public class CategoryWiseProductStat {

    private String id;
    private BigDecimal maxPrice;
    private BigDecimal minPrice;
    private long sumQuantity;
    private double averagePrice;
    private long count;

    public CategoryWiseProductStat(String id, BigDecimal maxPrice, BigDecimal minPrice, long sumQuantity,
                                   double averagePrice, long count) {
        this.id = id;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.sumQuantity = sumQuantity;
        this.averagePrice = averagePrice;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public long getSumQuantity() {
        return sumQuantity;
    }

    public void setSumQuantity(int sumQuantity) {
        this.sumQuantity = sumQuantity;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public long getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
