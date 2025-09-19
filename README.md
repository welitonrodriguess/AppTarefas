📋 Lista de Tarefas em JavaFX

Este é um projeto desenvolvido como desafio prático de JavaFX e Maven, com o objetivo de criar uma aplicação de lista de tarefas funcional e organizada.
O app permite adicionar, concluir e remover tarefas, além de utilizar recursos visuais como TableView, ComboBox, DatePicker e integração com FXML.

🚀 Funcionalidades

➕ Adicionar tarefa com descrição, categoria e prazo.

✅ Concluir tarefa através de um checkbox na tabela.

❌ Remover tarefa selecionada com aviso caso nenhuma esteja selecionada.

📑 Organização visual em uma interface JavaFX estruturada com FXML.

🛠️ Estrutura do projeto criada com Maven (plugins + dependências do OpenJFX).

🖥️ Tecnologias Utilizadas

Java 11

JavaFX (OpenJFX)

Controls

FXML

Graphics

Base

Maven (gerenciamento de dependências e build)

FXML para a interface gráfica

Git & GitHub para versionamento e publicação

📂 Estrutura do Projeto
src/
 └── main/
     ├── java/com/tarefas
     │   ├── App.java                # Classe principal
     │   ├── PrimaryController.java  # Lógica principal do app
     │   └── Tarefa.java             # Classe de modelo (descrição, categoria, prazo, concluída)
     │
     └── resources/com/tarefas
         ├── primary.fxml             # Interface principal
         └── secondary.fxml           # Interface secundária (opcional)

🏗️ Desafios do Desenvolvimento

Durante o desenvolvimento, vários desafios foram enfrentados e solucionados:

Configuração do JavaFX no Maven

Inclusão das dependências corretas (controls, fxml, graphics, base).

Uso do javafx-maven-plugin para rodar o projeto via mvn javafx:run.

Integração entre FXML e Controller

Erros iniciais como Error resolving onAction ao não casar métodos do FXML com o controller.

Solução: garantir que os métodos (adicionarTarefa, removerTarefa, concluirTarefa) estavam corretamente anotados com @FXML.

TableView com CheckBox

Problema inicial: CheckBoxTableCell cannot be resolved.

Solução: importar corretamente javafx.scene.control.cell.CheckBoxTableCell.

Controle de remoção de tarefas

Tratamento de erro quando nenhuma tarefa era selecionada, exibindo um Alert amigável.

Versionamento com Git/GitHub

Criação do repositório, commits iniciais, correção de erros no remote (link incorreto).

Publicação final no GitHub em main.

▶️ Como Executar

Clone este repositório:

git clone https://github.com/welitonrodriguess/AppTarefas.git


Entre na pasta do projeto:

cd AppTarefas/demo


Compile e rode com Maven:

mvn clean javafx:run

📸 Preview

![Lista-de-Tarefas APP](https://github.com/user-attachments/assets/d2581d99-df95-4ebc-ac27-5ef8e6eb380b)
<img width="791" height="634" alt="image" src="https://github.com/user-attachments/assets/92118f85-6aef-421c-8131-63b80db7ffb3" />
![Estudos-POO](https://github.com/user-attachments/assets/47c46298-8c96-4945-9a9d-33c6dc8399bb)
<img width="790" height="626" alt="image" src="https://github.com/user-attachments/assets/e90b7ca4-dfd2-42f2-98e9-21272838f2ee" />


✨ Autor

Desenvolvido por Weliton Rodrigues 👨‍💻
Estudante de Engenharia de Software e apaixonado por resolver problemas através da programação.
