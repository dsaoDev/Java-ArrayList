package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca  {
	// -> Atributos
	private String nome;
	private String local;
	private int capacidade;
	private int sessao;
	private ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();

	
	//-> Construtor Vazio
	public Biblioteca() {
		
	}
	
	
	// -> Construtor padrão
	
	public Biblioteca(String nome,String local,int capacidade,int sessao) {
		this.nome = nome;
		this.local = local;
		this.capacidade = capacidade;
		this.sessao = sessao;
	}
	
	// -> Metodos obrigatorios
	// -> Cadastro de Livros
	public void cadastrarLivro() {
		
		Livro livro = new Livro();
		boolean livroCadastrado = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t ===== Cadastro de Livros =====");
		System.out.println("\t -> Cadastro iniciado ");
		System.out.print("Informe o Titulo: ");
		livro.setTitulo(sc.nextLine());
		System.out.print("Informe o Autor: ");
		livro.setNomeAutor(sc.nextLine());
		System.out.print("Informe o ISBN: ");
		livro.setIsbn(sc.nextLine());
		System.out.print("Informe o codigo: ");
		livro.setCodigo(sc.nextInt());
		System.out.print("Informe o número de Paginas: ");
		sc.nextLine();
		livro.setNumeroPaginas(sc.nextInt());
		sc.nextLine();
		System.out.print("Informe o valor do Livro R$: ");
		livro.setValorLivro(sc.nextDouble());
		System.out.print("Informe a Edição: ");
		sc.nextLine();
		livro.setEdicao(sc.nextLine());
		System.out.print("Informe o Volume: ");
		livro.setVolume(sc.nextLine());
		
		listaDeLivros.add(livro);
		for(int i=0; i<listaDeLivros.size(); i++) {
			if(livro.getIsbn().equals(listaDeLivros.get(i).getIsbn())) {
				livroCadastrado = true;
				break;
			}
		}
		if(livroCadastrado == true) {
			System.out.println("\t -> Cadastro de Livro realizado com Sucesso");
		}else {
			System.out.println("\t -> Ocorreu um erro ao Cadastrar o Livro");
		}
		

	}
	//metodos Obrigatorios
	// Metodo de Pesquisa do Livro a partir do ISBN
	public void pesquisarLivroISBN() {

		boolean livroEncontrado = false;
		if(listaDeLivros.size() == 0) {
			System.out.println("\t Não é possivel pesquisar, pois no momento não há Livros cadastrados");
		}else {
		System.out.println("\t ===== Pesquisar Livros via ISBN =====");
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o ISBN do Livro que você está procurando: ");
		String isbnTemp = sc.nextLine();
		for(int i=0;i<listaDeLivros.size(); i++) {
			if(isbnTemp.equals(listaDeLivros.get(i).getIsbn())) {
				System.out.println("\t === Livro Encontrado === ");
				System.out.println("\t Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
				System.out.println("\t Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
				System.out.println("\t Número de Paginas -> " + listaDeLivros.get(i).getNumeroPaginas());
				System.out.printf("\t Valor do Livro -> R$ %.2f%n",listaDeLivros.get(i).getValorLivro());
				livroEncontrado = true;
				break;
			}
		}
		
		if(livroEncontrado == false) {
			System.out.println("=== ISBN digitado não consta no nosso Sistema ===");
		}
		}
	}
	
	//Metodos obrigatorios
	//Pesquisar livro a partir do Titulo
	public void pesquisarLivroTitulo() {
		
		
		boolean livroEncontrado = false;
		if(listaDeLivros.size() == 0) {
			System.out.println("\t Não é possivel pesquisar, pois no momento não há Livros cadastrados");
		}else {
			Scanner sc = new Scanner(System.in);
		System.out.println("\t ===== Pesquisar Livros via Titulo =====");
		System.out.print("Informe o Titulo do Livro que você está procurando: ");
		String tituloTemp = sc.nextLine();
		for(int i=0;i<listaDeLivros.size(); i++) {
			if(tituloTemp.equals(listaDeLivros.get(i).getTitulo())) {
				System.out.println("\t === Livro Encontrado === ");
				System.out.println("\t Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
				System.out.println("\t Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
				System.out.println("\t Número de Paginas -> " + listaDeLivros.get(i).getNumeroPaginas());
				System.out.printf("\t Valor do Livro -> R$ %.2f%n",listaDeLivros.get(i).getValorLivro());
				System.out.println("\t ISBN -> " + listaDeLivros.get(i).getIsbn());
				livroEncontrado = true;
				break;
			}
		}
		
		if(livroEncontrado == false) {
			System.out.println("=== Titulo digitado não consta no nosso Sistema === ");
		}
		}
		
	}
	//Metodos obrigatorios
	//Metodo Remoção de Livros a partir do Titulo
	public void removerLivroPorTitulo() {
		if(listaDeLivros.size() ==0 ) {
			System.out.println("\t Não é possivel remover pois no momento não há Livros cadastrados");
		}else {
	
		boolean sucessoAoRemover = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t ===== Remoção de Livros via Titulo ===== ");
		System.out.print("Informe o Titulo do Livro que você deseja remover: ");
		String tituloTemp = sc.nextLine();
		
		for(int i=0; i<listaDeLivros.size(); i++) {
			if(tituloTemp.equals(listaDeLivros.get(i).getTitulo())) {
				listaDeLivros.remove(i);
				sucessoAoRemover = true;
				break;
			}
		}
		
		if(sucessoAoRemover == true) {
			System.out.println("\t Livro removido com Sucesso");
		}else {
			System.out.println("\t Livro digitado não existe no sistema // Usuario digitou errado");
		}
		}
		
	}
	//Metodos obrigatorios
	//Metodo de Listar os Livros cadastrados
	public void listarLivros() {
		if(listaDeLivros.size() == 0) {
			System.out.println("\t ===== A Lista está VAZIA =====");
		}else {
			for(int i=0; i<listaDeLivros.size(); i++) {
				System.out.println("\t ===== Lista de Livros =====");
				System.out.println("\t          Livro [" + (i+1) + "]" );
				System.out.println("\t Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
				System.out.println("\t Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
				System.out.println("\t ISBN -> " + listaDeLivros.get(i).getIsbn());
				System.out.println("\t Codigo -> " + listaDeLivros.get(i).getCodigo());
				System.out.println("\t Número de Paginas -> " + listaDeLivros.get(i).getNumeroPaginas());
				System.out.printf("\t Valor -> R$ %.2f%n",listaDeLivros.get(i).getValorLivro());
				System.out.println("\t Edição -> " + listaDeLivros.get(i).getEdicao());
				System.out.println("\t Volume -> " + listaDeLivros.get(i).getVolume());
				System.out.println("====================================================");
				
			}
		}
	}
	
	// -> Metodos especiais 
	// -> UPDATE por ISBN
	public void atualizarLivroPorIsbn() {
		
		
		Livro livro = new Livro();
	
		boolean livroAtualizado = false;
		
		if(listaDeLivros.size() ==0) {
			System.out.println("\t Não é possivel atualizar pois no momento não há Livros cadastrados");
		}else {
			Scanner sc = new Scanner(System.in);
		System.out.println("\t === Atualizar ISBN do Livro ===");
		for(int i=0; i<listaDeLivros.size(); i++) {
			System.out.println("\t Livro Cadastrado [" + (i+1) + "]" );
			System.out.println("\t Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
			System.out.println("\t Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
			System.out.println("\t ISBN -> " + listaDeLivros.get(i).getIsbn());
			System.out.println("====================================================");
		}
		
		System.out.print("Informe qual Livro cadastrado você deseja atualizar: ");
		int referencia = sc.nextInt() -1;

		
		
        try {
		livro = listaDeLivros.get(referencia);
		System.out.print("Informe o novo ISBN: ");
		sc.nextLine();
        String novoIsbn = sc.nextLine();
		livro.setIsbn(novoIsbn);
        }catch(IndexOutOfBoundsException e) {
			//
		}
		
		for(int i=0; i<listaDeLivros.size(); i++) {
			try {
			if(listaDeLivros.get(referencia).getIsbn().equals(listaDeLivros.get(i).getIsbn())) {
				System.out.println("\t ISBN Atualizado com Sucesso vá até o painel para ver ");
				livroAtualizado = true;
				break;
			}
			}catch(IndexOutOfBoundsException e) {
				System.out.println("\t Você digitou uma referencia que ainda não existe no banco de dados");
				break;
			}
		}
		
		if(livroAtualizado == false) {
			System.out.println("\t      Atualização Falhou ...");
		}
		}
	}
	
	//-> Metodos especiais
	//-> UPDATE por Titulo
	public void atualizarLivroPorTitulo() {
		Livro livro = new Livro();
		
		boolean livroAtualizado = false;
		if(listaDeLivros.size() == 0) {
			System.out.println("\t Não é possivel atualizar, pois no momento não há Livros cadastrados");
		}else {
			Scanner sc = new Scanner(System.in);
		System.out.println("\t === Atualizar Livro via Titulo ===");
		for(int i=0; i<listaDeLivros.size(); i++) {
			System.out.println("\t Livro Cadastrado [" + (i+1) + "]" );
			System.out.println("\t Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
			System.out.println("\t Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
			System.out.println("\t ISBN -> " + listaDeLivros.get(i).getIsbn());
			System.out.println("====================================================");
			
		}
	
		
		System.out.print("Informe qual Livro cadastrado você deseja atualizar: ");
		int referencia = sc.nextInt() -1;


 
        try {
		livro = listaDeLivros.get(referencia);
		System.out.print("Informe o novo Titulo: ");
		sc.nextLine();
        String novoTitulo = sc.nextLine();
		livro.setTitulo(novoTitulo);
        }catch(IndexOutOfBoundsException e) {
        	
        }
		
		for(int i=0; i<listaDeLivros.size(); i++) {
			try {
			if(listaDeLivros.get(referencia).getTitulo().equals(listaDeLivros.get(i).getTitulo())) {
				System.out.println("\t Titulo Atualizado com Sucesso vá até o painel para ver ");
				livroAtualizado = true;
				break;
			}
			}catch(IndexOutOfBoundsException e) {
				System.out.println("\t Você digitou uma referencia que ainda não existe no banco de dados");
				break;	
			}
		}
		if(livroAtualizado == false) {
			System.out.println("\t       Atualização falhou...");
		}
		
		}
		
	}
	
	//Metodos especiais
	// -> Pesquisar Livro partindo do Autor (Se tiver mais de um Livro com o mesmo autor tem que ser impresso todos os  LIVROS do autor)
	public void pesquisarLivroPorAutor() {

		
		
		if(listaDeLivros.size() == 0 ) {
			System.out.println("\t Não é possivel pesquisar, pois no momento não há Livros cadastrados");
		}else {
			Scanner sc = new Scanner(System.in);
		System.out.println("\t ===== Pesquisa de Livro via Autor ===== ");
		System.out.print("Informe o nome do Autor: ");
		String nomeAutorTemp = sc.nextLine();
		boolean pesquisar = false;
		
		System.out.println("\t === Livros do Autor mencionado  === ");
		for(int i=0; i<listaDeLivros.size(); i++) {
			if(nomeAutorTemp.equals(listaDeLivros.get(i).getNomeAutor())) {
				System.out.println("\t Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
				System.out.println("\t Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
				System.out.println("\t ISBN -> " + listaDeLivros.get(i).getIsbn());
				pesquisar = true;
				System.out.println("=============================================");
			}
		}
		if(pesquisar == false) {
			System.out.println("\t === Infelizmente não encontramos Livros do autor mencionado ===");
		}
		}
	}
	
	//Metodos especiais
	// -> Remover Livro partindo do Autor (Se houver mais de um Livro com o mesmo AUTOR, apague os Todos os livros do autor cadastrados)
	public void removerLivroPorAutor() {
		
		if(listaDeLivros.size() == 0) {
			System.out.println("\t Não é possivel remover, pois no momento não há Livros cadastrados");
		}else {	Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do Autor do Livro que você deseja remover");
		String autorTemp = sc.nextLine();
		boolean remover = false;
		
		for(int i=0; i<listaDeLivros.size(); i++ ) {
			if(autorTemp.equals(listaDeLivros.get(i).getNomeAutor())) {
				listaDeLivros.removeIf(listaDeLivros -> listaDeLivros.getNomeAutor().equals(autorTemp));
				remover = true;
			}
		}
		if(remover == true) {
			System.out.println("\t === Livros removidos com Sucesso ===");
		}else{
			System.out.println("\t === Falha ao Remover === ");
		}
		
		}
	}
	//Metodo Especial de Leitura
	public void relatorioLeitura() {
		
		System.out.println("\t         ===== RELATORIO =====");
		boolean usuarioAdquiriuLivros = false;
		Scanner sc = new Scanner(System.in);
		if(listaDeLivros.size() == 0) {
			System.out.println("\t Usuario não adquiriu nenhum Livro");
			System.out.println();
		}else {	
	     System.out.println("Quantidade de Livros adquiridos pelo Usuario: " + listaDeLivros.size());
			for(int i=0;i<listaDeLivros.size(); i++) {
				System.out.println("->       Livro [" + (i+1) + "]");
			   System.out.println("Titulo do Livro -> " + listaDeLivros.get(i).getTitulo());
			   System.out.println("Nome do Autor -> " + listaDeLivros.get(i).getNomeAutor());
			   System.out.println("==========================================");
			   usuarioAdquiriuLivros = true;
			}
		}
		try {
		if(usuarioAdquiriuLivros == true) {
		System.out.print("qual dos livros você está lendo no momento [Informe a referencia]: ");
		int referencia = sc.nextInt() - 1;
		sc.nextLine();
		
		System.out.print("Informe sua ultima Pagina lida do livro selecionado: ");
		int paginaAtual = sc.nextInt();
		
		int passagemDePagina = paginaAtual + 1;
		
		 int calculoPaginas = listaDeLivros.get(referencia).getNumeroPaginas() - paginaAtual - 1;
	   	System.out.print("Parabens Usuario você se encontra na Pagina: " + passagemDePagina + "\n");
	   	System.out.print("Faltam Apenas " + calculoPaginas + " Paginas continue !!!!\n");
		
		}
		}catch(Exception e) {
			System.out.println("\t     Você digitou uma referencia de Livro que não consta no Banco de dados");
		}finally {
			System.out.println("\t      Retornado ao programa ...");
		}
		
		
	}
		
	//informacoes da biblioteca
	public void infoBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setNome("Biblioteca Fuctura");
		biblioteca.setLocal("R. Nicarágua, 159 - Espinheiro, Recife - PE, 52020-190");
		biblioteca.setCapacidade(50);
		biblioteca.setSessao(15);
		
		System.out.println("\t            ===== " + biblioteca.getNome() + " =====");
		System.out.println("\t Endereço: " + biblioteca.getLocal());
		System.out.println("\t Quantidade de pessoas suportadas no local -> " + biblioteca.getCapacidade());
		System.out.println("\t Sessões na biblioteca -> " + biblioteca.getSessao());
	}
	

	//MENU switchCase
	public void MenuSwitchCase() {
		
		Biblioteca biblioteca = new Biblioteca();
		boolean rodando = true;
		Scanner sc = new Scanner(System.in);
		while(rodando) {
			System.out.println();
			System.out.println("    1-5 [Metodos Obrigatorios] // 6-11 [Metodos Especiais]");
			System.out.println("\t              BEM VINDO ");
			System.out.println("\t [1] -> Cadastro de Livros na Biblioteca");
			System.out.println("\t [2] -> Pesquisar Livro via ISBN");
			System.out.println("\t [3] -> Pesquisar Livro via Titulo");
			System.out.println("\t [4] -> Remover Livro via Titulo");
			System.out.println("\t [5] -> Listar Livros Cadastrados   ");
			System.out.println("\t [6] -> Atualizar Livro via Titulo");
			System.out.println("\t [7] -> Atualizar Livro via ISBN");
			System.out.println("\t [8] -> Pesquisar Livro a partir do Autor [Nota: Listando todos os livros escritos pelo Autor]");
			System.out.println("\t [9] -> Remover Livro a partir do Autor   [Nota: Apagando todos os livros escritos pelo Autor]");
			System.out.println("\t [10] -> Relatorio de Leitura do Usuario");
			System.out.println("\t [11] -> Ver Informações da Biblioteca ");
			System.out.println("\t [0] -> Finalizar Programa ");
			System.out.print("\t -----> Informe sua opção: ");
			String opcao = sc.next();
			System.out.println();
			switch (opcao) {
			
			case "1" :
				biblioteca.cadastrarLivro();
				break;
				
			case "2" :
				biblioteca.pesquisarLivroISBN();
				break;
				
			case "3" :
				biblioteca.pesquisarLivroTitulo();
				break;
				
			case "4" :
				biblioteca.removerLivroPorTitulo();
				break;
				
			case "5" :
				biblioteca.listarLivros();
				break;
				
			case "6" :
				biblioteca.atualizarLivroPorTitulo();
				break;
				
			case "7" :
				biblioteca.atualizarLivroPorIsbn();
				break;
				
			case "8" :
				biblioteca.pesquisarLivroPorAutor();
				break;
				
			case "9" :
				biblioteca.removerLivroPorAutor();
				break;
				
			case "10" :
				biblioteca.relatorioLeitura();
				break;
				
			case "11" :
				biblioteca.infoBiblioteca();
				break;
				
			case "0" :
				System.out.println("\t ===    Volte Sempre     ===");
				System.out.println("\t === Programa Finalizado ===");
				rodando = false;
				break;
			}
		}
	}
	
	

	// -> Getters and Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public int getSessao() {
		return sessao;
	}


	public void setSessao(int sessao) {
		this.sessao = sessao;
	}
	

	
}
