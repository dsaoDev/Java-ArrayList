package pacote;

public class Professores {
	//atributos
	private String nome;
	private String cpf;
	private String disciplinaEnsinada;
	private int idade;
	
	
	
//construtor vazio
	public Professores() {
		
	}
	
// construtor padrao
 public Professores(String nome, String cpf, String disciplinaEnsinada, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.disciplinaEnsinada = disciplinaEnsinada;
		this.idade = idade;
}
 
//metodos especificos

 
		
//metodos getters and setters
 public String getNome() {
	 return nome;
	 
 }
 
 public void setNome(String nome) {
	 this.nome = nome;
 }
 
 public String getCpf () {
	 return cpf;
 }
 
 public void setCpf(String cpf) {
	 this.cpf = cpf;
 }
 
 public String getDisciplinaEnsinada() {
	 return disciplinaEnsinada;
 }
 
 public void setDisciplinaEnsinada(String disciplinaEnsinada) {
	 this.disciplinaEnsinada = disciplinaEnsinada;
 }
 
 public int getIdade() {
	 return idade;
 }
 
 public void setIdade(int idade) {
	 this.idade = idade;
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
