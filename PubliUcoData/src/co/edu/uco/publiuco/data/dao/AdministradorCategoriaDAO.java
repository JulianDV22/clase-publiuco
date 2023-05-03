package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface AdministradorCategoriaDAO {
	
	void create(AdministradorCategoriaDAO entity);

	List<AdministradorCategoriaDAO> read(AdministradorCategoriaDAO entity);

	void update(AdministradorCategoriaDAO entity);

	void delete(AdministradorCategoriaDAO entity);

}
