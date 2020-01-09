<%-- 
    Document   : index
    Created on : Jan 7, 2020, 7:03:54 PM
    Author     : ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Laboratorios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <!-- Bootstrap core CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/css/mdb.min.css" rel="stylesheet">
    </head>
    <body>
        <%@page import="laboratorio.Laboratorio"%>
        <!-- BASIC MENU -->
        <nav class="navbar navbar-expand-sm navbar-dark primary-color">
            <div class="container">
                <a class="navbar-brand" href="<%=laboratorio.Laboratorio.getRoot()%>">LABORATORIOS</a>
                <button 
                    class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>">Inicio <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>lab1/pregunta1.jsp">Laboratorio 1</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>lab2/pregunta1.jsp">Laboratorio 2</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>lab3/pregunta1.jsp">Laboratorio 3</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <!-- PAGE CONTENT -->
        <ul class="nav nav-tabs nav-fill">
            <li class="nav-item">
                <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>lab1/pregunta1.jsp">Pregunta 1</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>lab1/pregunta2.jsp">Pregunta 2</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=laboratorio.Laboratorio.getRoot()%>lab1/pregunta3.jsp">Pregunta 3</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" href="<%=laboratorio.Laboratorio.getRoot()%>lab1/pregunta4.jsp">Pregunta 4</a>
            </li>
        </ul>
            
        <!-- PREGUNTA -->
        <form style="margin-top: 30px" class="text-center border border-light p-5" action="pregunta4.jsp" method="POST">
            <p class="h4 mb-4">CÁLCULO EXPONENTE</p>
            <input type="text" class="form-control mb-4" name="n1" placeholder="Base">
            <input type="text" class="form-control mb-4" name="n2" placeholder="Exponente">
            <button class="btn btn-info btn-block my-4" type="submit">Enviar</button>
            <%=
                laboratorio.lab1.pregunta4(
                        request.getParameter("n1"),
                        request.getParameter("n2")
                )
            %>
        </form>
      
        <!-- JQuery -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.10.1/js/mdb.min.js"></script>
    </body>
</html>
