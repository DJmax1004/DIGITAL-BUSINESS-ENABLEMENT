package br.com.fiap.bo;

import org.apache.log4j.Logger;

import br.com.fiap.to.ProdutoTO;

public class Estoque {
	private static Logger log = Logger.getLogger(Estoque.class);
	
	public static ProdutoTO consultarProduto(int codigo) {
	
	if (codigo == 401) {
		log.debug(codigo + " - " + "Camiseta branca");
		return new ProdutoTO(codigo,"Camiseta Branca", 4, 2.99);
	}
	else if (codigo == 402) {
		log.debug(codigo + " - " + "Camiseta azul");
		return new ProdutoTO(codigo,"Camiseta Azul", 4, 2.99);
	}
	else if (codigo == 403) {
		log.debug(codigo + " - " + "Camiseta rosa");
		return new ProdutoTO(codigo,"Camiseta Rosa", 4, 2.99);
	}
	else {
		log.error(codigo + " - " + "Produto não localizado");
		return new ProdutoTO(-1, "Produto não encontrado!", 0, 0);
		}
	}
}
