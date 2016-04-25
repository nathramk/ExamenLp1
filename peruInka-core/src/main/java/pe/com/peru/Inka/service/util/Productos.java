package pe.com.peru.Inka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="productos")
public class Productos {
private String NombreDeProducto;
private int precio;
private String Descripcion;
private String Atributo;
private String estado;
private Long sucursalID;
private String tipoProduct;
public String getNombreDeProducto() {
	return NombreDeProducto;
}
public void setNombreDeProducto(String nombreDeProducto) {
	NombreDeProducto = nombreDeProducto;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
public String getAtributo() {
	return Atributo;
}
public void setAtributo(String atributo) {
	Atributo = atributo;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public Long getSucursalID() {
	return sucursalID;
}
public void setSucursalID(Long sucursalID) {
	this.sucursalID = sucursalID;
}
public String getTipoProduct() {
	return tipoProduct;
}
public void setTipoProduct(String tipoProduct) {
	this.tipoProduct = tipoProduct;
}

}
