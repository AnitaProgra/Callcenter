package ar.edu.unlam.callcenter;

public class Contacto {
	
 protected String nombre; 
 protected String apellido;
 protected Integer celular;
 protected String email; 
 protected String direccion;
 protected Integer codigo_postal;
 protected Provincias provincia; 
 protected boolean esCliente;
 protected boolean deseaNuevoLlamado;
protected boolean estaEnLlamada; 


public Contacto() {
	
} 


 public Contacto(String nombre, String apellido, Integer celular, String email, String direccion, Integer codigo_postal,
		Provincias provincia, boolean esCliente, boolean deseaNuevoLlamado) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.celular = celular;
	this.email = email;
	this.direccion = direccion;
	this.codigo_postal = codigo_postal;
	this.provincia = provincia;
	this.esCliente = esCliente;
	this.deseaNuevoLlamado = deseaNuevoLlamado;
}
 
 public Contacto(boolean estaEnLlamada) {
	this.estaEnLlamada= estaEnLlamada; 
	} 
 
 
public boolean isEstaEnLlamada() {
	return estaEnLlamada;
}

public void setEstaEnLlamada(boolean estaEnLlamada) {
	this.estaEnLlamada = estaEnLlamada;
}

public void setEmail(){
	if(email.contains("@")&& email.contains(".")); 
	; 
}
 
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public Integer getCelular() {
	return celular;
}

public void setCelular(Integer celular) {
	this.celular = celular;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public Integer getCodigo_postal() {
	return codigo_postal;
}

public void setCodigo_postal(Integer codigo_postal) {
	this.codigo_postal = codigo_postal;
}

public boolean isEsCliente() {
	return esCliente;
}

public void setEsCliente(boolean esCliente) {
	this.esCliente = esCliente;
}

public boolean isDeseaNuevoLlamado() {
	return deseaNuevoLlamado;
}

public void setDeseaNuevoLlamado(boolean deseaNuevoLlamado) {
	this.deseaNuevoLlamado = deseaNuevoLlamado;
}

public String getEmail() {
	return email; 
}


public void setProvincias (Provincias provincia){
	this.provincia=provincia; 
}


public Provincias getProvincia() {
	return provincia;
}




}
