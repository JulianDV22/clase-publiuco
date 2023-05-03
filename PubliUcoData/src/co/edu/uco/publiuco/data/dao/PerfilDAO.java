package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PerfilDAO {
	
	void create(PerfilDAO entity);

	List<PerfilDAO> read(PerfilDAO entity);

	void update(PerfilDAO entity);

	void delete(PerfilDAO entity);

}
