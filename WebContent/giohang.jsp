<%@page import="bo.GioHangbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Gio Hang</title>
</head>
<body>
<%
String masach=request.getParameter("ms");
String tensach=request.getParameter("ts");
String tacgia=request.getParameter("tg");
String giatam=request.getParameter("gia");
//Neu nguoi dung mua lan dau tien
GioHangbo gh=null;
if(session.getAttribute("gh")==null){
        gh= new GioHangbo();
        session.setAttribute("gh", gh);
}
if(masach!=null){
//b1: gan session vao bien
 gh=(GioHangbo) session.getAttribute("gh");
 gh.Them(masach, tensach, tacgia, Long.parseLong(giatam), (long)1);//b2
 session.setAttribute("gh", gh);
}
//Hien thi gio
response.sendRedirect("HTgio.jsp");
 %>
</body>
</html>