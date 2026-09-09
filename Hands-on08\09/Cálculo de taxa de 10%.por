programa {
  funcao inicio() {
    /* Programa que calcula 10% de uma conta, o valor total da conta com a taxa de 10% e a divisão entre 3 pessoas.
     Variável 1 = valorConta (valor da conta inserida pelo usuário)
     Variável 2 = taxa (valor da taxa de 10%)
     Variável 3 = valorTotal (valor da conta mais a taxa de 10%)
     Variável 4 = divisao (valor da conta total dividido por 3 pessoas)
    */ 
   real valorConta, valorTotal, divisao, taxa
   escreva("Insira o valor da conta: ")
   leia(valorConta)
   taxa = (valorConta * 10) / 100
   valorTotal = valorConta + taxa
   divisao = valorTotal / 3
   escreva("A taxa de 10% é no valor de: ",taxa,".\n")
   escreva("O valor total da conta é de: ",valorTotal,".\n")
   escreva("A conta total dividida para 3 pessoas, será de: ",divisao," para cada pessoa.\n")
  }
}