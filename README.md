# Lista Encadeada Dupla e Circular

Atividade sobre listas encadeadas da matéria Estrutura de Dados.

## Introdução

### O que é uma lista encadeada?

É uma lista formada por nós que apontam para o próximo nó. Diferente de um Array, uma lista encadeada não precisa ter tamanho definido previamente, o que por um lado é bom pois não ficamos presos ao tamanho, mas por outro, os nós podem ficar espalhados pela memória. Além disso, não temos uma indexação como nos arrays, então para encontrarmos os elementos da lista temos que iterar por ela toda.
### E o que faz uma lista encadeada ser dupla?
Bom, resumindo, o que a faz ser dupla é que o nó agora terá, além do próximo elemento, o anterior. Sendo o nó: o primeiro elemento quando o anterior apontar para "null" ou o ultimo quando o próximo apontar para "null".
### Sobre a circularidade da lista:
A lista torna-se circular quando o ultimo elemento ao invés de apontar para "null", agora aponta para o primeiro elemento, criando assim uma circularidade. Já neste exemplo do código, além da circularidade temos a duplicidade da lista. Ou seja, o anterior do primeiro elemento aponta para o ultimo.
## Sobre o código
É valido ressaltar que ao adotarmos "ref" para ser a referência da lista, temos que assumir que "ref" pode ser o nó inicial ou o nó final, porém por convenção, iremos assumir que "ref" será o nó final.
### Inserção
O método de inserção deste código insere o próximo nó sempre no inicio. Verifica se a lista está vazia. Verifica se a lista tem um elemento, pois se tiver, como "ref.getProx()" será o próprio "ref" não podemos iterar no for loop.Portanto, a inserção tem que ser diferente: criamos o novo nó, o anterior e o prox de "ref" passam a ser o novo nó.

Caso não caiamos em nenhum destes casos, iteramos sobre a lista a partir do primeiro elemento "ref.getProx()", pois o próximo de "ref" é o primeiro. Quando encontrarmos o anterior do ponteiro "p" sendo igual a ref, isso significa que é o primeiro nó, o anterior do ponteiro "p" vai ser o novo nó, o próximo do novo nó será o ponteiro "p", o próximo do "ref" sera o novo nó e o anterior do novo nó sera o "ref". (escrevendo isso me veio outra abordagem na cabeça, futuramente discorrerei sobre)
