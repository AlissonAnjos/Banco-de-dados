<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, modelo.*" %>
<jsp:useBean id="dao" class="modelo.LogradouroDao" />
<jsp:useBean id="bairrodao" class="modelo.BairroDao" />
<jsp:useBean id="tipologdao" class="modelo.TipoLogDao" />
<jsp:useBean id="cidadedao" class="modelo.CidadeDao" />
<jsp:useBean id="estadodao" class="modelo.EstadoDao" />
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cep</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
  </head>
  <body>

  	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
				 <a class="navbar-brand" >Qual o cep?</a>
				</div>
				
								
			</nav>

			<form action="mvc">
				<div class="form-group">
					
				
						<label for="pesquisa">Pesquisa por logradouro ou cep: </label>
				
					<input class="form-control" type="text" name= "LogradouroOuCep" />
				</div>
				<input type="submit" value="Pesquisar" />
			<input type="hidden" name="logica" value="ConsultarCepLogic"/><br/>
			</form>
			
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							Tipo de Logradouro
						</th>
						<th>
							Logradouro
						</th>
						<th>
							Bairro
						</th>
						<th>
							
						</th>
						<th>
							Cidade
						</th>
						<th>
							Estado
						</th>
						<th>
							Cep
						</th>
						
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<c:forEach var="tipolog" items="${tiposlogs}">
							${tipolog.nome}<br/>
							</c:forEach>
						</td>
						<td>
							<c:forEach var="logradouro" items="${logradouros}">
							${logradouro.nome}<br/>
							</c:forEach>
						</td>
						<td>
							<c:forEach var="bairro" items="${bairros}">	
							${bairro.nome}<br/>
							</c:forEach>
						</td>
						<td>
							<td>
							<c:forEach var="cidade" items="${cidades}">
							${cidade.nome}<br/>
							</c:forEach>
						</td>
						<td>
							<c:forEach var="estado" items="${estados}">
							${estado.uf}<br/>
							</c:forEach>
						</td>
						<td>
							<c:forEach var="logradouro" items="${logradouros}">
							${logradouro.cep}<br/>
							</c:forEach>
						</td>
						
					
				</tbody>
			</table>
			<a href="Index.jsp">Pagina inicial</a>
		</div>
	</div>
	</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>