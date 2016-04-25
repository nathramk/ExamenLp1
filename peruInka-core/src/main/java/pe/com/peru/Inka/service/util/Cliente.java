package pe.com.peru.Inka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="cliente")
public class Cliente {
private String nombre;
private String ApellidoPaterno;
private String ApellidoMaterno;
private String Tip_Documento;
private Long Documento;
private Long ID;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Long getID() {
	return ID;
}
public void setID(Long iD) {
	ID = iD;
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
public Long getDocumento() {
	return Documento;
}
public void setDocumento(Long documento) {
	Documento = documento;
}

}
