package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface ComentarioLectorDAO {
	
	void create(ComentarioLectorDAO entity);

	List<ComentarioLectorDAO> read(ComentarioLectorDAO entity);

	void update(ComentarioLectorDAO entity);

	void delete(ComentarioLectorDAO entity);

}
