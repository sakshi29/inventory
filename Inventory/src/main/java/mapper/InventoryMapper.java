package mapper;

import model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 12/1/2018.
 */
@Mapper
public interface InventoryMapper {
    @Select("select id, categoryName, parentCategoryId from category")
    List<Category> getCategory();
}
