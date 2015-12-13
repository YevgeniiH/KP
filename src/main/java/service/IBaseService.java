package service;

import domain.Base;

import java.util.List;

public interface IBaseService<T extends Base> {

	public void add(T t);
	
	public void del(Integer id);
	
	public void edit(T t);
	
	public T get(Integer id);
	
	public List<T> list();
	
}
