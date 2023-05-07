package ar.edu.unlam.callcenter;


import java.util.HashSet;

public class SistemaCall extends Contacto {



protected int password; 
protected HashSet<Contacto> listaContactos ;



public SistemaCall() {
	listaContactos= new HashSet<Contacto>();
}




public void addContacto(Contacto cliente) {
    listaContactos.add(cliente);
}




public HashSet<Contacto> getListaContactos() {
	return listaContactos;
}


/*public int hacerLlamada() {
	int contactoApto = 0; 
	for(Contacto llamado: listaContactos ){
		if(llamado.esCliente==false && llamado.deseaNuevoLlamado==true && 
				llamado.codigo_postal>1000  && llamado.codigo_postal<2000) 
		contactoApto += contactoApto; 
	}
	return contactoApto;
	
}

*/

public HashSet<Contacto> buscarContactos() {
  
    

    HashSet<Contacto> contactosFiltrados = new HashSet<Contacto>();
    
    
    for (Contacto llamado : listaContactos) {
    	
        if (llamado.esCliente==false && llamado.deseaNuevoLlamado==true &&
        		(llamado.codigo_postal>1000  && llamado.codigo_postal<2000))
        {
            contactosFiltrados.add(llamado); }
    }
    
    return contactosFiltrados; 
}



public HashSet<Contacto> registrarComoNuevosClientesSiLaLlamadaFueExitosa() {
	 
	 HashSet<Contacto> nuevosClientes = new HashSet<Contacto>();
	    
	    
	    for (Contacto llamado : listaContactos) {
	    	
	        if (llamado.isEsCliente()==false && llamado.deseaNuevoLlamado==true) {
	        	llamado.setEsCliente(true);
	        	llamado.setDeseaNuevoLlamado(false);
	        nuevosClientes.add(llamado);
	     }
	    }
	    
	    return nuevosClientes; 
	}
	


public HashSet<Contacto> listarContactoQueNoEsCliente() {
	
	 HashSet<Contacto> listaNoClientes = new HashSet<Contacto>();
	 
	 for (Contacto llamado : listaContactos) {
    if (llamado.esCliente==false && llamado.deseaNuevoLlamado==true) {
    	 listaNoClientes.add(llamado);
       }
	 }
    return listaNoClientes; 
}


public boolean llamarCliente(Contacto cliente) {
    if (cliente.isEstaEnLlamada()==false) {
        return true; 
    } else {
        return false;
    }
}




}






