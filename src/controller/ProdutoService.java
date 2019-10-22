package controller;


public interface ProdutoService {

	void cadastraProduto();

	void pesquisaProdutoPelo(String codigo);

	void pesquisaProdutoPelaCategoria();

	void editarProduto();

	void iniciaVendaNoPdv(String codigoProdutoEmVenda, double quantidadeEmVenda);

	void listaCompras();
	
	void cancelaItemPelo(String codigo);

	void cancelaCupom();
	
}
