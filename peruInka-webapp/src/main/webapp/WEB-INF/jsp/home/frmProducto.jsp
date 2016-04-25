<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
Productos
<form:form commandName="productos" action="GuardarProductos" method="POST" cssClass="from-horizontal">
	Sucursal ID: <form:input path="sucursalID" id="sucursalID" placeholder="ID" maxlength="50"/> <br>
	Nombre:	<form:input path="NombreDeProducto" id="NombreDeProducto" placeholder="Nombre del Producto" maxlength="50"/> <br>
    Precio: <form:input path="precio" id="precio" placeholder="precio de los productos" maxlength="50"/> <br>
	Descripcion: <form:input path="Descripcion" id="Descripcion" placeholder="descripcion del producto" maxlength="50"/> <br>
	Atributo: <form:input path="Atributo" id="Atributo" placeholder="Cracteristica del Producto" maxlength="50"/> <br>
	Estado: <form:input path="tipoProduct" id="tipoProduct" placeholder="CLASE DE PRODUCTO" maxlength="50"/> <br>
	
	Tipo De Producto: <form:input path="Nombre" id="Nombre" placeholder="Nombre" maxlength="50"/> <br>
	<button type="submit" class="btn-btn-primary">Registrar Producto</button>
</form:form>