package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PublicacionDAO {
	
	void create(PublicacionDAO entity);

	List<PublicacionDAO> read(PublicacionDAO entity);

	void update(PublicacionDAO entity);

	void delete(PublicacionDAO entity);

}
