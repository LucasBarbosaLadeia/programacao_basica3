package Streaming;

import java.util.LinkedList;
import java.util.List;

public class SistemaStreaming {
    private List<Filme> filmes;

    public SistemaStreaming() {
        filmes = new LinkedList<>();
    }

    // Adiciona um filme à lista
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    // Consulta a lista de filmes, retornando a lista na ordem de inserção
    public List<Filme> consultarFilmes() {
        return new LinkedList<>(filmes);
    }

    // Exibe todos os filmes na lista
    public void exibirFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme disponível.");
        } else {
            for (Filme filme : filmes) {
                System.out.println(filme);
            }
        }
    }

    public static void main(String[] args) {
        SistemaStreaming sistema = new SistemaStreaming();

        // Adicionando filmes
        sistema.adicionarFilme(new Filme("Top Gun: Maverick"));
        sistema.adicionarFilme(new Filme("O Rei Leão"));
        sistema.adicionarFilme(new Filme("O Chamado"));

        // Exibindo filmes
        System.out.println("Lista de filmes:");
        sistema.exibirFilmes();

        // Consultando filmes
        List<Filme> listaConsultada = sistema.consultarFilmes();
        System.out.println("\nFilmes consultados:");
        for (Filme filme : listaConsultada) {
            System.out.println(filme);
        }
    }
}