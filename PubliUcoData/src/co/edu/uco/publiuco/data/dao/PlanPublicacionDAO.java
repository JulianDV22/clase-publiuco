package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PlanPublicacionDAO {
	
	void create(PlanPublicacionDAO entity);

	List<PlanPublicacionDAO> read(PlanPublicacionDAO entity);

	void update(PlanPublicacionDAO entity);

	void delete(PlanPublicacionDAO entity);

}
