package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface LectorDAO {
	
	void create(LectorDAO entity);

	List<LectorDAO> read(LectorDAO entity);

	void update(LectorDAO entity);

	void delete(LectorDAO entity);

}
