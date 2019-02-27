

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.bo.EstoqueStub;
import br.com.fiap.bo.EstoqueStub.ConsultarProduto;
import br.com.fiap.bo.EstoqueStub.ConsultarProdutoResponse;
import br.com.fiap.bo.EstoqueStub.ProdutoTO;

public class TerminalConsulta {
	private static Logger log = Logger.getLogger(TerminalConsulta.class);

	public static void main(String[] args) throws RemoteException {
		String nome = ("Loja Camisetas Foda");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = 	DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(nome + " " + hoje.format(formatador));
		System.out.println("Digite o código do produto desejado: ");
		Scanner scanner = new Scanner(System.in);
		int codigo = scanner.nextInt();
		scanner.close();
		EstoqueStub stub = new EstoqueStub();
		ConsultarProduto consulta = new ConsultarProduto();
		consulta.setCodigo(codigo);
		ConsultarProdutoResponse response = stub.consultarProduto(consulta);		
		ProdutoTO produto = response.get_return();
		System.out.println(produto.getDescricao());
		log.warn("Final da Aplicação");
	}
}
