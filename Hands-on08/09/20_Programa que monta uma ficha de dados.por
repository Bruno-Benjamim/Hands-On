programa {
  funcao inicio() {
    /* Programa que lê e monta uma ficha completa dos dados de um aluno.
       Variável 1 = nome (variável cadeia escolhida pelo usuário)
       Variável 2 = idade (variável inteira escolhida pelo usuário)
       Variável 3 = notaFinal (variável real escolhida pelo usuário)
       Variável 4 = genero (variável caracter escolhida pelo usuário)
       Variável 5 = matricula (variável lógica, indicando se o aluno está ou não matriculado.)
    */
    cadeia nome
    inteiro idade
    real notaFinal
    caracter genero
    logico matricula
     escreva ("Insira seu nome completo.\n")
     leia (nome)
     escreva ("Insira sua idade.\n")
     leia (idade)
     escreva ("Insira a sua nota final do semestre.\n")
     leia (notaFinal)
     escreva ("Digite M se seu gênero for masculino e F se for feminino.\n")
     leia (genero)
     escreva ("Escreva verdadeiro ou falso para a seguinte afirmação: Você está matriculado.\n")
     leia (matricula)
     escreva ("Seus dados completos são: \n", "Nome: ",nome,".\n", "Idade: ",idade," anos.\n", "Gênero: ",genero,".\n", "Está matriculado: ",matricula,".\n", "Nota final: ",notaFinal,".\n")
  }
}
