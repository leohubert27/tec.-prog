package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        // Inserindo nomes
        System.out.println("Insira nomes (digite 'sair' para parar):");
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            listaNomes.add(nome);
            System.out.println("Nome adicionado: " + nome);
        }

        // Apagando nomes
        System.out.println("Digite um nome para remover da lista:");
        String nomeParaRemover = scanner.nextLine();
        if (listaNomes.remove(nomeParaRemover)) {
            System.out.println("Nome removido: " + nomeParaRemover);
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        // Consultando o tamanho da lista
        System.out.println("A lista contém " + listaNomes.size() + " nomes.");

        // Pesquisando se uma pessoa está na lista
        System.out.println("Digite um nome para pesquisar na lista:");
        String nomeParaPesquisar = scanner.nextLine();
        if (listaNomes.contains(nomeParaPesquisar)) {
            System.out.println(nomeParaPesquisar + " está na lista.");
        } else {
            System.out.println(nomeParaPesquisar + " não está na lista.");
        }

        // Imprimindo a lista toda
        System.out.println("Lista de nomes:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Limpando a lista
        System.out.println("Limpando a lista...");
        listaNomes.clear();
        System.out.println("A lista foi limpa. Ela contém " + listaNomes.size() + " nomes agora.");

        // Encerrando o programa
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
