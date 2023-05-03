package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface EscritorDAO {
	
	void create(EscritorDAO entity);

	List<EscritorDAO> read(EscritorDAO entity);

	void update(EscritorDAO entity);

	void delete(EscritorDAO entity);

}
