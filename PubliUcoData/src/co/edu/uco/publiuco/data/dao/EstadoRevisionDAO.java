package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface EstadoRevisionDAO {
	
	void create(EstadoRevisionDAO entity);

	List<EstadoRevisionDAO> read(EstadoRevisionDAO entity);

}
