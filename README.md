# LP2 - Exercicios de Orientacao a Objetos

Repositorio com dois projetos Java independentes da disciplina de Linguagem de Programacao II.

## Estrutura

```
lp2/
├── lp2-exercicio1/   Whatsapp (heranca e classe abstrata)
└── lp2-exercicio2/   Dominio de Compras (interface)
```

Cada pasta e um projeto Maven separado, com seu proprio `pom.xml`.

## Requisitos

- Java 17 ou superior
- Maven (opcional, a IDE tambem abre os projetos)

## Exercicio 1 - Whatsapp

Pacote: `edu.fatec.lp2.exercicio1`

- `Contatinho`: nome e celular do contato.
- `Mensagem`: classe abstrata com destinatario, hora de envio e conteudo. Possui o metodo abstrato `sendMessage(String)`, que retorna a propria instancia.
- `MsgTexto`, `MsgAudio` e `MsgFoto`: tipos de mensagem que herdam de `Mensagem`.
- `Whatsapp`: guarda os arrays de contatos e mensagens, recebidos pelo construtor, e lista ambos.

Correcoes no diagrama:

- `contatos` e `mensagens` passaram a ser arrays.
- `toString()` retorna `String` em vez de `void`.

## Exercicio 2 - Dominio de Compras

Pacote: `edu.fatec.lp2.exercicio2`

- `Supermercado`: possui apenas o nome.
- `Produto`: dados do produto e o supermercado ao qual pertence. O `toString()` retorna o nome.
- `ItemCompra`: um produto, a quantidade e o desconto (em %), limitado entre 0 e o `descontoMaximo` do produto.
- `ListaCompra`: armazena itens ate a quantidade maxima definida no construtor.
- `Calculavel`: interface com `calcularPreco()`, implementada por `ItemCompra` e `ListaCompra`.

Correcoes no diagrama:

- As classes foram implementadas como concretas, pois precisam ser instanciadas.
- `ListaCompra` ganhou o atributo `qtdeItens` para controlar o limite de itens.

## Como executar

Abra a pasta do exercicio na IDE e execute a classe `Main` do pacote correspondente.
