<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<title>Inserir Pessoa</title>
</head>
<body>
<div class="container-fluid">
<form action="mvc">
				<div class="form-group">
					
				
					<label>Cpf:</label>
					<input class="form-control" type="text" name= "cpf" />
					<br/>
					<label>Nome:</label>
					<input class="form-control" type="text" name= "nome" />
					<br/>
					<label>Email:</label>
					<input class="form-control" type="text" name= "email" />
					<br/>
					<label>Celular:</label>
					<input class="form-control" type="text" name= "celular" />
					<br/>
					<label>Id_logradouro:</label>
					<input class="form-control" type="text" name= "id_logradouro" />
					<br/>
					<label>numero:</label>
					<input class="form-control" type="text" name= "numero" />
					<br/>
					<label>complemento:</label>
					<input class="form-control" type="text" name= "complemento" />
					<br/>
				</div>
				<input type="submit" value="Cadastrar" />
			<input type="hidden" name="logica" value="InserirPessoaLogic"/><br/>
			</form>
			<a href="Index.jsp">Pagina inicial</a>
</div>
</body>
</html>