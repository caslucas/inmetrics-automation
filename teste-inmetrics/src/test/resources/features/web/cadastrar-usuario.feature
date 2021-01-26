#language: en
#Author: lulima559@gmail.com

@userRegister @web
Feature: Cadastro usuario
  Essa automação tem como objetivo fazer o cadastro de usuários

  
  Scenario: Cadastro usuario
  	Given que o usuario acesse a url de cadastro usuario
  	When o usuario clicar no botao cadastre-se
  	And informar o nome do usuario
  	And informar a senha e confirmar a senha
  	Then o usuario devera clicar no botao cadastrar
  	

