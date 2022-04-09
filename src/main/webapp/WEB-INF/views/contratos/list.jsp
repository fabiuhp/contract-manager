<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Contract Manager - Gestão de contratos</title>
</head>

<body>
<div class="container">
    <h1>Formulário de contratos</h1>

    <table>
        <thead>
            <th>Id</th>
            <th>Nome Contratante</th>
            <th>Numero do Contrato</th>
            <th>Responsável</th>
            <th>Data do Vencimento</th>
            <th>Status</th>
            <th>Valor do Contrato</th>
        </thead>
        <tbody>
        <c:forEach items="${contratos}" var="contrato">
            <tr>
                <td>${contrato.id}</td>
                <td>${contrato.nomeContratante}</td>
                <td>${contrato.numeroContrato}</td>
                <td>${contrato.responsavel}</td>
                <td>${contrato.dataVencimento}</td>
                <td>${contrato.status}</td>
                <td>${contrato.valorContrato}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</body>

</html>