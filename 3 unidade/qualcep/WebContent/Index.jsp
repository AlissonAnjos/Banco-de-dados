<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
<title>::PAGINA INICIAL::</title>
</head>
<body>
<h1>Pagina Inicial</h1>
<h2>Escolha uma das opções abaixo</h2>
<ul>
<li>
	<form action="InserirPessoa.jsp">
	<input type="submit" value="Inserir Pessoa" />
	</form>
</li>
<li> 
	<form action="AtualizarPessoa.jsp">
	<input type="submit" value="Atualizar Pessoa" />
	</form>
</li>
<li> 
	<form action="RemoverPessoa.jsp">
	<input type="submit" value="Remover Pessoa" />
	</form> 
</li>
<li> 
	<form action="InserirConsulta.jsp">
	<input type="submit" value="Pesquisar Logradouro" />
	</form>
</li>
</ul>
</body>
</html>