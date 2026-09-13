programa {
  funcao inicio() {
    /* Programa que lê três variáveis lógicas e mostra o resultado para a operação (A e B) ou C.
       Variável 1 = a (variável lógica com o valor determinado pela resposta do usuário)
       Variável 2 = b (variável lógica com o valor determinado pela resposta do usuário)
       Variável 3 = c (variável lógica com o valor determinado pela resposta do usuário)
       Operação mostra o resultado de  (A e B) ou C.
    */
    logico a, b, c
    escreva ("Digite verdadeiro ou falso para a seguinte afirmação: Você tem carro.", "\n")
    leia (a)
    escreva ("Digite verdadeiro ou falso para a seguinte afirmação: Você consegue ir com seu carro para a igreja.", "\n")
    leia (b)
    escreva ("Digite verdadeiro ou falso para a seguinte afirmação: Você consegue ir à igreja de alguma outra forma.", "\n")
    leia (c)

    escreva ("Então, a afirmação de que consegue ir na igreja é ",(a e b) ou c,".")
  }
}
