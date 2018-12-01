package impl;

import mapper.InventoryMapper;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import service.InventoryService;

import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 11/29/2018.
 */
public class InventoryServiceImpl implements InventoryService{
   @Autowired
   private InventoryMapper inventoryMapper;

    public List<Category> getCategories() {
        return inventoryMapper.getCategory();
    }
}
