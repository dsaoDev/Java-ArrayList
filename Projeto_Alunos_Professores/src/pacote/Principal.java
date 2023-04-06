package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Scanner p CHAR,STRINGS
		Scanner sc = new Scanner(System.in);
		//Scanner p NUMEROS NO GERAL
		Scanner scNumeros = new Scanner(System.in);
		//Lista de Alunos
		ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>(); 
		//Lista de Professores
		ArrayList<Professores> listaProfessores = new ArrayList<Professores>();
		
		//opcao p inicar o Programa
		int opcao;
		//boolean rodando = true p inicar o programa e finalizar quando for false
		boolean rodando = true;
		
		while (rodando) {
		System.out.println("====== [1] - CADASTRO DE ALUNOS ======");
		System.out.println("====== [2] - CADASTRO DE PROFESSORES ======");
		System.out.println("====== [3] - LISTAR CADASTRO DE ALUNOS ======");
		System.out.println("====== [4] - LISTAR CADASTRO DE PROFESSORES ======");
		System.out.println("====== [5] - REMOVER CADASTRO DE  ALUNOS");
		System.out.println("====== [6] - REMOVER CADASTRO DE  PROFESSORES");
		System.out.println("====== [7] - ENCERRAR PROGRAMA");
		System.out.println("====== Informe sua Opção ======");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1 :
			//CADASTRO DE ALUNOS POR DEMANDA
			System.out.println("======== CADASTRO DE ALUNOS ========");
			System.out.println("Informe seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe sua matricula: ");
			String matricula = sc.nextLine();
			System.out.println("Informe a sua idade: ");
			int idade = scNumeros.nextInt();
			System.out.println("Informe seu CPF: ");
			String cpf = sc.nextLine();
			Alunos aluno = new Alunos();
			aluno.setNome(nome);
			aluno.setMatricula(matricula);
			aluno.setIdade(idade);
			aluno.setCpf(cpf);
			listaAlunos.add(aluno);
			break;
			
		case 2 :
			//CADASTRO DE PROFESSORES POR DEMANDA
			System.out.println("======== CADASTRO DE PROFESSORES ========");
			System.out.println("Informe seu nome: ");
			sc.nextLine();
			String nomeProfessor = sc.nextLine();
			System.out.println("Informe seu CPF: ");
			String cpfProfessor = sc.nextLine();
			System.out.println("Informe sua idade: ");
			int idadeProfessor = scNumeros.nextInt();
			System.out.println("Informe a disciplina que você ensina: ");
			String disciplinaEnsinada = sc.nextLine();
			Professores professor = new Professores();
			professor.setCpf(cpfProfessor);
			professor.setDisciplinaEnsinada(disciplinaEnsinada);
			professor.setIdade(idadeProfessor);
			professor.setNome(nomeProfessor);
			listaProfessores.add(professor);
			break;
			
		case 3 :
			//RELATORIO DE ALUNOS CADASTRADOS POR DEMANDA [i] - > Referencia iniciando o indice em ->  0;
			for(int i=0; i<listaAlunos.size(); i++) {
				System.out.println("===== RELATORIO DE ALUNOS CADASTRADOS =====");
				System.out.println("[Nome do Aluno] [" + i +"] " +  " -> " + listaAlunos.get(i).getNome());
				System.out.println("[Matricula do Aluno] [" + i +"] " + " -> " + listaAlunos.get(i).getMatricula());
				System.out.println("[CPF do Aluno] [" + i +"] " + " -> " + listaAlunos.get(i).getCpf());
				System.out.println("[Idade do Aluno] [" + i +"] " +  " -> " + listaAlunos.get(i).getIdade());
				
			}
			
			break;
		case 4:
			//RELATORIO DE PROFESSORES CADASTRADO POR DEMANDA [i] -> Referencia iniciando o indice em -> 0;
			for(int i=0; i<listaProfessores.size(); i++) {
				System.out.println("===== RELATORIO DE PROFESSORES CADASTRADOS =====");
				System.out.println("[Nome do Professor] [" + i +"] " + " -> " + listaProfessores.get(i).getNome());
				System.out.println("[Idade do Professor] [" + i +"] " + " -> " + listaProfessores.get(i).getIdade());
				System.out.println("[CPF do Professor] [" + i +"] " + " -> " + listaProfessores.get(i).getCpf());
				System.out.println("[Disciplina Ensinada do Professor] [" + i +"] " + " -> " + listaProfessores.get(i).getDisciplinaEnsinada());
			}
			
			break;
			
		case 5:
			//ABA DE REMOÇAÕ DE ALUNOS COM LAÇO FOR P LISTAR O NOME DOS ALUNOS CADASTRADO E PEDE O NUMERO DE REFERENCIA QUE É A POSIÇÃO DAQUELA PESSOA DENTRO DA ARRAYLIST
			for(int i=0; i<listaAlunos.size(); i++) {
				System.out.println("======= REMOÇÃO DE ALUNOS ========");
				System.out.println("[Matricula do Aluno] [" + i +"] " + " -> " + listaAlunos.get(i).getNome());
				System.out.println("Digite o [número] de referencia do aluno que você deseja REMOVER");
				int referencia = scNumeros.nextInt();
				
				listaAlunos.remove(referencia);
				System.out.println("====== ALUNO REMOVIDO COM SUCESSO ======");
			}
			
			break;
			
		case 6:
			//ABA DE REMOÇAÕ DE PROFESSORES COM LAÇO FOR P LISTAR O NOME DOS PROFESSORES CADASTRADOS E PEDE O NUMERO DE REFERENCIA QUE É A POSIÇÃO DAQUELA PESSOA DENTRO DA ARRAYLIST
			for(int i=0; i<listaProfessores.size(); i++) {
			System.out.println("======= REMOÇÃO DE PROFESSORES ========");
			System.out.println("[Nome do Professor] [" + i +"] " + " -> " + listaProfessores.get(i).getNome());
			
			System.out.println("Digite o [número] de referencia do Professor que você deseja REMOVER");
			int referencia = scNumeros.nextInt();
			listaProfessores.remove(referencia);
			System.out.println("====== PROFESSOR REMOVIDO COM SUCESSO ======");
			}
			break;
			
		case 7:
			//PROGRAMA FINALIZA - > BOOLEAN RODANDO = FALSE;
			System.out.println("===== Programa Finalizado ======");
			rodando = false;
			break;
			
			
			//DEFAULT -> SE A PESSOA DIGITAR UM NÚMERO INVALIDO EU MANDO ELA DIGITAR UMA OPÇÃO VALIDA, NÃO QUIS BOTAR P FINALIZAR O PROGRAMA IA FICAR SEM GRAÇA
			default:
				System.out.println("====== DIGITE UMA OPÇÃO VALIDA =======");
				System.out.println("======================================");
				
				break;
			
			
		}
		
	}
		sc.close();
		scNumeros.close();

}
	
}
