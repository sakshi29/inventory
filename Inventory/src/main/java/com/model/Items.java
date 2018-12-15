package com.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by SAKSHI TRIPATHI on 11/25/2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Items {
    private Integer id;
    private String productCode;
    private String brandName;
    private String description;
    private Integer categoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategory() {
        return categoryId;
    }

    public void setCategory(Integer category) {
        this.categoryId = category;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
