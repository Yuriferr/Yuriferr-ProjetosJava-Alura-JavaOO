
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(42);
		System.out.println(conta.getAgencia());
		
		Cliente yuri = new Cliente();
		//conta.titular = yuri;
		yuri.setNome("Yuri Fernandes");
		
		conta.setTitular(yuri);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(yuri);
		System.out.println(conta.getTitular());
	}

}
