package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface RevisorDAO {
	
	void create(RevisorDAO entity);

	List<RevisorDAO> read(RevisorDAO entity);

	void update(RevisorDAO entity);

	void delete(RevisorDAO entity);

}
