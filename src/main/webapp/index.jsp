<%@ page language="java" %>
<%@ include file="WEB-INF/jsp/common.jspf" %>
<c:set var="homeService" value="${wac.getBean('homeService')}" />
<h1>스프링 부트 &amp; JSP</h1>
${homeService.date}
