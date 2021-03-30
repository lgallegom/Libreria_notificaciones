package libreriaNotificaciones;

import java.util.ArrayList;

public abstract class ReglaServicioMensajes {

	public ReglaServicioMensajes() {

	}

	public abstract void enviar(String mensaje);

	public abstract ArrayList<ReglaServicioMensajes> buscarServicio(String servicio,
			ArrayList<ReglaServicioMensajes> listaServicios);

}
