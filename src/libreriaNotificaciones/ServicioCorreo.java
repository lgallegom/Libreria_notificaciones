package libreriaNotificaciones;

import java.util.ArrayList;

public class ServicioCorreo extends ReglaServicioMensajes {

	private ReglaServicioMensajes superior;

	public ServicioCorreo(ReglaServicioMensajes superior) {
		super();
		this.superior = superior;

	}

	@Override
	public void enviar(String mensaje) {
		System.out.println("Este mensaje fue enviado a todos los CORREOS asociados: " + "--" + mensaje + "--");

	}

	@Override
	public ArrayList<ReglaServicioMensajes> buscarServicio(String servicio,
			ArrayList<ReglaServicioMensajes> objserviciosenviarmensaje) {

		if (servicio.equals("1") || servicio.equals("todo")) {
			ServicioCorreo sc = new ServicioCorreo(superior);
			
			objserviciosenviarmensaje.add(sc);
			
			System.out.println(objserviciosenviarmensaje.size() + "correo");
			
			return superior.buscarServicio(servicio, objserviciosenviarmensaje);
		} else {
			return superior.buscarServicio(servicio, objserviciosenviarmensaje);
		}

	}

}
