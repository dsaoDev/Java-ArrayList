package entities;


import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca  {

 private ArrayList<Livro> listaDeLivros = new ArrayList<>();
	

 public Biblioteca() {
		super();
		
	}


	
	  public void addLivro() {
		  Livro livro = new Livro();
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Titulo do Livro: ");
		  livro.setTitulo(sc.nextLine());
		  System.out.print("Autor do Livro: ");
		  livro.setAutor(sc.nextLine());
		  
		  listaDeLivros.add(livro);
		  System.out.println("\t Livro Adicionado ");
		  System.out.println();
	  }
	  
	  public void obterLivro() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Informe o titulo do Livro que você deseja obter: ");
		  String tituloTemp = sc.nextLine();
		  boolean obterLivro = false;
		  
		  for(int i=0; i<listaDeLivros.size(); i++) {
			  if(tituloTemp.equals(listaDeLivros.get(i).getTitulo())) {
				  System.out.println("Você obteve o Livro [" + listaDeLivros.get(i).getTitulo() + "]");
				  System.out.println();
				  obterLivro = true;
			  }
		  }
		  
		  if(obterLivro == false) {
			  System.out.println("O Livro que você digitou não consta no nosso Banco de dados\n");
		  }
		  
	  }
	
	  public void listarLivros() {
		  if(listaDeLivros.size() == 0) {
			  System.out.println("\t LISTA VAZIA\n");
		  }else {
		   System.out.println("\t === Lista de Livros === ");
		  for(int i=0; i<listaDeLivros.size(); i++) {
			  System.out.println("\t         Livro [" + i + "]");
			  System.out.println("\t Titulo: " + listaDeLivros.get(i).getTitulo()); 
			  System.out.println("\t Autor: " + listaDeLivros.get(i).getAutor());
			  System.out.println();
		  }
		  }
	  }
	
	public void removerLivros() {
       boolean removerLivro = false;
	Scanner sc = new Scanner(System.in);
	
		
		  System.out.println("Informe a referencia de Titulo do Livro que você deseja remover ");
		  String referenciaTitulo = sc.nextLine();
		  
		  for(int i=0; i<listaDeLivros.size(); i++) {
			  if(referenciaTitulo.equals(listaDeLivros.get(i).getTitulo())) {
				  listaDeLivros.remove(i);
				  removerLivro = true;
				  break;
			  }
		  }
		  if(removerLivro == true) {
			  System.out.println("\t Livro Removido com Sucesso");
			  System.out.println();
		  }else {
			  System.out.println("\t Livro não consta no nosso Banco de Dados");
			  System.out.println();
		  }
	}
	
	public void switchCase() {
		Biblioteca biblioteca = new Biblioteca();
		
		Scanner sc = new Scanner(System.in);
		boolean rodando = true;
		while(rodando) {
		System.out.println("\t [1] -> Adicionar Livros");
		System.out.println("\t [2] -> Obter Livro  a partir de Titulo");
		System.out.println("\t [3] -> Listar Livros adicionados");
		System.out.println("\t [4] -> Remover Livros");
		System.out.println("\t [5] -> Finalizar Programa");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			biblioteca.addLivro();
			break;
		case 2:
			biblioteca.obterLivro();
			break;
		case 3:
			biblioteca.listarLivros();
			break;
		case 4:
			biblioteca.removerLivros();
			break;
		case 5: 
			System.out.println("\t === PROGRAMA FINALIZADO ===");
			rodando = false;
			break;
		}
		}
	}
}
