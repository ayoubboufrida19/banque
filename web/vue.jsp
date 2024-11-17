<%-- 
    Document   : vue
    Created on : Nov 17, 2024, 5:57:22 PM
    Author     : HP PROBOOK
--%>
<%@ page import ="mes_servlets.creditModel" %>
<% creditModel model=(creditModel)request.getAttribute("creditModel"); %>


            
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>les resultats de conte :</h1>
        <h1>mensualite : <%=model.getmensualite() %></h1>
         <h1>montant: <%=model.getmontant() %></h1>
           <h1>taux: <%=model.gettaux() %></h1>
          <h1>duree: <%=model.getduree() %></h1><!-- comment -->
       
    </body>
</html>
