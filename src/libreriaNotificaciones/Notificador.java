package libreriaNotificaciones;

import java.util.ArrayList;

public class Notificador {	
	
	private ManejadorServicios ms = new ManejadorServicios();	
	
	private ArrayList<ReglaServicioMensajes> listaServicios = new ArrayList<ReglaServicioMensajes>();
 
	public Notificador() {
		
	} 
	
	public void enviar(String mensaje, String servicio) {
		
		listaServicios = ms.recogerServicioMensaje(servicio);
				
		int i =0;
		while (i < listaServicios.size() ) {
			
			listaServicios.get(i).enviar(mensaje);
			i++;
		}
		
		
		
	}

}
