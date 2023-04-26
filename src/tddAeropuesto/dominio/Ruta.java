package tddAeropuesto.dominio;

import java.time.LocalDate;

public class Ruta {

	String origen;
	String destino;
	//LocalDate tiempoDeVuelo;
	Integer tiempoDeVuelo;
	
	public Ruta() {
		
	}
	
	
	public Ruta(String origen, String destino) {
		this.origen=origen;
		this.destino=destino;
	}
	
	public Ruta(String origen, String destino, Integer tiempoDeVuelo) {
		this.origen=origen;
		this.destino=destino;
		this.tiempoDeVuelo = tiempoDeVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getTiempoDeVuelo() {
		return tiempoDeVuelo;
	}

	public void setTiempoDeVuelo(Integer tiempoDeVuelo) {
		this.tiempoDeVuelo = tiempoDeVuelo;
	}
	
	
}
