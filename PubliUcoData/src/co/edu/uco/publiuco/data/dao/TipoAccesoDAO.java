package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface TipoAccesoDAO {
	
	void create(TipoAccesoDAO entity);

	List<TipoAccesoDAO> read(TipoAccesoDAO entity);
	
	void update(TipoAccesoDAO entity);

	void delete(TipoAccesoDAO entity);

}
