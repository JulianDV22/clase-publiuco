package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface RevisorRevisionDAO {

	void create(RevisorRevisionDAO entity);

	List<RevisorRevisionDAO> read(RevisorRevisionDAO entity);

	void update(RevisorRevisionDAO entity);

	void delete(RevisorRevisionDAO entity);

}
