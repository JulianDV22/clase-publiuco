package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface TipoIdentificacionDAO {
	
	void create(TipoIdentificacionDAO entity);

	List<TipoIdentificacionDAO> read(TipoIdentificacionDAO entity);
	
	void update(TipoIdentificacionDAO entity);

	void delete(TipoIdentificacionDAO entity);

}
