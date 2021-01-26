#language: en
#Author: lulima559@gmail.com

@login @web
Feature: Ao Efetuar login
  Essa automação tem como objetivo fazer login

  
  Scenario: Ao Efetuar login
  	Given que o usuario acesse a url de login
  	When informar o nome do usuario de login
  	And informar a senha
  	Then o usuario devera clicar no botao de entrar