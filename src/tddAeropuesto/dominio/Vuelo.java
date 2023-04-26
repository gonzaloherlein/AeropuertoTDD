package tddAeropuesto.dominio;

public class Vuelo {
	
	Integer horario;
	String origen;
	String destino;
	
	public Vuelo() {
		
	}
	
	public Vuelo(String origen, String destino,Integer horario) {
		this.origen = origen;
		this.destino = destino;
		this.horario = horario;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
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
	
	
	
}
