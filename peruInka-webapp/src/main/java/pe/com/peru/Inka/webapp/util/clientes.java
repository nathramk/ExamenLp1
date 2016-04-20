package pe.com.peru.Inka.webapp.util;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="clientes")
public class clientes {
private String Nombre;
private String ApellidoPaterno;
private String ApellidoMaterno;
private String Tip_Documento;
private long Documento;
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellidoPaterno() {
	return ApellidoPaterno;
}
public void setApellidoPaterno(String apellidoPaterno) {
	ApellidoPaterno = apellidoPaterno;
}
public String getApellidoMaterno() {
	return ApellidoMaterno;
}
public void setApellidoMaterno(String apellidoMaterno) {
	ApellidoMaterno = apellidoMaterno;
}
public String getTip_Documento() {
	return Tip_Documento;
}
public void setTip_Documento(String tip_Documento) {
	Tip_Documento = tip_Documento;
}
public long getDocumento() {
	return Documento;
}
public void setDocumento(long documento) {
	Documento = documento;
}

}
