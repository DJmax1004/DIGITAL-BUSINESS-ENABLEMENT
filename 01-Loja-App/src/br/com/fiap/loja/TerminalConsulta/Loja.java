package br.com.fiap.loja.TerminalConsulta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.fiap.bo.Estoque;
import br.com.fiap.loja.singleton.PropertySingleton;
import br.com.fiap.to.ProdutoTO;

public class Loja {

	public static void main(String[] args) {
		String nome = PropertySingleton.getInstance().getProperty("nome");
		
		Scanner entrada = new Scanner(System.in);
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(nome + " " + hoje.format(formatador));
		System.out.println("Camisetas foda!!!");
		System.out.println("");
		System.out.print("Digite o codigo da camisa: ");
		int codigo = entrada.nextInt();
		entrada.close();
		
		ProdutoTO produto = Estoque.consultarProduto(codigo);
		System.out.println(produto.getDescricao());
	}
	
}
