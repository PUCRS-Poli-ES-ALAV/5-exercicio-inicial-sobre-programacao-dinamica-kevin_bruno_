# Enunciado para exercício inicial sobre Programação Dinâmica

1. Dadas as três versões de implementação de Fibonacci abaixo:
    
    * implemente os algortimos;
    * teste todos para os inteiros 4, 8, 16, 32; 
    * teste os dois últimos também para os inteiro 128, 1000 e 10.000.
    
   ```java
   FIBO-REC (n)
      se n ≤ 1
      então devolva n
      senão a ← FIBO-REC (n − 1)
            b ← FIBO-REC (n − 2)
            devolva a + b
   ```
    
   ```java
   FIBO (n)
        f [0] ← 0 
	f [1] ← 1
	para i ← 2 até n faça
           f[i] ← f[i-1]+f[i-2]
  	devolva f [n]
   ```
    
   ```java
   MEMOIZED-FIBO (f, n)
	para i ← 0 até n faça
	     f [i] ← −1
	devolva LOOKUP-FIBO (f, n)

   LOOKUP-FIBO (f, n)
	se f [n] ≥ 0
        então devolva f [n]
	se n ≤ 1
	então f [n] ← n
	senão f [n] ← LOOKUP-FIBO(f, n − 1) + LOOKUP-FIBO(f, n − 2)
	devolva f [n]
   ```
    
1. Monte uma tabela com os resultados das execuções acima. As linhas da tabela são os algoritmos implementados, as colunas os valores para testar e contabilizar.

1. Resolva o problema da mochila conforme o enuciado em sala de aula. 
   1. Ache uma solução que testa todas as combinações possíveis e seleciona a melhor, aplicando divisão-e-conquista ou não;
   1. Contabilize o número de iterações;
   1. Implemente e teste sua solução, para o caso exposto em aula e outros de mesmo porte (;-)).

1. Implemente e teste o algorítmo da Mochila apresentado em aula. Contabilize o número de iterações e compare com sua versão de solução da aula anterior.

1. Resolva o problema da mochila utilizando o algoritmo com programação dinâmica visto em aula, teste e contabilize o número de iterações.

1. Monte uma tabela com os resultados e número de iterações de ambas a implementações, para os testes de casos disponíveis no moodle.

```javascript

   Inteiro backPackPD(Inteiro N, Inteiro C, Tupla<Inteiro, Inteiro> itens)

   N = número de produtos;

   C = capacidade real da mochila

   itens[N +1];   // (O índice 0 guarda null), Tupla com peso e valor

   maxTab[N+1][C+1];



   Inicialize com 0 toda a linha 0 e também a coluna 0;

   para i = 1 até N

      para j = 1 até C

         se item itens[i].peso <= j // se o item cabe na mochila atual

            maxTab[i][j] = Max(maxTab[i-1][j], 

                               itens[i].valor + 

                                 maxTab[i-1][j – itens[i].peso]);

         senão

            maxTab[i][j] = maxTab[i-1][j];



   retorne maxTab[N][C] // valor máximo para uma mochila de capacidade C e 		         

                        //que pode conter itens que vão do item 1 até o item N.

```

 N = número de produtos;
C = capacidade real da mochila

   itens[N +1]; (O índice 0 guarda null)
   
   maxTab[N+1][C+1];
   Inicialize com 0 toda a linha 0 e também a coluna 0;
   para i = 1 até N
   para j = 1 até C

   se item itens[i].peso <= j // se o item cabe na mochila atual
      maxTab[i][j] = Max(maxTab[i-1][j],
      itens[i].valor +
      maxTab[i-1][j – itens[i].peso]);
   senão
      maxTab[i][j] = maxTab[i-1][j];

   retorne maxTab[N][C] // valor máximo para uma mochila de capacidade C e
//que pode conter itens que vão do item 1 até o item N.
