package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface CalificacionDAO {
	
	void create(CalificacionDAO entity);

	List<CalificacionDAO> read(CalificacionDAO entity);

	void update(CalificacionDAO entity);

	void delete(CalificacionDAO entity);

}
