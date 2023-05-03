package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface ObservacionRevisionDAO {
	
	void create(ObservacionRevisionDAO entity);

	List<ObservacionRevisionDAO> read(ObservacionRevisionDAO entity);

	void update(ObservacionRevisionDAO entity);

	void delete(ObservacionRevisionDAO entity);

}
