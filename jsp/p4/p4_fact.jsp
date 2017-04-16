<html>
    <head>
        <title>Here You Go!</title>
    </head>
    <body>
        <center>
            <h2>
        <%
            int f=Integer.parseInt(request.getParameter("n1"));
            int fact=1;
            while(f>=1){
                fact=fact*f;
                f--;
            }
            out.println("The Factorial of " + request.getParameter("n1") + " is " + fact + ".");
            
        %>
            </h2>
        </center>
    </body>


</html>