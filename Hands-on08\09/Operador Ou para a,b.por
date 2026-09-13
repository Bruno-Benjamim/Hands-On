programa {
  funcao inicio() {
    /* Programa que calcula duas variáveis lógicas, a e b, em uma operação de OU.
       Variável 1 = a (variável lógica com o valor determinado pela resposta do usuário)
       Variável 2 = b (variável lógica com o valor determinado pela resposta do usuário)
       operador OU verifica se uma das duas variáveis é verdadeira.
    */
    logico a , b
    escreva ("digite verdadeiro ou falso para a seguinte pergunta: Você gosta de música?", "\n")
    leia (a)
    escreva ("digite verdadeiro ou falso para a seguinte pergunta: Você assiste filmes?", "\n")
    leia (b)
    escreva ("O resultado de gostar de música ou filme é: ",a ou b,".")
  }
}
