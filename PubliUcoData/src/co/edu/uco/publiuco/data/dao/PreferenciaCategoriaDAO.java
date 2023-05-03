package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PreferenciaCategoriaDAO {
	
	void create(PreferenciaCategoriaDAO entity);

	List<PreferenciaCategoriaDAO> read(PreferenciaCategoriaDAO entity);

	void update(PreferenciaCategoriaDAO entity);

	void delete(PreferenciaCategoriaDAO entity);

}
