package co.edu.uco.publiuco.data.dao;

import java.util.List;

public interface PlanCategoriaDAO {
	
	void create(PlanCategoriaDAO entity);

	List<PlanCategoriaDAO> read(PlanCategoriaDAO entity);

	void update(PlanCategoriaDAO entity);

	void delete(PlanCategoriaDAO entity);

}
