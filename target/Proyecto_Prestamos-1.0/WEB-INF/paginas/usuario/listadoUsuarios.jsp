<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>

<%--da formato a las cadenas , precio --%>
<%@taglib prefix="fmt"uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="es_CO"/>



<seccion id="usuario">
    <div class="container" >
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de clientes</h4>

                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Cedula</th>
                                <th>Nombre</th>
                                <th>Saldo</th>

                                <th>                              
                                <th> </th>                              
                           
                               
                                    
                            </tr>  
                        </thead>
                        <tbody>

                            <c:forEach var="usuario" items="${usuario}" >
                                <tr>
                                    <td>${usuario.id_usuario}</td> 
                                    <td>${usuario.cedula}</td> 
                                    <td>${usuario.nombre}  ${usuario.apellido} </td>
                                   <td>  <fmt:formatNumber value="${usuario.valor_credito}"type="currency"/> </td>
                                   
                                    
                                    
                                     <td>
                                    <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&id_usuario=${usuario.id_usuario}"
                                       
                                           class="btn btn-secondary">
                                            <i class="fas fa-angle-double-ringht"></i>Editar
                                        </a>
                                    </td>
                                </tr>  

                            </c:forEach>
                        </tbody>

                    </table>
                </div>
            </div>

            <%--trajetas para los totales --%>
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Saldo Total </h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i>
                            <fmt:formatNumber value="${saldoTotal}"type="currency"/>

                        </h4>

                    </div>
                </div>

                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body" >
                        <h3>Total Clientes </h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i>     ${totalClientes}
                    </div>

                </div>
            </div>

        </div>
</seccion>



