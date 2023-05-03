package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface SuscripcionCategoriaDAO {
	
	void create(SuscripcionCategoriaDAO entity);

	List<SuscripcionCategoriaDAO> read(SuscripcionCategoriaDAO entity);

	void update(SuscripcionCategoriaDAO entity);

	void delete(SuscripcionCategoriaDAO entity);

}
