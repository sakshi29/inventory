package model;

/**
 * Created by SAKSHI TRIPATHI on 11/25/2018.
 */
public class Items {
    private Integer id;
    private String productId;
    private String brandName;
    private String description;
    private Integer categoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
}
