<%@ page language="java" %>
스프링 부트
<%-- <jsp:getBean id="homeService" /> --%>
${request.webApplicationContext.applicationName}
${wac.getBean("homeService").date}test123
