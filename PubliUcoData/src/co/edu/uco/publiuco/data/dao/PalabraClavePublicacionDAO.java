package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PalabraClavePublicacionDAO {
	
	void create(PalabraClavePublicacionDAO entity);

	List<PalabraClavePublicacionDAO> read(PalabraClavePublicacionDAO entity);

	void update(PalabraClavePublicacionDAO entity);

	void delete(PalabraClavePublicacionDAO entity);

}
