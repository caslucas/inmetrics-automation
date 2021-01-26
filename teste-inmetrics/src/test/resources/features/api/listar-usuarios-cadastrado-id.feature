#language: en
#Author: lulima559@gmail.com

@listarUsuarioCadastradoId @api
Feature: Listar usuario cadastrado
  Esta automação tem como objetivo listar usuários cadastrados pelo filtro id

  
  Scenario: Listar usuarios cadastrado
    Given que seja feita uma requisicao para listar usuarios pelo id
    When o sistema obter a resposta da requisicao devera validar o status
    Then validar o response retornado do cadastro
   