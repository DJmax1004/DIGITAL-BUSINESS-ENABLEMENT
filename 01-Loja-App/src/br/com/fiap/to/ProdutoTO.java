package br.com.fiap.to;

import java.io.Serializable;

public class ProdutoTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String descricao;
	private int qtd;
	private double preco;
	
	
	public ProdutoTO() {
		super();
	}
	public ProdutoTO(int codigo, String descricao, int qtd, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtd = qtd;
		this.preco = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
