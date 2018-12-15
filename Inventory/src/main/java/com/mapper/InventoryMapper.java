package com.mapper;

import com.model.Category;
import com.model.Items;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by SAKSHI TRIPATHI on 12/1/2018.
 */
@Mapper
public interface InventoryMapper {
    @Select("select id, name as categoryName, parent_category_id as parentCategoryId from categories")
    List<Category> getCategory();

    @Select("select id, product_code as productCode, brand_name as brandName, description, category_id as categoryId from product where category_id = #{categoryId}")
    List<Items> getProductsForCategoryId(Integer categoryId);
}
