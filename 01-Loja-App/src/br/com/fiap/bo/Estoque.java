package br.com.fiap.bo;

import br.com.fiap.to.ProdutoTO;

public class Estoque {
	public static ProdutoTO consultarProduto(int codigo) {
	
	if (codigo == 401) {
		return new ProdutoTO(codigo,"Camiseta Branca", 4, 2.99);
	}
	else if (codigo == 402) {
		return new ProdutoTO(codigo,"Camiseta Azul", 4, 2.99);
	}
	else if (codigo == 403) {
		return new ProdutoTO(codigo,"Camiseta Rosa", 4, 2.99);
	}
	else {
		return new ProdutoTO(-1, "Produto não encontrado!", 0, 0);
		}
	}
}
