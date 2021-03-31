package libreriaNotificaciones;

import java.util.ArrayList;

public class ManejadorServicios {
	
	private ReglaServicioMensajes superior;
	private ArrayList<ReglaServicioMensajes> listaServicios = new ArrayList<ReglaServicioMensajes>();
	
	

	public ManejadorServicios() {
		
	}
	
	public ArrayList<ReglaServicioMensajes> recogerServicioMensaje(String servicio){
	
	// Se instancian las clases correspondientes a cada tipo de notificacion, pasando por parametro el servicio 
	//siguiente con el fin de cumplir una cadena de responsabilidades y preguntar a cada servicio si ejecuta la 
	//peticion o la pasa
		
		ReglaServicioMensajes servicioSMSempresarial = new ServicioSMSEmpresarial();
		ReglaServicioMensajes serviciosms = new ServicioSMS(servicioSMSempresarial);
		ReglaServicioMensajes serviciofb = new ServicioFacebook(serviciosms);
		ReglaServicioMensajes serviciocorreo = new ServicioCorreo(serviciofb); 
		superior = serviciocorreo; 		 
		
		return superior.buscarServicio(servicio, listaServicios);
		
		
	}

}
