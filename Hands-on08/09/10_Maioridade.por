programa {
  funcao inicio() {
    /* Programa que calcula se a idade de uma pessoa é maior ou menor que 18.
       Variável 1 = idade (variável inteira digitada pelo usuário)
       Variável 2 = maioridade (variável lógica, que define se a idade é maior ou menor que 18 anos)
    */
    logico maioridade
    inteiro idade
    escreva ("Digite sua idade: ","\n")
    leia (idade)
    maioridade = (idade >= 18)
    escreva ("Sua maioridade é: ",maioridade, ".")
  }
}
