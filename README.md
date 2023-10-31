# Aplicativo de Lista de Tarefas

Um simples aplicativo de Lista de Tarefas que permite ao usuário incluir, listar e excluir tarefas.

## Como usar

1. **Incluir Tarefa**: Clique no botão "Incluir" e insira o nome da tarefa na caixa de diálogo que aparece. A tarefa será adicionada à lista de tarefas.

2. **Listar Tarefas**: Clique no botão "Listar" para ver a lista de tarefas atual. Uma janela de diálogo exibirá as tarefas disponíveis.

3. **Excluir Tarefa**: Clique no botão "Excluir Lista de Tarefas" para excluir uma tarefa específica. Uma lista suspensa permitirá que você selecione a tarefa a ser excluída.

## Classes

### Classe `ListaDeTarefas`

Esta classe gerencia a interface do aplicativo e as operações de inclusão, listagem e exclusão de tarefas.

- `adicionarTarefa(Tarefa tarefa)`: Adiciona uma tarefa à lista.
- `listarTarefas()`: Lista as tarefas atualmente na lista.
- `excluirListaTarefas()`: Exclui uma tarefa específica da lista.

### Classe `Tarefa`

Esta classe representa uma tarefa com um código e um nome.

- `getCod_tarefa()`: Obtém o código da tarefa.
- `getNome_tarefa()`: Obtém o nome da tarefa.
- `setCod_tarefa(int cod_tarefa)`: Define o código da tarefa.
- `setNome_tarefa(String nome_tarefa)`: Define o nome da tarefa.

## Como executar

Você pode executar o aplicativo seguindo estas etapas:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Compile as classes `ListaDeTarefas` e `Tarefa`.
3. Execute a classe `ListaDeTarefas` para iniciar o aplicativo.

## Melhorias Futuras

Este aplicativo de Lista de Tarefas pode ser melhorado adicionando recursos adicionais, como a capacidade de editar tarefas existentes ou definir datas de vencimento para as tarefas.

Sinta-se à vontade para contribuir com melhorias ou personalizar o aplicativo de acordo com suas necessidades.

---

Este projeto foi criado como parte de um aprendizado em programação Java.

Autor: Seu Nome
