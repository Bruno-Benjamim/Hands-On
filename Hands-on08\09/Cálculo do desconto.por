programa {
  funcao inicio() {
    /* Programa que calcula o desconto de uma conta, o valor total da conta com o desconto.
     Variável 1 = valorConta (valor da conta inserida pelo usuário)
     Variável 2 = desconto (percentual do desconto)
     Variável 3 = valorDesconto (valor calculado do desconto)
     Variável 4 = valorTotal (valor da conta menos o valor do desconto)
    */ 
   real valorConta, valorTotal, desconto, valorDesconto
   escreva("Insira o valor da conta: ")
   leia(valorConta)
   escreva("Insira a porcentagem do desconto: ")
   leia(desconto)
   valorDesconto = (valorConta * desconto) / 100
   valorTotal = valorConta - valorDesconto
   escreva("O valor do desconto é de: ",valorDesconto,".\n")
   escreva("O valor total da conta é de: ",valorTotal,".\n")
  }
}