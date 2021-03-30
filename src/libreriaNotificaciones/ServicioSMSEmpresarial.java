package libreriaNotificaciones;

import java.util.ArrayList;

public class ServicioSMSEmpresarial extends ReglaServicioMensajes {

	public ServicioSMSEmpresarial() {
		super();
	}

	@Override
	public void enviar(String mensaje) {
		System.out.println("Este mensaje fue enviado a todos los SMS EMPRESARIAL asociados: " + "--" + mensaje + "--");
	}

	@Override
	public ArrayList<ReglaServicioMensajes> buscarServicio(String servicio,
			ArrayList<ReglaServicioMensajes> objserviciosenviarmensaje) {

		if (servicio.equals("4") || servicio.equals("todo")) {
			ServicioSMSEmpresarial smse = new ServicioSMSEmpresarial();

			objserviciosenviarmensaje.add(smse);
			System.out.println(objserviciosenviarmensaje.size() + "smsE");
			return objserviciosenviarmensaje;
		} else {
			return objserviciosenviarmensaje;
		}

	}

}
