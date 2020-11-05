<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  
      
    <nav  class="navbar navbar--dark bg-dark">
        <a style="color:cornsilk"class="navbar-brand" href="#">
          <img src="img/prestamo.png" width="30" height="30" class="d-inline-block align-top" alt="">  Bienvenido (a)  ${nombre}</a>

         <div class="dropdown">
        <a style="color:cornsilk" href= "#"class ="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar sesion</a>

         <a>${nombre}</a>	
        <div class="btn-group">

                  <span class="sr-only">Cerrar sesion</span>
                </button>
                <div class="dropdown-menu text-center">
                  <a><img src="img/cara.png" height="60"width="60"> </a><br>
                  <a>${nombre}</a>
                  <a></a>
                  <div class="dropdown-divider"></div>
                  <a href="controlador?accion=salir" class="dropdown-item">Salir</a>
                </div>
              </div>
        
      </nav>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

     
    </body>
</html>