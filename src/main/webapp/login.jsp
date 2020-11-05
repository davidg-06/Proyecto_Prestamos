<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt"uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="es_CO"/>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="Estilo.css">
        <!--Fontawesome CDN-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <title>Inicio de sesion </title>
    </head>
    <body>
<!-- Image and text -->
<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="#">
    <img src="" width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
    Quine                   
  </a>
    
    
</nav>
    <center>
<h4>¡Te damos la bienvenida de nuevo!</h4>
</center>
        <br> </br>
        <%--  <form action="login">--%>
        <form action="Validacion" method="post"> 
            <div class="container">
                <div class="d-flex justify-content-center h-100">
                    <div class="card">
                        <div class="card-header">
                            <h3>Iniciar Sesion</h3>
                            <div class="d-flex justify-content-end social_icon">
                                <span><i class="fab fa-facebook-square"></i></span>
                                <span><i class="fab fa-google-plus-square"></i></span>
                                <span><i class="fab fa-twitter-square"></i></span>
                            </div>
                        </div>

                        <div class="card-body">

                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" class="form-control" placeholder="Cedula" name="cedula">

                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="text" class="form-control" placeholder="Contraseña" name="contrasena"> 
                                <%--   <input type="text" class="form-control" name="contrasena" id="contrasena" placeholder="Contrasena" >  --%>
                            </div> 
                            <div class="row align-items-center remember">
                                <input type="checkbox">Recuérdame
                            </div>
                            <div class="form-group">
                                <input type="submit" name="accion" value="ingresar" class="btn float-right login_btn">
                            </div>

                        </div>
                        <div class="card-footer">
                            <div class="d-flex justify-content-center links">
                                No tengo una cuenta?<a href="Registro.html">Regístrate</a>
                            </div>
                            <div class="d-flex justify-content-center">
                                <a href="#">Olvidaste tu contraseña?</a>
                                </fom>

                            </div>
                        </div>
                    </div>
                </div>

            </div>
                          
    </body>
    
    <br> </br>
       <br> </br>
      
    
    
<footer id="pie-pagina" class ="bg-warning text-white mb-3 py-3">
    <div class="container">

        <div class="col">
            <p class="leaad text-center">
                Copyright &copy;  Prestamos Quine.com
            </p>

        </div>
    </div>

</footer>
</html>
