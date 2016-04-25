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

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmProducto">nuevo Producto</a>
<br>

<display:table name="${listProduct}" id="item" class="table">
 	<display:column title="Clave" property="ID" />
	<display:column title="Nombres" property="Nombre" />
	<display:column title="Apellidos paterno" property="ApellidoPaterno" />
	<display:column title="Apellido Materno" property="ApellidoMaterno" />
	<display:column title="Tipo De Documento" property="Tip_Documento" />
	<display:column title="Documento" property="Documento" />
</display:table>