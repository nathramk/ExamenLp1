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
<style>
<!--
l1{
    color: red;
}
-->
</style>
<l1>datos cliente</l1>
<form:form commandName="cliente" action="salvarCliente" method="POST" cssClass="from-horizontal">
	ID:	<form:input path="ID" id="ID" placeholder="Clave" maxlength="10"/> <br>
    Tipo De Documento: <form:input path="Tip_Documento" id="Tip_Documento" placeholder="Tipo de Documento" maxlength="10"/> <br>
	Documento: <form:input path="Documento" id="Documento" placeholder="Documento" maxlength="10"/> <br>
	Nombre: <form:input path="nombre" id="nombre" placeholder="Nombre" maxlength="50"/> <br>
	Apellido Paterno: <form:input path="ApellidoPaterno" id="ApellidoPaterno" placeholder="Primer Apellido" maxlength="50"/> <br>
	Apellido Materno: <form:input path="ApellidoMaterno" id="ApellidoMaterno" placeholder="Segundo Apellido" maxlength="50"/> <br>
	<button type="submit" class="btn-btn-primary">Registrar Cliente</button>
</form:form>