programa {
  funcao inicio() {
    /* Programa que calcula se o valor de um número está entre outros 2 pré-estabelecidos.
       Variável 1 = numero (variável inteira digitada pelo usuário)
       Variável 2 = x (variável inteira escolhida pelo programador)
       Variável 3 = y (variável inteira escolhida pelo programador)
       Variável 4 = expressao (variável lógica que calcula se o número escolhido pelo usuário confirma a declaração x < número < y)

    */
    logico expressao
    inteiro numero, x, y
    x =  5
    y =  22
    escreva ("Digite um número: ","\n")
    leia (numero)
    expressao = (x < numero) e (numero < y)
    escreva ("O número está entre 5 e 22? \n",expressao, ".")
  }
}
