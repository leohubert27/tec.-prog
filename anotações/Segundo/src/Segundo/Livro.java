package Segundo;

public class Livro {
	String nome;
	String descricao;
	Double valor;
	String isbn;
	
	Autor autor;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome do livro: " + nome);
		System.out.println("Descrição do livro: "+descricao);
		System.out.println("Valor do livro: "+valor);
		System.out.println("isbn do livro: "+isbn);
		System.out.println("--");
		
		System.out.println("Mostrando detalhes do autor");
		System.out.println("Nome: " + autor.nome);
		System.out.println("Email: " + autor.email);
		System.out.println("CPF: " + autor.cpf);
		System.out.println("--");
	}
}

