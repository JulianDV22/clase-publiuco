package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface EscritorPublicacionDAO {
	
	void create(EscritorPublicacionDAO entity);

	List<EscritorPublicacionDAO> read(EscritorPublicacionDAO entity);

	void update(EscritorPublicacionDAO entity);

	void delete(EscritorPublicacionDAO entity);

}
