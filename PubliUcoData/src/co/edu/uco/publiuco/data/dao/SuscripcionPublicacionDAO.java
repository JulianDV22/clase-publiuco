package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface SuscripcionPublicacionDAO {
	
	void create(SuscripcionPublicacionDAO entity);

	List<SuscripcionPublicacionDAO> read(SuscripcionPublicacionDAO entity);

	void update(SuscripcionPublicacionDAO entity);

	void delete(SuscripcionPublicacionDAO entity);

}
