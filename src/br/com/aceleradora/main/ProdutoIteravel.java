package br.com.aceleradora.main;

public class ProdutoIteravel implements Comparable{
	
	private String nome;
	private int estoque;
	
	public ProdutoIteravel(int estoque, String nome){
		this.estoque = estoque;
		this.nome 	 = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public int getEstoque() {
		return estoque;
	}
		
	public int compareTo(Object o){		
		//Comparando a quantidade em estoque
		return this.estoque - ((ProdutoIteravel) o).getEstoque();				
	}
	
	public String toString(){
		return this.getEstoque() + " - " + this.getNome();
	}	
}
