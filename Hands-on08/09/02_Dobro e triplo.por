programa {
  funcao inicio() {
    /* programa que calcula dobro e triplo de um número inteiro.
     variavel 1 = numero inteiro. (escolhido pelo usuario)
     variavel 2 = dobro. (o número multiplicado 2)
     variavel 3 = triplo. (o número multiplicado por 3)
    */ 
   inteiro numero, dobro, triplo
   escreva("Escolha um número inteiro: ")
   leia(numero)
   dobro = numero*2
   triplo = numero*3
   escreva("O dobro do ",numero," é: ",dobro,".","\n")
   escreva("O triplo do ",numero," é: ",triplo,".","\n") 
  }
}
