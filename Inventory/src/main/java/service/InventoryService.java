package service;

import model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 11/29/2018.
 */
@Service
public interface InventoryService {
    List<Category> getCategories();
}
