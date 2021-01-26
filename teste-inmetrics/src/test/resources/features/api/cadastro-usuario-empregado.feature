#language: en
#Author: lulima559@gmail.com

@cadastroUsuarioEmpregado @api
Feature: Cadastrar usuario empregado
  Esta automação tem como objetivo cadastrar usuário empregado

  
  Scenario: Cadastrar usuario empregado
    Given que seja feita uma requisicao para cadastrar usuarios
    When o sistema obter a resposta da requisicao devera validar o status code
    Then validar o response retornado do cadastro empregado
   