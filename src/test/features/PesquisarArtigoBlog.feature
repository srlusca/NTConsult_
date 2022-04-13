#language: pt
#enconding: UTF-8
#author: Lucas da Silva Moreira
#version: 1.0

Funcionalidade: Pesquisar Artiglo Blog

  Contexto:
    Dado que acessei o site da Blog do Agi


  @funcionalidade_pesquisa_artigos @CT_001 @regression
  Cenario: Validar se é possivél visualizar o campo 'Pesquisar' ao clicar no botão 'abrir pesquisa de artigos'
    Quando clico no botão 'abrir pesquisa de artigos'
    Entao devo visualizar o campo de 'Pesquisa'

  @funcionalidade_pesquisa_artigos @CT_002 @regression
  Esquema do Cenario: Cenario: Validar se o resultado da busca é o mesmo com o dado inserido no campo pesquisa
    E clico no botão abrir pesquisa de artigos do blog
    Quando insiro os dados no campo de 'Pesquisa' "<inputPesquisa>"
    E clico no botão 'Submit'
    Entao devo visualizar os resultados da busca por "<inputPesquisa>"

    Exemplos:
      | inputPesquisa    |
      | Imposto de Renda |
    #  | Vagas            |