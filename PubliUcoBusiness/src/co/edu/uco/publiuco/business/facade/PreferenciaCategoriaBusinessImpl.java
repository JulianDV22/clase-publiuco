package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaCategoriaAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.PreferenciaCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PreferenciaCategoriaEntity;

public class PreferenciaCategoriaBusinessImpl implements PreferenciaCategoriaBusiness {

	DAOFactory daoFactory;

	public PreferenciaCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().create(entity);

	}

	@Override
	public List<PreferenciaCategoriaDomain> list(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);

		final List<PreferenciaCategoriaEntity> result = daoFactory.getPreferenciaCategoriaDAO().read(entity);

		return null;
	}

	@Override
	public void modify(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().update(entity);

	}

	@Override
	public void drop(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().delete(entity);

	}

}