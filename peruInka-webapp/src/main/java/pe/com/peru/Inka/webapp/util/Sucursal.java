package pe.com.peru.Inka.webapp.util;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="sucursal")
public class Sucursal {
private String RazonSocial;
private long RUC;
private String Direccion;
private long NroTelefono;
public String getRazonSocial() {
	return RazonSocial;
}
public void setRazonSocial(String razonSocial) {
	RazonSocial = razonSocial;
}
public long getRUC() {
	return RUC;
}
public void setRUC(long rUC) {
	RUC = rUC;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
public long getNroTelefono() {
	return NroTelefono;
}
public void setNroTelefono(long nroTelefono) {
	NroTelefono = nroTelefono;
}

}
