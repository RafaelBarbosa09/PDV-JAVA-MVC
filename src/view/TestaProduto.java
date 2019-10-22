package view;


import java.util.Scanner;

import controller.ProdutoService;
import controller.ProdutoServiceImplementation;

public class TestaProduto {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		ProdutoService produtoService = new ProdutoServiceImplementation();
		
		int opcao;
		String codigo = "";
		String codigoProdutoEmVenda = "";
		double quantidadeEmVenda = 0;
		
		do{
			System.out.println("O que deseja fazer ?");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Pesquisar produto");
			System.out.println("3 - Editar produto");
			System.out.println("4 - Pesquisar por categoria");
			System.out.println("5 - Iniciar venda PDV");
			System.out.println("6 - Cancelar item");
			System.out.println("7 - Cancelar venda");
			System.out.println("8 - Cupom Fiscal");
			System.out.println("9 - Sair");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				
				produtoService.cadastraProduto();
				break;
			case 2:
				
				produtoService.pesquisaProdutoPelo(codigo);
				break;
			case 3:
				
				produtoService.editarProduto();
				break;
			case 4:
				
				produtoService.pesquisaProdutoPelaCategoria();
				break;
			case 5:
				
				produtoService.iniciaVendaNoPdv(codigoProdutoEmVenda, quantidadeEmVenda);
				break;
			case 6:
				
				produtoService.cancelaItemPelo(codigo);
				break;
			case 7:
				
				produtoService.cancelaCupom();
				break;
			case 8:
				
				produtoService.listaCompras();
				break;
			case 9:
				
				System.out.println("Saindo...");
				break;
			default:
				
				System.out.println("Insira uma opção válida");
				break;
			}
		}while(opcao != 9);
	}
}
