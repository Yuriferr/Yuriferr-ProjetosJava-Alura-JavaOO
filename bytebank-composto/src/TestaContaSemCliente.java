
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaSemCliente = new Conta();
		
		contaSemCliente.titular = new Cliente();
		
		contaSemCliente.titular.nome = "Teste";
		System.out.println(contaSemCliente.titular.nome);
	}

}
