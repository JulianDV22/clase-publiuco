package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionBusinessImpl implements EstadoTipoRelacionInstitucionBusiness {

	private DAOFactory daoFactory;

	public EstadoTipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactoy) {
		this.daoFactory = daoFactoy;
	}

	@Override
	public final void register(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);

	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final void modify(final EstadoTipoRelacionInstitucionDomain domain) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void drop(final EstadoTipoRelacionInstitucionDomain domain) {
		// TODO Auto-generated method stub

	}

}
