package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface RevisionDAO {
	
	void create(RevisionDAO entity);

	List<RevisionDAO> read(RevisionDAO entity);

	void update(RevisionDAO entity);

	void delete(RevisionDAO entity);

}
