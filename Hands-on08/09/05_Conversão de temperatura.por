programa {
  funcao inicio() {
    /* Programa que converte uma temperatura em Celsius para Fahrenheit.
     Variável 1 = celsius (número real escolhido pelo usuário)
     Variável 2 = fahrenheit (número real escolhido pelo usuário)
    */ 
   real celsius, fahrenheit
   escreva("Insira a temperatura em Celsius: ")
   leia(celsius)
   fahrenheit = (celsius * (9.0/5.0)) + 32
   escreva("A temperatura de ",celsius," graus Celsius, em Fahrenheit corresponde a: ",fahrenheit," graus Fahrenheit.\n")
  }
}
