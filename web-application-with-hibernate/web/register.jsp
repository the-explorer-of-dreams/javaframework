<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 2017/10/27
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.webapplication.hibernate.User,
                com.webapplication.hibernate.UserDao"%>
<%
    out.println("into register.jsp");
    String name = request.getParameter("name");
    String password =  request.getParameter("password");
    out.println("name="+name+":password="+password);
    User user  = new User();
    user.setName(name);
    user.setPassword(password);
    out.println("user.getName()="+user.getName());
    UserDao.save(user);
%>