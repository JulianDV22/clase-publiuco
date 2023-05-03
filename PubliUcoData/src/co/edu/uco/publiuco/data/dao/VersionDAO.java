package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface VersionDAO {
	
	void create(VersionDAO entity);

	List<VersionDAO> read(VersionDAO entity);

	void update(VersionDAO entity);

	void delete(VersionDAO entity);

}
