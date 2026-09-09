programa {
  funcao inicio() {
    /* Programa que calcula a área de um círculo, considerando π = 3,14.
     Variável 1 = PI (valor de π escolhido pelo programador)
     Variável 2 = raio (valor do raio do círculo escolhido pelo usuário)
     Variável 3 = area (cálculo de π vezes o raio ao quadrado)
    */ 
   real PI, raio, area
   escreva("Insira o raio do círculo: ")
   leia(raio)
   PI = 3.14
   area = PI * (raio * raio)
   escreva("A área do círculo é ",area," metros quadrados.\n")
  }
}