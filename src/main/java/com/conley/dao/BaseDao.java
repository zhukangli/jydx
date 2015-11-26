package com.conley.dao;

import java.util.List;

/**
 * 
 * @author zhukangli
 *
 */
public interface BaseDao<T> {
	public List<T> findAll();
	public void add(T t);
	public void deleteById(String id);
	public void update(T t);
	public List<T> findByIds(String ids);
	public T findById(String id);

}
