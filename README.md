<div align="center">

# ENGENHEIRO QA (AUTOMAÇÃO) </br> Java - Cucumber - Selenium

</div>

Foi feito um projeto completo utilizando as tecnologias abaixo:

- **Java** - Linguagem de programação utilizada;
- **Maven** - Para gerenciar as dependências do projeto;
- **Cucumber** - Para utilizar o BDD na automação;
- **Selenium** - Framework de Testes Automatizados para Web.

## Arquitetura do Projeto

<div align="center">

<img src="files/arquitetura do projeto.png" style="width:600px; border: 1px solid #ff6000;">

**1° Imagem:** Aquitetura dos Testes Automatizados.

</div>

<div align="center">

## PASSO A PASSO PARA EXECUTAR AUTOMAÇÃO

</div>

### 1° - É necessário ter as seguintes tecnologias instaladas:

- *[Java](https://www.java.com/pt-BR/) (18.0.2);*
- *[Maven](https://maven.apache.org/) (3.8.1);*
- *[Intellij IDEA CE (Community Edition)](https://www.jetbrains.com/idea/download/) (2022.2).*

### 4° - Clonar o projeto do *[GitHub](https://github.com/)*:

Para ter acesso ao repositório:

```bash
    # CLONAR REPOSITÓRIO DA AUTOMAÇÃO
    git clone https://github.com/jacksonhmteixeira/JavaCucumberSeleniumAutomation.git
```
### 5° - Abrir o projeto no *[Intellij](https://www.jetbrains.com/idea/download/)*:

Para o desenvolvimento do teste automatizado foi utilizado o Intellij Community, no entanto, é recomendado ter a ferramenta instalada na máquina. Caso tenha instalado corretamente, abra o projeto clonado do GitHub.

### 6° - Alterar o local do driver do navegador para executar o projeto:

Para executar o projeto, é necessário apontar o caminho correto do driver. Para realizar a alteração segue a descrição da imagem:

- **Caminho**: *src/test/java/br/com/jackson/config/SeleniumDriverConfig.java*.

<div align="center">

<img src="files/caminho do driver.png" style="width:800px; border: 1px solid #ff6000;">

**3° Imagem:** Caminho para a alteração do local do arquivo driver do navegador.

</div>

### 6° - Arquivo para execução:

Para executar a automação, clicar com o botão direito na classe "**Runner**", selecionar a opção "**Run 'Runner'**":

<div align="center">

<img src="files/como executar os testes.png" style="width:600px; border: 1px solid #ff6000;">

**4° Imagem:** Local para clicar e executar a automação.

</div>

### Resultado obtido pela automação:

Após executar o teste automatizado, no log é apresentado o resultado da execução.
Abaixo está a demonstração:

<div align="center">

<img src="files/relatorio da execucao.png" style="width:600px; border: 1px solid #ff6000;">

</div>
