programa {
  funcao inicio() {
   /* programa que calcula sucessor e antecessor de um número inteiro.
     variavel 1 = numero inteiro. (escolhido pelo usuario)
     variavel 2 = antecessor. (o número menos 1)
     variavel 3 = sucessor. (o número mais 1)
   */ 
   inteiro numero, antecessor, sucessor
   escreva("Escolha um número inteiro: ")
   leia(numero)
   antecessor=numero-1
   sucessor=numero+1
   escreva("O antecessor do ",numero," é: ",antecessor,".","\n")
   escreva("O sucessor do ",numero," é: ",sucessor,".","\n") 
  }
}
