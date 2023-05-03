package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface TipoEscritorDAO {
	
	void create(TipoEscritorDAO entity);

	List<TipoEscritorDAO> read(TipoEscritorDAO entity);
	
	void update(TipoEscritorDAO entity);

	void delete(TipoEscritorDAO entity);

}
