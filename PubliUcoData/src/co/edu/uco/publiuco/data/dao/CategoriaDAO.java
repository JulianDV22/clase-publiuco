package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface CategoriaDAO {
	
	void create(CategoriaDAO entity);

	List<CategoriaDAO> read(CategoriaDAO entity);

	void update(CategoriaDAO entity);

	void delete(CategoriaDAO entity);

}
