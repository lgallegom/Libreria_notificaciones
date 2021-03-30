package libreriaNotificaciones;

import java.util.ArrayList;

public class ServicioFacebook extends ReglaServicioMensajes {

	private ReglaServicioMensajes superior;

	public ServicioFacebook(ReglaServicioMensajes superior) {
		super();
		this.superior = superior;
	}

	@Override
	public void enviar(String mensaje) {
		System.out.println("Este mensaje fue enviado a todos las cuentas FACEBOOK asociados: " + "--" + mensaje + "--");

	}

	@Override
	public ArrayList<ReglaServicioMensajes> buscarServicio(String servicio,
			ArrayList<ReglaServicioMensajes> objserviciosenviarmensaje) {

		if (servicio.equals("2") || servicio.equals("todo")) {
			ServicioFacebook sf = new ServicioFacebook(superior);

			objserviciosenviarmensaje.add(sf);
			System.out.println(objserviciosenviarmensaje.size() + "faceboo");
			return superior.buscarServicio(servicio, objserviciosenviarmensaje);

		} else {
			return superior.buscarServicio(servicio, objserviciosenviarmensaje);
		}

	}

}
