package tddAeropuesto.dominio;

import java.util.ArrayList;

public class AeroPuerto {

	String nombre;
	String direccion;
	Integer codigo;
	ArrayList<Ruta> listaDeRutas;
	
	public AeroPuerto() {
		this.listaDeRutas = new ArrayList<>();
	}
	
	public AeroPuerto(String nombre) {
		this.nombre=nombre;
		this.listaDeRutas = new ArrayList<>();
	}
	public AeroPuerto(String nombre,String direccion,Integer codigo) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.codigo=codigo;
		this.listaDeRutas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void agregarRuta(Ruta ruta) {
		listaDeRutas.add(ruta);
	}

	public Integer buscarRuta(String rutaOrigen) {
		ArrayList<Ruta> rutasOrigen = new ArrayList<>();
		for (Ruta ruta : listaDeRutas) {
			if(ruta.getOrigen().equals(rutaOrigen))
				rutasOrigen.add(ruta);
				
		}
		return rutasOrigen.size();
	}

}
