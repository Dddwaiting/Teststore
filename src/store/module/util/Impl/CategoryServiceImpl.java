package store.module.util.Impl;

import java.util.List;

import store.module.dao.Impl.BaseDaoImpl;
import store.module.util.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	
	//查询所有分类
	@Override
	public List selectAll() throws Exception {
		BaseDaoImpl dao = new BaseDaoImpl();
		List list = dao.select("select id,name from category where 1=1 and del_flag='0' ", 2, null);
		if (!list.isEmpty()) {
			return list;
		}
		return null;
	}

}
