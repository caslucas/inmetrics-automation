#language: en
#Author: lulima559@gmail.com

@alterarCadastro @api
Feature: Alterar usuario
  Esta automação tem como objetivo alterar cadastro usuário

  
  Scenario: Alterar usuario
    Given que seja feita uma requisicao para alterar usuarios
    When o sistema obter a resposta devera validar o status code
    Then validar o response retornado da alteracao
   