<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 2017/10/27
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.webapplication.hibernate.UserDao" %>
<jsp:useBean id="obj" class="com.webapplication.hibernate.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
    int i = UserDao.save(obj);
    if (i > 0) {
        out.print("You are successfully registered");
    }
%>
