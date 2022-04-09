<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
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

    <form:form method="POST" action="/contratos" modelAttribute="contratoForm">
    <div class="form-group mb-3">
        <label for="nomeContratante">Nome Contratante</label>
        <form:input type="text" class="form-control" path="nomeContratante" id="nomeContratante" placeholder="Nome Contratante"
                    maxlength="100"/>
        <form:errors path="nomeContratante"/>
    </div>
    <div class="form-group mb-3">
        <label for="numeroContrato">Numero do Contrato</label>
        <form:input type="number" class="form-control" path="numeroContrato" id="numeroContrato" placeholder="Numero do contrato"/>
        <form:errors path="numeroContrato"/>
    </div>

    <div class="form-group mb-3">
        <label for="responsavel">Responsável</label>
        <form:input type="text" class="form-control" path="responsavel" id="responsavel" placeholder="Responsável" maxlength="100"/>
        <form:errors path="responsavel"/>
    </div>
    <div class="form-group mb-3">
        <label for="dataVencimento">Data do Vencimento</label>
        <form:input type="date" path="dataVencimento" class="form-control" id="dataVencimento" placeholder="Data de nascimento"
                    maxlength="100"/>
        <form:errors path="dataVencimento"/>
    </div>
    <div class="form-group mb-3">
        <label for="valorContrato">Valor do Contrato</label>
        <form:input type="number" path="valorContrato" class="form-control" id="valorContrato" placeholder="Valor do Contrato"
                    maxlength="100"/>
        <form:errors path="valorContrato"/>
    </div>

    <input type="submit" value="Cadastrar contrato"/>
    </form:form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</body>
</html>