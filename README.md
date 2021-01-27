# inmetrics-automation

  Esse projeto tem como objetivo executar um fluxo automatizado de um WebSite da [Inmetrics](https://inm-test-app.herokuapp.com/accounts/login/), e fazer chamada na [API-Listar empregados](https://inm-test-api.herokuapp.com/empregado/list_all),
  [API-Listar empregado pelo id](https://inm-test-api.herokuapp.com/empregado/list/), [API-Cadastrar empregado](https://inm-test-api.herokuapp.com/empregado/cadastrar) e [API-Alterar Registro empregado](https://inm-test-api.herokuapp.com/empregado/alterar/).
  
  ## Pré-requisitos
  
 [JAVA 1.8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html) .</br> 
 [Eclipse](https://www.eclipse.org/downloads/packages/) ou IDE de sua preferência.</br> 
 (OBS: No download do Eclipse, está incluso a JRE 15, será necessário mudar a JRE para o seu JDK).</br>
 [ChromeDriver](https://chromedriver.chromium.org/), versão utilizada [87.0.4280.88](https://chromedriver.storage.googleapis.com/index.html?path=87.0.4280.88/).</br>
 [Git Bash](https://git-scm.com/book/pt-pt/v2/Appendix-A%3A-Git-em-Outros-Ambientes-Git-in-Bash).</br>
 [Maven](https://maven.apache.org/download.cgi), versão utilizada [apache-maven-3.6.3-bin.zip](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip).
 
 ## Configuração JAVA_HOME e MAVEN_HOME
 1. Após instalar o jdk, em seu computador procure **variáveis de ambiente**, clique na aba **avançado**, clique na opção **Variáveis de ambiente...**, em **Variáveis do sistema**
 clique em **novo**. Em **nome da variável** coloque **JAVA_HOME** e em **valor da variavél** coloque o caminho de seu jdk. Exemplo: **X:\Program Files\Java\jdk1.8.0_271**
 2. Para configurar o **MAVEN**, em seu computador procure **variáveis de ambiente**, clique na aba **avançado**, clique na opção **Variáveis de ambiente...**, em **Variáveis do sistema**
 clique em **novo**. Em **nome da variável** coloque **MAVEN_HOME** e em **valor da variavél** coloque o caminho de seu aquivo maven. Exemplo: **X:\Programas\Maven\apache-maven-3.6.3-bin\apache-maven-3.6.3**
 3. Para finalizar a configuração do Maven, faça o mesmo passo acima mas crie uma nova variável com o nome **PATH** e coloque o seu arquivo maven binário. Exemplo: **X:\Programas\Maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin**.
 
 ## Instalação
 1. Faça download e instale o jdk em sua máquina.
 2. Faça o download do eclipse ou IDE de sua preferência.
 3. Faça download do ChromeDriver referente a versão do seu navegador.
 4. Faça download e instale o git bash em sua máquina.
 5. Abra o eclipse e siga os seguintes passos:
 ```
 Window -> Show View -> Other -> Git -> Git Repositories -> Open.
 ```
 6. Feito o passo acima, irá abrir uma aba do Git Repositories, onde haverá alguns icones no canto direito inferior.
 Clique no segundo icone amarelo da esquerda para direita, para clonar o projeto na IDE.
 
7. Em **URI** cole a seguinte URI:
```
https://github.com/caslucas/inmetrics-automation.git
```
8. Clique em **Next**, selecione a branch **Master**, clique em **Next** novamente e em finish.
9. Após isso, o projeto estará sendo baixado em sua maquina e após finalizar, na aba **Git Repositores**, mostrará um repositório chamado **inmetrics-automation**.

10.Feito isso, instale o plugin do cucumber:
```
help -> Eclipse Marketplace -> cucumber -> install -> finish.

````
11. Por ultimo, clique com o botão direito em cima do repositório **inmetrics-automation**, vá até a opção **Import Projects**, selecione a opção **inmetrics-automation\teste-inmetrics** e pronto, o projeto já estará configurado em sua máquina e pronto para ser executado.

## Modo de usar
 
 Nesse projeto contém duas automações, uma web e outra, api. Para executar os testes siga este passo abaixo:
 ````
 Para executar o teste web, expanda o projeto -> src/test/java -> br.com.inmetrics.teste.runner -> RunCucumberTestWeb.java
 Para executar o teste web, expanda o projeto -> src/test/java -> br.com.inmetrics.teste.runner -> RunCucumberTestApi.java
````

## Execução via Maven e geração de relatórios

Vá até a pasta raiz do projeto, abra o prompt de comando e digite o comando abaixo (com o diretório de seu projeto):
```
Exemplo: cd X:\Test\test\git\inmetrics-automation\teste-inmetrics
```

Para executar os testes web via **Maven** execute o seguinte comando:
```
mvn clean verify -Dcucumber.filter.tags="@web"
````
Para executar os testes api via **Maven** execute o seguinte comando:
````
mvn clean verify -Dcucumber.filter.tags="@api"
````

Os relatórios serão gerados no caminho abaixo:
```
target/cucumber-html-reports
```
