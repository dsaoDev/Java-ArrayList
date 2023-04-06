package entities;





public class Livro extends Biblioteca {
  private String titulo;
  private String autor;
 
  
 
  
  
  public Livro() {
	  
  }
  
  public Livro(String titulo , String autor) {
	  this.titulo = titulo;
	  this.autor = autor;
  }

  

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}
  
  
  
  
  
}
