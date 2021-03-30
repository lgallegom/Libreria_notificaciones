package libreriaNotificaciones;

import java.util.ArrayList;

public class ServicioSMS extends ReglaServicioMensajes {

	private ReglaServicioMensajes superior;

	public ServicioSMS(ReglaServicioMensajes superior) {
		super();
		this.superior = superior;
	}

	@Override
	public void enviar(String mensaje) {
		System.out.println("Este mensaje fue enviado a todos los SMS asociados: " + "--" + mensaje + "--");

	}

	@Override
	public ArrayList<ReglaServicioMensajes> buscarServicio(String servicio,
			ArrayList<ReglaServicioMensajes> objserviciosenviarmensaje) {

		if (servicio.equals("3") || servicio.equals("todo")) {
			ServicioSMS sms = new ServicioSMS(superior);

			objserviciosenviarmensaje.add(sms);
			System.out.println(objserviciosenviarmensaje.size() + "sms");

			return superior.buscarServicio(servicio, objserviciosenviarmensaje);

		} else {
			return superior.buscarServicio(servicio, objserviciosenviarmensaje);
		}

	}

}
