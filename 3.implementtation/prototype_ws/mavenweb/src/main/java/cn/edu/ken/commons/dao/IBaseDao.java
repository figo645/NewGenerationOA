package cn.edu.ken.commons.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IBaseDao<T, PK extends Serializable> {

	public int insert(T t);

	public int update(T t);

	public int deleteById(PK id);

	public int retireById(PK id);

	public T findById(PK id);

	public List<T> findAll();

}
