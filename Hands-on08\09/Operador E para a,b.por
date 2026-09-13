programa {
  funcao inicio() {
    /* Programa que calcula duas variáveis lógicas, a e b, em uma operação de E.
       Variável 1 = a (variável lógica com o valor determinado pela resposta do usuário)
       Variável 2 = b (variável lógica com o valor determinado pela resposta do usuário)
       operador E verifica se as duas variáveis são verdadeiras.
    */
    logico a , b
    escreva ("digite verdadeiro ou falso para a seguinte afirmação: está chovendo hoje.", "\n")
    leia (a)
    escreva ("digite verdadeiro ou falso para a seguinte afirmação: você trouxe um guarda-chuva.", "\n")
    leia (b)
    escreva ("O resultado é: ",a e b,".")
  }
}
