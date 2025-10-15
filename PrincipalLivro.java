package Atividades;

public class PrincipalLivro {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor ("SenLinYu");
		Livro livro = new Livro ("Alchemised" , autor);
		
		System.out.println("Livro: " + livro.getTitulo() + autor.getNome());
		
	}

}
