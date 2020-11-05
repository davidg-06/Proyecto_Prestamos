


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" context="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/b2d7661f77.js" crossorigin="anonymous"></script>

        <title>Editar Usuario </title>
    <body>
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>

        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&id_usuario=${usuario.id_usuario}"
              method="POST" class="was-validated">

            <!--botones de navegacion -->
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"/>    

            <section id="details">
                <div class="container">
                    
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Usuario</h4>
                                </div>
                                <div class="card-body">
                        <div class="form-group">

                            <label for="cedula">Cedula</label>
                            <input type="text" class="form-control" name="cedula" required value="${usuario.cedula}">
                        </div>

                        <div class="form-group">

                            <label for="nombre">Nombre</label>
                            <input type="text" class="form-control" name="nombre" required value="${usuario.nombre}">
                        </div>
                        <div class="form-group">

                            <label for="apellido">Apellido</label>
                            <input type="text" class="form-control" name="apellido" required value="${usuario.apellido}">
                        </div>
                        
                         
                        <div class="form-group">

                            <label for="correo">Correo</label>
                            <input type="email" class="form-control" name="correo" required value="${usuario.correo}">
                        </div>
                        <div class="form-group">

                            <label for="direccion">Direccion</label>
                            <input type="text" class="form-control" name="direccion" required value="${usuario.direccion}">
                        </div>
                        <div class="form-group">

                            <label for="telefono">Telefono</label>
                            <input type="tel" class="form-control" name="telefono" required value="${usuario.telefono}">
                        </div>
                        <div class="form-group">

                            <label for="id_rol">id_rol</label>
                            <input type="number" class="form-control" name="id_rol" required value="${usuario.id_rol}">
                        </div>
                        <div class="form-group">

                            <label for="contrasena">Contraseña</label>
                            <input type="password" class="form-control" name="contrasena" required value="${usuario.contrasena}">
                        </div>
                         <div class="form-group">

                            <label for="valor_credito">Valor Credito</label>
                            <input type="number" class="form-control" name="valor_credito" required value="${usuario.valor_credito}">
                        </div>
                        

                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-primary" type="submit">Guardar</button>
                    </div>

                                </div>
                                    
                            </div>
                        </div>
                    </div>
                </div>
                
            </section>

        </form>









        <jsp:include page="/WEB-INF/paginas/comunes/piepagina.jsp"/>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </body>
</html>
