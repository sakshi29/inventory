package com.controller;

import com.model.Category;
import com.model.Items;
import com.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 11/25/2018.
 */

@RestController
@RequestMapping("/inventory")
public class InventoryListingResource {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/category")
    public List<Category> getCategories() {
        return inventoryService.getCategories();
    }

    @GetMapping("/{categoryId}/product")
    public List<Items> getProductForCategory(@PathVariable("categoryId") Integer categoryId) {
        System.out.println("id" + categoryId);
        return inventoryService.getProductsForCategoryId(categoryId);
    }
}
