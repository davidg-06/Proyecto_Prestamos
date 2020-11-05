<div class="modal fade" id="agregarClienteModal">
    <div class ="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title"> Agregar Cliente </h5>
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
 </div>

                <form action ="${pageContext.request.contextPath}/ServletControlador?accion=insertar" 
                      method="post" class="was-validated">
                    <div class="modal-body">
                        <div class="form-group">

                            <label for="cedula">Cedula</label>
                            <input type="text" class="form-control" name="cedula" required>
                        </div>

                        <div class="form-group">

                            <label for="nombre">Nombre</label>
                            <input type="text" class="form-control" name="nombre" required>
                        </div>
                        <div class="form-group">

                            <label for="apellido">Apellido</label>
                            <input type="text" class="form-control" name="apellido" required>
                        </div>
                        
                         
                        <div class="form-group">

                            <label for="correo">Correo</label>
                            <input type="email" class="form-control" name="correo" required>
                        </div>
                        <div class="form-group">

                            <label for="direccion">Direccion</label>
                            <input type="text" class="form-control" name="direccion" required>
                        </div>
                        <div class="form-group">

                            <label for="telefono">Telefono</label>
                            <input type="tel" class="form-control" name="telefono" required>
                        </div>
                        <div class="form-group">

                            <label for="id_rol">id_rol</label>
                            <input type="number" class="form-control" name="id_rol" required>
                        </div>
                        <div class="form-group">

                            <label for="contrasena">Contraseña</label>
                            <input type="password" class="form-control" name="contrasena" required>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-primary" type="submit">Guardar</button>
                    </div>
                </form>

            </div>
        </div>
    </div>