package com.conley.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.conley.dao.BaseDao;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
	/**
	 * mybatisȡ�����Զ�ע�룬Ҫ�Լ�ʵ��һ��
	 * 
	 */
	@Resource  
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
		super.setSqlSessionFactory(sqlSessionFactory);  
	}  


	/**
	 * ͨ����������ȡ�������
	 * java�����Ͳ����ģ���ͨ�����䣬�ò���T����Ϣ
	 * @return
	 */
	@SuppressWarnings({"unchecked","rawtypes"})
	public String getClassName(){
		//�ڸ����еõ����������ĸ���ķ�����Ϣ  
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz = (Class) pt.getActualTypeArguments()[0];
		//�����ǻ�ȡʵ����ļ����ƣ��ٰ�����תΪСд
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
