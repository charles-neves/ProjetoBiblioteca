package biblioteca;

import java.util.Scanner;
import java.util.LinkedList;



public class biblio {

	
	
		

public static void pesquisa_Aluno(LinkedList<Aluno> alunos) {
	
	System.out.println("Digite o nome do Aluno: ");
	String nomeAluno = new Scanner(System.in).nextLine();
	Aluno alunoEncontrado = pesquisa_Aluno(nomeAluno, alunos);
	if(alunoEncontrado == null) {
		System.out.println("Aluno nao encontrado.");
	} else {
		System.out.println("Aluno encontrado: ");
		System.out.printf("\nNome: %s", alunoEncontrado.nome);
		System.out.printf("\nRA: %d", alunoEncontrado.RA);
		System.out.printf("\nCurso: %s", alunoEncontrado.curso);
		System.out.printf("\nEmail: %s", alunoEncontrado.Email);
	}
}

public static void pesquisa_Livro(LinkedList<Livro> livro) {
	
	System.out.println("Digite o nome do Aluno: ");
	String tituloLivro = new Scanner(System.in).nextLine();
	Livro livroEncontrado = pesquisa_Livro(tituloLivro, livro);
	if(livroEncontrado == null) {
		System.out.println("Livro nao encontrado.");
	} else {
		System.out.println("Aluno encontrado: ");
		System.out.printf("\nNome: %s", livroEncontrado.titulo);
		System.out.printf("\nISBN: %d", livroEncontrado.ISBN);
		System.out.printf("\nCurso: %s", livroEncontrado.editora);
		System.out.printf("\nEmail: %s", livroEncontrado.ano);
	}
}

public static Aluno pesquisa_Aluno(String nome, LinkedList<Aluno> alunos){
  
	for (Aluno aluno : alunos){
    if (aluno.nome.equals(nome)){
      return aluno;
    }
  }

return null;

}

public static Livro pesquisa_Livro(String titulo, LinkedList<Livro> livros ){
  for(Livro livro: livros){
    if(livro.titulo.equals(titulo)){
      return livro;
    }
  }
  return null;
}


public static int menuPrincipal(Scanner ent){
	LinkedList<Aluno> listaAlunos = new LinkedList<>();
  	System.out.println("Escolha");
		System.out.println("");

		System.out.println("********************************* ");
		System.out.println("1 - Cadastrar dados do alunos  ");
		System.out.println("2 - Cadastrar livro  ");
		System.out.println("3 - Remover aluno ");
		System.out.println("4 - Remover livro ");
		System.out.println("5 - ver lista de alunos ");
		System.out.println("6 - ver lista de livros ");
		System.out.println("7 - pesquisar aluno ");
		System.out.println("8 - pesquisar livro ");
		
		System.out.println("********************************* ");
		System.out.println("");
		System.out.println("0 - Sair ");
		System.out.println("");
		
		
		return ent.nextInt();
		

}

public static Aluno alunoCadastro(Scanner ent) {
	
	Aluno aluno = new Aluno ();
	
	System.out.println("Digite o nome do aluno");
	aluno.nome = ent.nextLine();
	
	System.out.println("Digite o RA do aluno");
	aluno.RA = ent.nextInt();
	
	System.out.println("Digite o E-mail do aluno");
	aluno.Email = ent.nextLine();
	
	System.out.println("Digite o curso do aluno");
	aluno.curso = ent.nextLine();
	
	return aluno;
}

public static Livro livroCadastro(Scanner ent) {
	
	Livro livro = new Livro();
	
	System.out.println("Digite o titulo do livro");
	livro.titulo = ent.nextLine();
	
	System.out.println("Digite o ISBN do livro");
	livro.ISBN = ent.nextInt();
	
	System.out.println("Digite e editora do livro");
	livro.editora = ent.nextLine();
	
	System.out.println("Digite o ano do livro");
	livro.ano = ent.nextLine();
	
	return livro;
}





  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    System.out.println("digite um nome");

  String s =  ent.nextLine().substring(0,100);

    System.out.println(s);
  }
}