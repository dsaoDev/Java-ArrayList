package pacote;

public class Pessoa {
	//atributos
	private String nome;
	private int numTelefone;
	private String numCartao;
	private int cvv;
	private String cpf;
	
	
 //construtor vazio
	public Pessoa (){
		
	}
	
	
	
	
	//constrotutor padrão
	
	public Pessoa(String nome, int numTelefone, String numCartao, int cvv, String cpf) {
		this.nome = nome;
		this.numTelefone = numTelefone;
		this.numCartao = numCartao;
		this.cvv = cvv;
		this.cpf = cpf;
		
	}
	
	//metodos especificos
	
	//getters and setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumTelefone() {
		return numTelefone;
	}
	
	public void setNumTelefone(int numTelefone) {
		this.numTelefone = numTelefone;
	}
	
	public String getNumCartao() {
		return numCartao;
	}
	
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
  

}
