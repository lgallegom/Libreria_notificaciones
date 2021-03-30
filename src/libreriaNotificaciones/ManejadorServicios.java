package libreriaNotificaciones;

import java.util.ArrayList;

public class ManejadorServicios {
	
	private ReglaServicioMensajes superior;
	private ArrayList<ReglaServicioMensajes> listaServicios = new ArrayList<ReglaServicioMensajes>();
	
	

	public ManejadorServicios() {
		
	}
	
	public ArrayList<ReglaServicioMensajes> recogerServicioMensaje(String servicio){
		
		ReglaServicioMensajes servicioSMSempresarial = new ServicioSMSEmpresarial();
		ReglaServicioMensajes serviciosms = new ServicioSMS(servicioSMSempresarial);
		ReglaServicioMensajes serviciofb = new ServicioFacebook(serviciosms);
		ReglaServicioMensajes serviciocorreo = new ServicioCorreo(serviciofb); 
		superior = serviciocorreo; 		 
		
		return superior.buscarServicio(servicio, listaServicios);
		
		
	}

}
