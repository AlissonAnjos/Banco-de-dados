<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<title>Remover Pessoa</title>
</head>
<body>
<div class="container-fluid">
<form action="mvc">
				<div class="form-group">
					
				
					<label>Cpf:</label>
					<input class="form-control" type="text" name= "cpf" />
					<br/>
					
				</div>
				<input type="submit" value="Remover" />
			<input type="hidden" name="logica" value="RemoverPessoaLogic"/><br/>
			</form>
			<br></br>
			<form action="Index.jsp">
				<input type="submit" value="Ir para a pagina inicial" />
			</form>
			<br></br>
</div>
</body>
</html>