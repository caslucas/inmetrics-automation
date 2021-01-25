#language: en
#Author: lulima559@gmail.com

@cadastroFuncionario
Feature: Cadastro Funcionário
  Essa automação tem como objetivo fazer o cadastro de um funcionario

  
  Scenario: Cadastro funcionário
  	Given que o usuario acesse a url de cadastro funcionario
  	When o usuario clicar no botao para cadastrar funcionario
  	And informar os dados do funcionario
  	Then o usuario devera clicar no botao enviar
  	And validar se o usuario foi cadastrado com sucesso
  	
@editarRegistro  	
  Scenario: Editar Registro Funcionario
  	Given que o usuario acesse a url para editar cadastro funcionario
  	When for feito a pesquisa pelo cpf
  	And informar novos dados do funcionario
  	Then o usuario devera clicar no botao de envio
  	And validar se a edicao foi concluida com sucesso

@deletarRegistro  	
  Scenario: Deletar Registro Funcionario
  	Given que o usuario acesse a url para deletar cadastro funcionario
  	When for feito a pesquisa pelo cpf cadastrado
  	Then o usuario devera clicar no botao de deletar
  	And validar se o registro foi deletado com sucesso
  	
  	
