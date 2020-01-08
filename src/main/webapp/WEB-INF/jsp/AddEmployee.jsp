<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 <form:form method="post" action="save" modelAttribute="employee"> 
        <h1>Add New Person</h1> 
               <table  >    
         <tr>    
         <form:hidden path="id"></form:hidden> 
          <td>Name : </td>   
          <td><form:input path="name" id="name"  /></td> 
          </tr>    
         <tr>    
          <td>City :</td>    
          <td><form:input path="city"  id="city"/></td>
          </tr>   
         <tr>    
          <td>Phone :</td>    
          <td><form:input path="phone" id="phone" value=""/></td> 
           
         </tr>   
         <tr>    
          <td><br/> </td>    
          <td><input type="submit"  value="Save" /></td>    
         </tr>    
        </table>   
       
       </form:form>  
</body>
</html>