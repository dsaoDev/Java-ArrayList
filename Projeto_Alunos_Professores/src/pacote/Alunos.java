package pacote;

public class Alunos   {
	private String matricula;
	private String nome;
	private int idade;
    private String cpf;
	
	
	//construtor vazio
    public Alunos() {
    	
    }
	
	// construtor padrao
	public Alunos(String matricula, String nome, int idade, String cpf) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	//metodos especificos
	
	
   //metodos getters and setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
    
}
