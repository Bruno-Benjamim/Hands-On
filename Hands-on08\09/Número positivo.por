programa {
  funcao inicio() {
    /* Programa que calcula se um número é positivo.
       Variável 1 = numero (variável real digitada pelo usuário)
       Variável 2 = positivo (variável lógica que define se o número é positivo, ou seja, maior que zero)
    */
    logico positivo
    real numero
    escreva ("Digite um número: ","\n")
    leia (numero)
    positivo = (numero > 0.0)
    escreva ("O teste sobre seu número ser positivo é: ",positivo, ".")
  }
}
