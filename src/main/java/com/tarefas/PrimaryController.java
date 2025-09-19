package com.tarefas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;


import java.time.LocalDate;

public class PrimaryController {

    @FXML
    private TextField descricaoField;

    @FXML
    private ComboBox<String> categoriaBox;

    @FXML
    private DatePicker prazoPicker;

    @FXML
    private TableView<Tarefa> tabelaTarefas;

    @FXML
    private TableColumn<Tarefa, String> colDescricao;

    @FXML
    private TableColumn<Tarefa, String> colCategoria;

    @FXML
    private TableColumn<Tarefa, String> colPrazo;

    @FXML
    private TableColumn<Tarefa, Boolean> colConcluida;

    private ObservableList<Tarefa> listaTarefas;

    @FXML
    private void initialize() {
        // Inicializa a lista de tarefas
        listaTarefas = FXCollections.observableArrayList();
        tabelaTarefas.setItems(listaTarefas);

        // Inicializa categorias
        categoriaBox.setItems(FXCollections.observableArrayList("Trabalho", "Pessoal", "Estudos"));

        // Configura colunas da tabela
        colDescricao.setCellValueFactory(data -> data.getValue().descricaoProperty());
        colCategoria.setCellValueFactory(data -> data.getValue().categoriaProperty());
        colPrazo.setCellValueFactory(data -> data.getValue().prazoProperty());
        colConcluida.setCellValueFactory(data -> data.getValue().concluidaProperty());

        // Exibe checkbox na coluna "Concluída"
        colConcluida.setCellFactory(CheckBoxTableCell.forTableColumn(colConcluida));
    }

    @FXML
    private void adicionarTarefa() {
        String descricao = descricaoField.getText();
        String categoria = categoriaBox.getValue();
        LocalDate prazo = prazoPicker.getValue();

        if (descricao == null || descricao.isEmpty() || categoria == null || prazo == null) {
            mostrarAlerta("Erro", "Preencha todos os campos!");
            return;
        }

        Tarefa nova = new Tarefa(descricao, categoria, prazo.toString());
        listaTarefas.add(nova);

        // Limpa os campos
        descricaoField.clear();
        categoriaBox.getSelectionModel().clearSelection();
        prazoPicker.setValue(null);
    }

    @FXML
    private void concluirTarefa() {
        Tarefa selecionada = tabelaTarefas.getSelectionModel().getSelectedItem();
        if (selecionada != null) {
            selecionada.setConcluida(true);
            tabelaTarefas.refresh();
        } else {
            mostrarAlerta("Advertência", "Selecione uma tarefa para concluir!");
        }
    }

    @FXML
    private void removerTarefa() {
        Tarefa selecionada = tabelaTarefas.getSelectionModel().getSelectedItem();
        if (selecionada != null) {
            listaTarefas.remove(selecionada);
        } else {
            mostrarAlerta("Advertência", "Selecione uma tarefa para remover!");
        }
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
