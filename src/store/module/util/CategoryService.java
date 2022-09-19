package store.module.util;

import java.util.List;

import store.module.model.Category;

public interface CategoryService {

	//列出所有商品种类
	public List<Category> selectAll() throws Exception;

}
