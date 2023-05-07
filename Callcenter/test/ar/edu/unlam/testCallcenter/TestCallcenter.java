package ar.edu.unlam.testCallcenter;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

import ar.edu.unlam.callcenter.Contacto;
import ar.edu.unlam.callcenter.Provincias;
import ar.edu.unlam.callcenter.SistemaCall;

public class TestCallcenter {

	@Test
	public void queSePuedanAgregarClientesALaBaseDeDatos() {
		
		SistemaCall contactos = new SistemaCall();
		
		Contacto cliente = new Contacto("pepe", "diaz", 1523012490, "pepe@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true); 
		Contacto cliente2 = new Contacto("pepe", "diaz", 1523009490, "pepe@hotmailcom", "juan 123", 1312, 
				Provincias.CORDOBA, false, true);
		Contacto cliente3 = new Contacto("pepe", "diaz", 1523054490, "pepe@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		Contacto cliente4 = new Contacto("pepe", "diaz", 1523015490, "pepe@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true);
		Contacto cliente5 = new Contacto("pepe", "diaz", 1523012499, "pepe@hotmailcom", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true);
		Contacto cliente6 = new Contacto("pepe", "diaz", 1534301249, "pepe@hotmail.com", "juan 123", 1312, 
				Provincias.CORDOBA, false, true);
		Contacto cliente7 = new Contacto("pepe", "diaz", 152345012, "pepe@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		
		
		contactos.addContacto(cliente);
		contactos.addContacto(cliente2);
		contactos.addContacto(cliente3);
		contactos.addContacto(cliente4);
		contactos.addContacto(cliente5);
		contactos.addContacto(cliente6);
		contactos.addContacto(cliente7);
		
		SistemaCall contactos2 = new SistemaCall();
		
		contactos2.addContacto(cliente);
		contactos2.addContacto(cliente2);
		contactos2.addContacto(cliente3);
		contactos2.addContacto(cliente4);
		contactos2.addContacto(cliente5);
		contactos2.addContacto(cliente6);
		contactos2.addContacto(cliente7);
		
		assertEquals(contactos.getListaContactos(), contactos2.getListaContactos()); 
	}
	
	
	@Test
	public void queSePuedaRealizarUnaLlamada() {
		
		SistemaCall actual = new SistemaCall();
		
		
		Contacto cliente = new Contacto("pepe", "diaz", 1523012490, "pepe1@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true); 
		Contacto cliente2 = new Contacto("pepe", "diaz", 1523009490, "pepe2@hotmailcom", "juan 123", 1312, 
				Provincias.CORDOBA,true, true);
		Contacto cliente3 = new Contacto("pepe", "diaz", 1523054490, "pepe3@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, true, true);
		Contacto cliente4 = new Contacto("pepe", "diaz", 1523015490, "pepe4@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, true, true);
		Contacto cliente5 = new Contacto("pepe", "diaz", 1523012499, "pepe5@hotmailcom", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, true, true);
		Contacto cliente6 = new Contacto("pepe", "diaz", 1534301249, "pepe6@hotmail.com", "juan 123", 1312, 
				Provincias.CORDOBA, true, true);
		Contacto cliente7 = new Contacto("pepe", "diaz", 152345012, "pepe7@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		
		
	    actual.addContacto(cliente);
	    actual.addContacto(cliente2);
	    actual.addContacto(cliente3);
	    actual.addContacto(cliente4);
	    actual.addContacto(cliente5);
	    actual.addContacto(cliente6);
	    actual.addContacto(cliente7);
	 
	/*    HashSet<Contacto> contactosFiltrados = new HashSet<Contacto>();
	    
	    
	    for (Contacto llamado : actual.getListaContactos()) {
	    	
	        if (llamado.isEsCliente() ==false && llamado.isDeseaNuevoLlamado() ==true &&
	        		(llamado.getCodigo_postal() >1000  && llamado.getCodigo_postal()<2000))
	        {
	            contactosFiltrados.add(llamado); }
	    }
	    
*/
    	assertEquals(2, actual.buscarContactos().size());
	    //assertTrue(contactosFiltrados.contains(cliente));
	}

	
	@Test
	public void queUnContactoPaseASerClienteSiLaLLamadaEsExitosa() {
		
		SistemaCall actual = new SistemaCall();
		
		
		Contacto cliente = new Contacto("pepe", "diaz", 1523012490, "pepe1@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true); 
		Contacto cliente2 = new Contacto("pepe", "diaz", 1523009490, "pepe2@hotmailcom", "juan 123", 1312, 
				Provincias.CORDOBA,true, false);
		Contacto cliente3 = new Contacto("pepe", "diaz", 1523054490, "pepe3@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		Contacto cliente4 = new Contacto("pepe", "diaz", 1523015490, "pepe4@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, true, true);
		Contacto cliente5 = new Contacto("pepe", "diaz", 1523012499, "pepe5@hotmailcom", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, true, true);
		Contacto cliente6 = new Contacto("pepe", "diaz", 1534301249, "pepe6@hotmail.com", "juan 123", 1312, 
				Provincias.CORDOBA, true, true);
		Contacto cliente7 = new Contacto("pepe", "diaz", 152345012, "pepe7@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		
		
	    actual.addContacto(cliente);
	    actual.addContacto(cliente2);
	    actual.addContacto(cliente3);
	    actual.addContacto(cliente4);
	    actual.addContacto(cliente5);
	    actual.addContacto(cliente6);
	    actual.addContacto(cliente7);

    	assertEquals(3, actual.registrarComoNuevosClientesSiLaLlamadaFueExitosa().size());
	   
	}

	
	@Test
	public void llamadaExitosa() {
		
		SistemaCall actual = new SistemaCall();
		
		
		Contacto cliente = new Contacto(false); 
		Contacto cliente2 = new Contacto(false); 
		Contacto cliente3= new Contacto(true); 
		Contacto cliente4 = new Contacto(false); 
		Contacto cliente5 = new Contacto(true); 
		Contacto cliente6 = new Contacto(false); 
		Contacto cliente7= new Contacto(false); 
		
		
	    actual.addContacto(cliente);
	    actual.addContacto(cliente2);
	    actual.addContacto(cliente3);
	    actual.addContacto(cliente4);
	    actual.addContacto(cliente5);
	    actual.addContacto(cliente6);
	    actual.addContacto(cliente7);

    	assertTrue(actual.llamarCliente(cliente6));
	   
	}

	
	@Test
	public void listarContactosNoClientes() {
		
		SistemaCall actual = new SistemaCall();
		
		
		Contacto cliente = new Contacto("pepe", "diaz", 1523012490, "pepe1@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true); 
		Contacto cliente2 = new Contacto("pepe", "diaz", 1523009490, "pepe2@hotmailcom", "juan 123", 1312, 
				Provincias.CORDOBA,true, false);
		Contacto cliente3 = new Contacto("pepe", "diaz", 1523054490, "pepe3@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		Contacto cliente4 = new Contacto("pepe", "diaz", 1523015490, "pepe4@hotmail.com", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, true, true);
		Contacto cliente5 = new Contacto("pepe", "diaz", 1523012499, "pepe5@hotmailcom", "juan 123", 1312, 
				Provincias.BUENOS_AIRES, false, true);
		Contacto cliente6 = new Contacto("pepe", "diaz", 1534301249, "pepe6@hotmail.com", "juan 123", 1312, 
				Provincias.CORDOBA, false, true);
		Contacto cliente7 = new Contacto("pepe", "diaz", 152345012, "pepe7@hotmail.com", "juan 123", 1312, 
				Provincias.LA_PAMPA, false, true);
		
		
	    actual.addContacto(cliente);
	    actual.addContacto(cliente2);
	    actual.addContacto(cliente3);
	    actual.addContacto(cliente4);
	    actual.addContacto(cliente5);
	    actual.addContacto(cliente6);
	    actual.addContacto(cliente7);

    	assertEquals(5, actual.listarContactoQueNoEsCliente().size());
	   
	}

	
}
