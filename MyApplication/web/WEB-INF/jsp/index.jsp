<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="webapp.ObjectDetail" %>
<%@ page import="webapp.MyServlet" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="ObjectDetail" class="webapp.ObjectDetail"   scope="application" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>

    <body>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#aabcfe;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#e8edff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#039;background-color:#b9c9fe;}
        .tg .tg-baqh{text-align:center;vertical-align:top}
        .tg .tg-j0tj{background-color:#D2E4FC;text-align:center;vertical-align:top}
    </style>
    <table class="tg" style="table-layout: fixed; width: 1024px">
        <colgroup>
            <col style="width: 64px">
            <col style="width: 160px">
            <col style="width: 320px">
            <col style="width: 160px">
            <col style="width: 64px">
            <col style="width: 64px">
            <col style="width: 64px">
            <col style="width: 64px">
        </colgroup>
        <tr>
            <th class="tg-baqh">type</th>
            <th class="tg-baqh">name</th>
            <th class="tg-baqh">author</th>
            <th class="tg-baqh">publish</th>
            <th class="tg-baqh">date</th>
            <th class="tg-baqh">pages</th>
            <th class="tg-baqh">edit</th>
            <th class="tg-baqh">remove</th>
        </tr>
        <c:forEach items="${items}" var="item">
            <tr>
                <td class="tg-baqh">${item.type}</td>  
                <td class="tg-j0tj">${item.name}</td>  
                <td class="tg-baqh">${item.author}</td>  
                <td class="tg-j0tj">${item.publish}</td>  
                <td class="tg-baqh">${item.date}</td>  
                <td class="tg-j0tj">${item.pages}</td>  
                <td class="tg-baqh"><button type = "submit" name = "edit" value="${item.id_object}"><img src="/MyApplication/resource/images/edit.png" onClick=""></button></td>
                <td class="tg-j0tj"><button type = "submit" name = "delete" value="${item.id_object}"><img src="/MyApplication/resource/images/delete.png" onClick=""></button></td>
            </tr>
        </c:forEach> 
    </table>
</body>
</html>
