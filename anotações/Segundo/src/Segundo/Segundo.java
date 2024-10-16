package Segundo;

public class Segundo {
	public static void main (String[] args) {
		
		double LivroJava8;
		double LivroTDD;
		LivroJava8 = 59.90;
		LivroTDD = 59.90;
		double soma = LivroJava8 + LivroTDD;
		System.out.println("A soma é: "+soma);
		
		Livro livro = new Livro();
		livro.nome = "Livro Java 8";
		livro.descricao = "Novos recursos";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		
		
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-10";
		
		livro.autor = autor;
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "Paulo Silveira";
		outroAutor.email = "paulo.silveria@caelum.com";
		outroAutor.cpf = "123.456.789-10";
		
		outroLivro.autor = outroAutor;
		outroLivro.mostrarDetalhes();
		
	}
}
