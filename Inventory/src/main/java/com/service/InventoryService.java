package com.service;

import com.mapper.InventoryMapper;
import com.model.Category;
import com.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 11/29/2018.
 */
@Service
public class InventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;

    public List<Category> getCategories() {
        return inventoryMapper.getCategory();
    }

    public List<Items> getProductsForCategoryId(Integer categoryId) {
        return inventoryMapper.getProductsForCategoryId(categoryId);
    }
}
