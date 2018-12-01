package controller;

import mapper.InventoryMapper;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.InventoryService;

import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 11/25/2018.
 */
@RestController
@RequestMapping("inventory")
public class InventoryListingResource {

    @Autowired
    private InventoryMapper inventoryMapper;

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/category")
    @Produces("application/json")
    public List<Category> getCategories(String name) {
        return inventoryService.getCategories();
    }
}
