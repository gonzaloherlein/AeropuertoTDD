package tddAeropuesto.dominio;

import java.util.ArrayList;

public class Aerolinea {
		ArrayList<AeroPuerto> aeropuertos;
		ArrayList<Vuelo> listaDeVuelos;
	
	
	public Aerolinea() {
		aeropuertos=new ArrayList<AeroPuerto>();
		listaDeVuelos=new ArrayList<Vuelo>();
	}


	public void agregarAeropuerto(AeroPuerto aeropuerto) {
		aeropuertos.add(aeropuerto);
		}
	
	public boolean buscarAeropuertoPorCodigo(Integer codigo) {
		for(AeroPuerto aeropuertito : aeropuertos) {
			if(aeropuertito.getCodigo()==codigo) {
				return true;
			}
		}
		return false;
	}
	
	public boolean buscarAeropuertoPorNombre(String nombre) {
		for(AeroPuerto aeropuertito : aeropuertos) {
			if(aeropuertito.getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean compararVuelos(Vuelo vuelo) {
		for (Vuelo vuelo1 : listaDeVuelos) {
			if(vuelo1.getOrigen().equals(vuelo.getOrigen()) && vuelo1.getDestino().equals(vuelo.getDestino()) && vuelo1.getHorario().equals(vuelo.getHorario())) {
				return true;
			}
		}
		return false;
	}
	

	public void agregarVuelo(Vuelo vuelo) {
		listaDeVuelos.add(vuelo);
	}
	
}
