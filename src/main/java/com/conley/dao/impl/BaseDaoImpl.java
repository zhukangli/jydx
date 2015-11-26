package com.conley.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.conley.dao.BaseDao;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
	/**
	 * mybatis取消了自动注入，要自己实现一下
	 * 
	 */
	@Resource  
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
		super.setSqlSessionFactory(sqlSessionFactory);  
	}  


	/**
	 * 通过反射来获取类的名字
	 * java是类型擦除的，不通过反射，得不到T的信息
	 * @return
	 */
	@SuppressWarnings({"unchecked","rawtypes"})
	public String getClassName(){
		//在父类中得到子类声明的父类的泛型信息  
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz = (Class) pt.getActualTypeArguments()[0];
		//这里是获取实体类的简单名称，再把类名转为小写
		return clazz.getSimpleName().toString().toLowerCase();

	}
	public List<T> findAll() {
		return getSqlSession().selectList(getClassName()+".findAll");
	}

	public void add(T t) {
		// TODO Auto-generated method stub

	}

	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	public void update(T t) {
		// TODO Auto-generated method stub

	}

	public List<T> findByIds(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
