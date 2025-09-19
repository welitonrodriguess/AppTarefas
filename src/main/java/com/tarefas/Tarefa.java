package com.tarefas;

import javafx.beans.property.*;

public class Tarefa {
    private final StringProperty descricao;
    private final StringProperty categoria;
    private final StringProperty prazo;
    private final BooleanProperty concluida;

    public Tarefa(String descricao, String categoria, String prazo) {
        this.descricao = new SimpleStringProperty(descricao);
        this.categoria = new SimpleStringProperty(categoria);
        this.prazo = new SimpleStringProperty(prazo);
        this.concluida = new SimpleBooleanProperty(false);
    }

    public String getDescricao() { return descricao.get(); }
    public String getCategoria() { return categoria.get(); }
    public String getPrazo() { return prazo.get(); }
    public boolean isConcluida() { return concluida.get(); }

    public void setConcluida(boolean concluida) { this.concluida.set(concluida); }

    public StringProperty descricaoProperty() { return descricao; }
    public StringProperty categoriaProperty() { return categoria; }
    public StringProperty prazoProperty() { return prazo; }
    public BooleanProperty concluidaProperty() { return concluida; }

    @Override
    public String toString() {
        return "[" + categoria.get() + "] " + descricao.get() + " - Prazo: " + prazo.get();
    }
}
