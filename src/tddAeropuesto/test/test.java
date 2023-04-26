package tddAeropuesto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tddAeropuesto.dominio.AeroPuerto;
import tddAeropuesto.dominio.Aerolinea;
import tddAeropuesto.dominio.Ruta;
import tddAeropuesto.dominio.Vuelo;

public class test {

// 	queSpuedaBuscaarUnAeropuertoPorCodigo
//    queSpuedaBuscaarUnAeropuertoPorNombre
//    queSepuedaCambiarLaDireccionDeUnAeropuerto
//    
//    
//    QueSepUedaCrearUnaRuta
//    QueepuedaCambiarEltvDeUnaruta
//    
//    
//    queSepuedaBuscartodasLasRutasDeUnAeropuertoOrigen
//    
//    
//    queNoSePuedaCrearUnVueloConLaMismRutayQueSeSuperpongaEnELHorario	
	
	
	@Test
	public void queSePuedaBuscarUnAeropuertoPorCodigo() {
		Aerolinea aerolinea = new Aerolinea();
		AeroPuerto aeropuerto=new AeroPuerto("aerolineas","lastoninas",1);
		AeroPuerto aeropuerto2=new AeroPuerto("aerolineas2","lastoninas",2);
		AeroPuerto aeropuerto3=new AeroPuerto("aerolineas3","lastoninas",3);
		aerolinea.agregarAeropuerto(aeropuerto);
		aerolinea.agregarAeropuerto(aeropuerto2);
		aerolinea.agregarAeropuerto(aeropuerto3);

		assertTrue(aerolinea.buscarAeropuertoPorCodigo(1));
	}
	
	@Test
	public void queSePuedaBuscaarUnAeropuertoPorCodigo() {
		Aerolinea aerolinea = new Aerolinea();
		AeroPuerto aeropuerto=new AeroPuerto("aerolineas","lastoninas",1);
		AeroPuerto aeropuerto2=new AeroPuerto("aerolineas2","lastoninas",2);
		AeroPuerto aeropuerto3=new AeroPuerto("aerolineas3","lastoninas",3);
		aerolinea.agregarAeropuerto(aeropuerto);
		aerolinea.agregarAeropuerto(aeropuerto2);
		aerolinea.agregarAeropuerto(aeropuerto3);

		assertTrue(aerolinea.buscarAeropuertoPorNombre("aerolineas"));
	}
	
	@Test
	public void queSepuedaCambiarLaDireccionDeUnAeropuerto() {
		String nuevaDireccion="mardeajo";
		AeroPuerto aeropuerto=new AeroPuerto("aero","lastoninas",1);
		aeropuerto.setDireccion(nuevaDireccion);
		assertTrue(aeropuerto.getDireccion().equals(nuevaDireccion));
	}
	
	@Test
	public void QueSePuedaCrearUnaRuta() {
		Ruta rutaVuelo = new Ruta("mendoza","misiones");
		assertNotNull(rutaVuelo);
	}
	
	@Test
	public void queSePuedaCambiarElTiempoVueloDeUnaRuta() {
		Ruta nuevaRuta = new Ruta("mendoza","misiones",3);
		Integer nuevoTiempo = 5;
		
		nuevaRuta.setTiempoDeVuelo(nuevoTiempo);
		
		assertEquals(nuevoTiempo, nuevaRuta.getTiempoDeVuelo());
	}
	
	@Test
	public void queSePuedaBuscarTodasLasRutasDeOrigenDeUnAeropuerto() {
		AeroPuerto origen = new AeroPuerto();
		Ruta ruta1 = new Ruta("mendoza","misiones");
		Ruta ruta2 = new Ruta("usuhuaia","buenosAires");
		Ruta ruta3 = new Ruta("rioja","chubut");
		Ruta ruta4 = new Ruta("mendoza","salta");
		
		origen.agregarRuta(ruta1);
		origen.agregarRuta(ruta2);
		origen.agregarRuta(ruta3);
		origen.agregarRuta(ruta4);
		
		
		Integer valorEsperado = 2;
		Integer valorObtenido = origen.buscarRuta("mendoza");
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queNoSePuedaCrearUnVueloConLaMismaRutayQueSeSuperpongaEnELHorario() {
		Vuelo nuevoVuelo = new Vuelo("mendoza","misiones",3);
		Vuelo nuevoVuelo2 = new Vuelo("mendoza","misiones",3);
		Vuelo nuevoVuelo3 = new Vuelo("asd","misiasdones",7);

		Aerolinea aerolinea = new Aerolinea();
		
		aerolinea.agregarVuelo(nuevoVuelo);
		aerolinea.agregarVuelo(nuevoVuelo2);
		
		//DUDOSOOOOO
		assertFalse(aerolinea.compararVuelos(nuevoVuelo3));
	}

}
