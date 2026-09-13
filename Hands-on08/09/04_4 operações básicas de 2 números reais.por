programa {
  funcao inicio() {
    /* Programa que recebe o valor de 2 números reais e calcula a soma, subtração, multiplicação e divisão deles.
     Variável 1 = n1 (número real escolhido pelo usuário.)
     Variável 2 = n2 (número real escolhido pelo usuário.)
     Variável 3 = soma (número 1 mais número 2.)
     Variável 4 = subtraçao (número 1 menos número 2.)
     Variável 5 = multiplicaçao (número 1 vezes número 2.)
     Variável 6 = divisao (número 1 dividido pelo número 2.)
    */ 
   real n1, n2, soma, subtracao, multiplicacao, divisao
   escreva("Escolha o primeiro número: ")
   leia(n1)
   escreva("Escolha o segundo número: ")
   leia(n2)
   soma = n1 + n2
   subtracao = n1 - n2
   multiplicacao = n1 * n2
   divisao = n1 / n2
   escreva("A soma dos números ",n1," e ",n2," é: ",soma,".\n")
   escreva("A subtração dos números ",n1," e ",n2," é: ",subtracao,".\n")
   escreva("A multiplicação dos números ",n1," e ",n2," é: ",multiplicacao,".\n")
   escreva("A divisão dos números ",n1," e ",n2," é: ",divisao,".\n")
  }
}
