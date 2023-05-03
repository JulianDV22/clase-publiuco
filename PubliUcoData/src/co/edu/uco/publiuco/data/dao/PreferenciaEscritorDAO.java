package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PreferenciaEscritorDAO {
	
	void create(PreferenciaEscritorDAO entity);

	List<PreferenciaEscritorDAO> read(PreferenciaEscritorDAO entity);

	void update(PreferenciaEscritorDAO entity);

	void delete(PreferenciaEscritorDAO entity);

}
