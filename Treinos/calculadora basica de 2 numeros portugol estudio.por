programa {
  funcao inicio() { 
    /* programa que calcula as 4 operações basicas, assumindo que o usuario obedeceu as regras
     variavel 1 = número 1.
     variavel 2 = número 2.
     soma = a soma dessas 2 variaveis.
     divisão = um número dividido pelo outro.
     multiplicação = um número vezes o outro.
     subtração = um número menos o outro.
    */
   inteiro n1,n2,soma,subtracao,divisao,multiplicacao
    escreva("Informe dois números.\n")
    leia(n1)
    leia(n2)
    soma = n1+n2
    subtracao = n1-n2
    divisao = n1/n2
    multiplicacao = n1*n2
   escreva("O resultado da soma é: ",soma,".\n", "o resultado da subtração é: ",subtracao,"\n","o resultado da divisão é: ",divisao,"\n","o resultado da multiplicacao é: ",multiplicacao,"\n")
   escreva("é isso pessoal.")

  }
}
