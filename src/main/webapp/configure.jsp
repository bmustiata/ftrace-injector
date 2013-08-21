<%@ page import="com.ciplogic.jsinjector.web.JavascriptInjectFilter" %><%

    String redirectPort = request.getParameter("redirectPort");

    JavascriptInjectFilter.REDIRECT_HOST =  request.getParameter("redirectHost");
    JavascriptInjectFilter.REDIRECT_PORT = redirectPort == null ? 80 : Integer.parseInt(redirectPort);
%>
Configured.