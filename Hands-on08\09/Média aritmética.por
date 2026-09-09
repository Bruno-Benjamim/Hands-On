programa {
  funcao inicio() {
    /* programa que calcula o valor de 3 números reais e calcula sua média aritimética.
     variavel 1 = n1 (número escolhido pelo usuario.)
     variavel 2 = n2 (número escolhido pelo usuario.)
     variavel 3 = n3 (número escolhido pelo usuario.)
     variavél 4 = media (a soma dos 3 números reais dividida por 3.)
    */ 
   real n1, n2, n3, media
   escreva("Escolha o primeiro número: ")
   leia(n1)
   escreva("Escolha o segundo número: ")
   leia(n2)
   escreva("Escolha o terceiro número: ")
   leia(n3)
   media = (n1 + n2 + n3) /3
   escreva("A média aritmética dos números ",n1,", ",n2," e ",n3,", é: ",media,".","\n")
  }
}