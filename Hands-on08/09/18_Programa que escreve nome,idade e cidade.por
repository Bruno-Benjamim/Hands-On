programa {
  funcao inicio() {
    /* Programa que lê e depois escreve o nome, cidade e idade do usuário.
       Variável 1 = nome (variável cadeia escolhida pelo usuário)
       Variável 2 = idade (variável inteira escolhida pelo usuário)
       Variável 3 = cidade (variável cadeia escolhida pelo usuário)
    */
    cadeia nome, cidade
    inteiro idade
     escreva ("Insira seu nome.\n")
     leia (nome)
     escreva ("Insira sua idade.\n")
     leia (idade)
     escreva ("Insira a sua cidade.\n")
     leia (cidade)
     escreva ("Seu nome é ",nome,", tem ",idade, " anos"," e mora na cidade de ",cidade,".\n")
  }
}
