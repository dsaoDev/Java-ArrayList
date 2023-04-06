package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	//atributos
	private int quantidade;
	private Pessoa proprietarioDaLoja;
	private ArrayList<Carro> carrosCadastrados = new ArrayList<>();
	
	
	//construtor vazioS
	public Loja() {
		
	}
	//construtor padrao
	public Loja(int quantidade, Pessoa proprietarioDaLoja) {
		super();
		this.quantidade = quantidade;
		this.proprietarioDaLoja = proprietarioDaLoja;
	}
	
	public void switchCase() {
		Loja loja = new Loja();
		Scanner sc = new Scanner(System.in);
		Scanner scNumeros = new Scanner(System.in);
		boolean rodando = true;
		while(rodando) {
		System.out.println();
		System.out.println("\t ->         BEM VINDO");
		System.out.println("\t [1] -> Cadastrar Carro na Loja");
		System.out.println("\t [2] -> Pesquisar Carro (Placa)");
		System.out.println("\t [3] -> Listagem de todos os carros");
		System.out.println("\t [4] -> Atualização de cadastro dos proprietarios dos carros");
		System.out.println("\t [5] -> Informações da Loja");
		System.out.println("\t [6] -> Finalizar Programa");
		System.out.print("\t------> Informe sua Opção: ");
		int opcao = scNumeros.nextInt();
		
		switch(opcao) {
		case 1:
			loja.addCarros();
			break;
		case 2:
			loja.PesquisarCarro();
			break;
		case 3:
			loja.listarCarros();
			break;
		case 4:
			loja.atualizarCadastroPessoa();
			break;
		case 5:
			loja.infoLoja();
			break;
		case 6:
			System.out.println("\t === Programa Finalizado ===");
			rodando = false;
			break;
		}
		}
	}
	public void infoLoja() {
		Loja loja = new Loja();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Davi Silva Alves");
		pessoa.setCpf("123.456.789-10");
        pessoa.setTelefone("81 12345678");		
        pessoa.setCnpj("01.123.345/1234-56");
        loja.setProprietarioDaLoja(pessoa);
        System.out.println();
        System.out.println("\t ###### PROPRIETARIO DA LOJA FUCTURA ######");
        System.out.println("\t Nome: " + loja.proprietarioDaLoja.getNome());
        System.out.println("\t CPF: " + loja.proprietarioDaLoja.getCpf());
        System.out.println("\t CNPJ: " + loja.proprietarioDaLoja.getCnpj());
        System.out.println("\t Telefone: " + loja.proprietarioDaLoja.getTelefone());
       
	}
	
	public void addCarros() {

		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		Pessoa pessoa = new Pessoa();
		System.out.println("\t === ABA DE CADASTRO DE CARROS ===");
		System.out.print("Marca: ");
		carro.setMarca(sc.nextLine());
		System.out.print("Modelo: ");
		carro.setModelo(sc.nextLine());
		System.out.print("Placa: ");
		carro.setPlaca(sc.nextLine());
		System.out.print("Ano: ");
		carro.setAno(sc.nextInt());
		System.out.print("Valor R$: ");
		sc.nextLine();
	    carro.setValorAproximado(sc.nextDouble());
	    System.out.print("Nome do Proprietario do Carro: ");
	    sc.nextLine();
	    pessoa.setNome(sc.nextLine());
	    System.out.print("CPF: ");
	    pessoa.setCpf(sc.nextLine());
	    System.out.print("Telefone: ");
	    pessoa.setTelefone(sc.nextLine());
	    
	    carro.setDonoDoCarro(pessoa);
	    
	    carrosCadastrados.add(carro);
	   
		
		
	}
	
	public void PesquisarCarro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t === ABA DE PESQUISA DE CARRO === ");
		System.out.println("Informe a placa do carro: ");
		String placaTemp = sc.nextLine();
		boolean carroExiste = false;
		
		for(int i=0; i<carrosCadastrados.size(); i++) {
			if(placaTemp.equals(carrosCadastrados.get(i).getPlaca())) {
				System.out.println("\t ==== CARRO ENCONTRADO ====");
				System.out.println("\t Placa: [" + carrosCadastrados.get(i).getPlaca() + "]");
				System.out.println("\t Marca: [" + carrosCadastrados.get(i).getMarca() + "]");
				System.out.println("\t Modelo: [" + carrosCadastrados.get(i).getModelo() + "]");
				System.out.println("\t Ano: [" + carrosCadastrados.get(i).getAno() + "]");
				System.out.println("\t Proprietario: [" + carrosCadastrados.get(i).getDonoDoCarro().getNome() + "]");
				System.out.println("\t CPF: [" + carrosCadastrados.get(i).getDonoDoCarro().getCpf() + "]");
				System.out.println("\t Telefone: [" + carrosCadastrados.get(i).getDonoDoCarro().getTelefone() + "]");
				carroExiste = true;
				break;
			
			}
		}
		
		if(carroExiste == false) {
			System.out.println("\t === CARRO NÃO CONSTA NO NOSSO SISTEMA ===\n");
			
		}
	}
	
	public void listarCarros() {
		if(carrosCadastrados.size() == 0) {
			System.out.println("\t === A LISTA ESTÁ VAZIA === ");
		}else {System.out.println("\t === LISTA DE CARROS ===");
			for(int i=0; i<carrosCadastrados.size(); i++) {
				System.out.println("\t          CARRO [" + i + "]");
				System.out.println("\t Placa: [" + carrosCadastrados.get(i).getPlaca() + "]");
				System.out.println("\t Marca: [" + carrosCadastrados.get(i).getMarca() + "]");
				System.out.println("\t Modelo: [" + carrosCadastrados.get(i).getModelo() + "]");
				System.out.println("\t Ano: [" + carrosCadastrados.get(i).getAno() + "]");
				System.out.printf("\t ValorAproximado R$: [%.2f]%n",carrosCadastrados.get(i).getValorAproximado());
				System.out.println("\t Proprietario: [" + carrosCadastrados.get(i).getDonoDoCarro().getNome() + "]");
				System.out.println("\t CPF: [" + carrosCadastrados.get(i).getDonoDoCarro().getCpf() + "]");
				System.out.println("\t Telefone: [" + carrosCadastrados.get(i).getDonoDoCarro().getTelefone() + "]");
				
				
			}
		}
	}
	
	public void atualizarCadastroPessoa() {
		Pessoa pessoa = new Pessoa();
        boolean atualizar = false;
		Scanner sc = new Scanner(System.in);
		if(carrosCadastrados.size() == 0) {
			System.out.println();
			System.out.println("\t Não foi Possivel atualizar o Cadastro pois no momento não há nenhum Usuario cadastrado");
		}else {
		System.out.println("\t === ABA DE ATUALIZAÇÃO DE CADASTROS ===");
		for(int i=0; i<carrosCadastrados.size(); i++) {
			System.out.println("\t Referencia do Proprietario [" + i + "]");
			System.out.println("\t Dono: [" + carrosCadastrados.get(i).getDonoDoCarro().getNome() + "]");
			System.out.println("\t CPF: [" + carrosCadastrados.get(i).getDonoDoCarro().getCpf() + "]");
			System.out.println("\t Telefone: [" + carrosCadastrados.get(i).getDonoDoCarro().getTelefone() + "]");
		}
		System.out.print("Informe a referencia do usuario que você deseja atualizar o cadastro: ");
		int referencia = sc.nextInt();
		System.out.print("Informe o novo nome: ");
		sc.nextLine();
		String novoNome = sc.nextLine();
		pessoa.setNome(novoNome);
		
		System.out.print("Informe o novo Cpf: ");
		String novoCpf = sc.nextLine();
		pessoa.setCpf(novoCpf);
		
		System.out.print("Informe o novo Telefone: ");
		String novoTelefone = sc.nextLine();
		pessoa.setTelefone(novoTelefone);
		
		Carro carro = carrosCadastrados.get(referencia);
		carro.setDonoDoCarro(pessoa);
		
		for(int i=0; i<carrosCadastrados.size(); i++) {
			if(carrosCadastrados.get(referencia).getDonoDoCarro().equals(carrosCadastrados.get(i).getDonoDoCarro())) {
				System.out.println("\t ATUALIZAÇÃO FEITA COM SUCESSO ");
				atualizar = true;
				break;
			}
		}
		
		if(atualizar == false) {
			System.out.println("ATUALIZAÇÃO FALHOU");
		}
		
		}
			
		}
		
	
	
	
	
	
  //getters and setters
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pessoa getProprietarioDaLoja() {
		return proprietarioDaLoja;
	}

	public void setProprietarioDaLoja(Pessoa proprietarioDaLoja) {
		this.proprietarioDaLoja = proprietarioDaLoja;
	}
	
	
	

}
