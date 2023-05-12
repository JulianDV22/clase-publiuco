package co.edu.uco.publiuco.crosscutting.utils;

public final class Messages {

	private Messages() {
	}

	public static final class UtilSqlMessages {

		private UtilSqlMessages() {
		}

		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION = "Se ha presentado un excepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SECURITY_EXCEPTION = "Se ha presentado un SecurityExcepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION = "Se ha presentado un NullPointerExcepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSE_USER_MESSAGE = "Se ha presentado un problema tratando de cerrar la conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_CLOSE_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSE_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la conexion estaba abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTED_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una transaccion esta activa o no";
		public static final String COMMIT_IS_STARTED_TECHNICAL_AUTOCOMMIT = "No es posible validar si se ha iniciado la transaccion, verificar si esta se encuentra en True";
		public static final String COMMIT_IS_STARTED_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la transaccion esta activa. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTED_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la transaccion esta activa. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTING_USER_MESSAGE = "Se ha presentado un problema tratando de validar la transaccion inicial";
		public static final String CONFIRM_COMMIT_USER_MESSAGE = "Se ha presentado un problema tratando de validar la confirmacion de la transaccion";
		public static final String CANCEL_COMMIT_USER_MESSAGE = "Se ha presentado un problema tratando de validar la cancelacion de transaccion";
		public static final String COMMIT_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar la transaccion. Por favor valida la traza de errores completa de la excepcion presentada...";
	}

	public static final class EstadoTipoRelacionInstitucionFacadeImplMessages {

		private EstadoTipoRelacionInstitucionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de relacion para una institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de relacion para una institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class AdministradorCategoriaFacadeImplMessages {

		private AdministradorCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del estado del administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del estado del administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CalificacionFacadeImplMessages {

		private CalificacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar una nueva CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar una CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar una CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar una CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CategoriaAdministradorCategoriaFacadeImplMessages {

		private CategoriaAdministradorCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar una nueva CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar una CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar una CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar una CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CategoriaFacadeImplMessages {

		private CategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar una nueva CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar una CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar una CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar una CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class ComentarioLectorFacadeImplMessages {

		private ComentarioLectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class ComentarioRevisorFacadeImplMessages {

		private ComentarioRevisorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EscritorFacadeImplMessages {

		private EscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EscritorPublicacionFacadeImplMessages {

		private EscritorPublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoAdministradorCategoriaFacadeImplMessages {

		private EstadoAdministradorCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoCategoriaFacadeImplMessages {

		private EstadoCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoComentarioLectorFacadeImplMessages {

		private EstadoComentarioLectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un comentario de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un comentario de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoEscritorFacadeImplMessages {

		private EstadoEscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoLectorFacadeImplMessages {

		private EstadoLectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoLectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoObservacionRevisorFacadeImplMessages {

		private EstadoObservacionRevisorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la observacion del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoObservacionRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la observacion del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoObservacionRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoPlanFacadeImplMessages {

		private EstadoPlanFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del plan. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoPlanDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del plan. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoPlanDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoPreferenciaFacadeImplMessages {

		private EstadoPreferenciaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la preferencia. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoPreferenciaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la preferencia. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoPreferenciaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoPublicacionFacadeImplMessages {

		private EstadoPublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoRevisionFacadeImplMessages {

		private EstadoRevisionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoRevisorFacadeImplMessages {

		private EstadoRevisorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoSuscripcionFacadeImplMessages {

		private EstadoSuscripcionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la suscripcion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoSuscripcionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la suscripcion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoSuscripcionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoTipoAccesoFacadeImplMessages {

		private EstadoTipoAccesoFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoTipoEscritorFacadeImplMessages {

		private EstadoTipoEscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

}
