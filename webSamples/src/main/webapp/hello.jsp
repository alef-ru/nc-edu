<html>
<head><title>First JSP</title></head>
<body>
 <p>
     <%@ page import="java.util.HashSet,java.util.Set" %>
     <%!
        Set acquaintances = new HashSet();
     %>
     <%
        String name = request.getParameter("name");
        if (name == null || name.isEmpty())
            name = "Stranger";
     %>

     Hi, <%= name %>.

     <% if(acquaintances.contains(name)){ %>
         Nice to see you again!
     <% } else if (!name.equals("Stranger"))  acquaintances.add(name); %>

    <form action="/webSamples-0.1/hello.jsp">
        What is your name: <input name="name" type="text">
    </form>


 </p>
</body>
</html>