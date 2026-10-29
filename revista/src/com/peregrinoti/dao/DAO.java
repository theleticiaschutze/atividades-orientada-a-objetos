package com.peregrinoti.dao;

import java.util.List;

public interface DAO<T> {

	Object get(Long id); //tras um registro

	List<T> getAll(); //tras toda a tabela

	int save(T t); //salva o registro

	boolean update(T t, String[] params);  //muda o registro

	boolean delete(T t);  //deleta um registro
}
