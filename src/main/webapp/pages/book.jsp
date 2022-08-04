<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style >table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  background-color: #96D4D4;
}</style>
</head>
<body>
<%-- <h2>Book Data</h2>
<table>
  <tr>
    <th>Book Id</th>
    <th>Book Name</th>
    <th>Price</th>
  </tr>
  <tr>
    <td>${book1.bookId }</td>
    <td>${book1.bookName }</td>
    <td>${book1.bookPrice }</td>
  </tr>
  <tr>
    <td>${book2.bookId }</td>
    <td>${book2.bookName }</td>
    <td>${book2.bookPrice }</td>
  </tr>
  <tr>
    <td>${book3.bookId }</td>
    <td>${book3.bookName }</td>
    <td>${book3.bookPrice}</td>
  </tr>
</table>

 --%>

 <center>
 <table>
 <thead>
 <tr>
 <th>BookId</th>
 <th>BooKName</th>
 <th>BookPrice</th>
 </tr>
 </thead>
 
 <tbody>
  <c:forEach items="${books}" var="xxx">
<tr>
 <td>${xxx.bookId}</td>
 <td>${xxx.bookName}</td>
 <td>${xxx.bookPrice}</td>
</tr>
 </c:forEach>
 </tbody>
 
 </table>
</center>
</body>
</html>