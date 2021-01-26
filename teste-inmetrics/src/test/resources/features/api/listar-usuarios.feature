#language: en
#Author: lulima559@gmail.com

@listarUsuarios @api
Feature: Listar usuarios
  Esta automação tem como objetivo listar usuários cadastrados

  
  Scenario: Listar usuarios
    Given que seja feita uma requisicao para listar usuarios
    When o sistema obter a resposa da requisicao devera validar o status
    Then validar o response retornado 
   