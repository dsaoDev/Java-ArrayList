package pacote;

public class Livro {
	
	// -> Atributos 
	private int codigo;
	private String titulo;
	private String nomeAutor;
	private String isbn;
	private int numeroPaginas;
	private double valorLivro;
	private String edicao;
	private String volume;
	
	// -> Construtor vazio
	public Livro() {
		
	}

	
	// -> Construtor padrão
	
	public Livro(int codigo,String titulo, String nomeAutor,String isbn,int numeroPaginas,double valorLivro, String edicao, String volume) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.valorLivro = valorLivro;
		this.edicao = edicao;
		this.volume = volume;
				
		
	}
     
// -> Getters and Setters
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public double getValorLivro() {
		return valorLivro;
	}


	public void setValorLivro(double valorLivro) {
		this.valorLivro = valorLivro;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}


	public String getVolume() {
		return volume;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
}
