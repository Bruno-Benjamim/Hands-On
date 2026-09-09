programa {
  funcao inicio() {
    /* Programa que calcula o consumo médio de combustível de um veículo, em km/L
     Variável 1 = quilômetros (valor de quilômetros rodados pelo usuário)
     Variável 2 = litros (valor do combustível gasto pelo veículo escolhido pelo usuário)
     Variável 3 = consumo (cálculo de consumo médio do veículo sendo: quilômetros/litros)
    */ 
   real quilometros, litros, consumo
   escreva("Insira os quilômetros rodados pelo  veículo: ")
   leia(quilometros)
   escreva("Insira o combustível gasto pelo  veículo: ")
   leia(litros)
   consumo = quilometros / litros
   escreva("O consumo médio de combustível do veículo é de:  ",consumo," km/L.\n")
  }
}