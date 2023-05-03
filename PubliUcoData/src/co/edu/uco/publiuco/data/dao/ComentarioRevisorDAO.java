package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface ComentarioRevisorDAO {
	
	void create(ComentarioRevisorDAO entity);

	List<ComentarioRevisorDAO> read(ComentarioRevisorDAO entity);

	void update(ComentarioRevisorDAO entity);

	void delete(ComentarioRevisorDAO entity);

}
