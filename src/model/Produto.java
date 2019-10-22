package model;

public class Produto {

	private int idDoProduto;
	private String codigoDoProduto;
	private String descricaoDoProduto;
	private double preco;
	private double quantidade;
	private Categoria categoria;
	
	
	public int getIdDoProduto() {
		return idDoProduto;
	}

	public void setIdDoProduto(int idDoProduto) {
		this.idDoProduto = idDoProduto;
	}

	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getDescricaoDoProduto() {
		return descricaoDoProduto;
	}

	public void setDescricaoDoProduto(String descricaoDoProduto) {
		this.descricaoDoProduto = descricaoDoProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
