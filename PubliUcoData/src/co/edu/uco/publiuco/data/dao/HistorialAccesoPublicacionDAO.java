package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface HistorialAccesoPublicacionDAO {
	
	void create(HistorialAccesoPublicacionDAO entity);

	List<HistorialAccesoPublicacionDAO> read(HistorialAccesoPublicacionDAO entity);

	void update(HistorialAccesoPublicacionDAO entity);

	void delete(HistorialAccesoPublicacionDAO entity);

}
