programa {
  funcao inicio() {
    /* Programa de duas variáveis lógicas que mostra suas quatro possibilidades no resultado para a operação a E b; a OU b.
       Variável 1 = a (variável lógica pré-determinada)
       Variável 2 = b (variável lógica pré-determinada)
       Operação mostra os quatro resultados de a E b; a OU b.
    */
    logico a, b
     a = verdadeiro
     b = falso
     escreva ("Quando a é ",a, " e b é ",b, ", a E b será: ",a e b," e a OU b será: ",a ou b,".\n")
     a = verdadeiro
     b = verdadeiro
     escreva ("Quando a é ",a, " e b é ",b, ", a E b será: ",a e b," e a OU b será: ",a ou b,".\n")
     a = falso
     b = verdadeiro
     escreva ("Quando a é ",a, " e b é ",b, ", a E b será: ",a e b," e a OU b será: ",a ou b,".\n")
     a = falso
     b = falso
     escreva ("Quando a é ",a, " e b é ",b, ", a E b será: ",a e b," e a OU b será: ",a ou b,".\n")
  }
}
