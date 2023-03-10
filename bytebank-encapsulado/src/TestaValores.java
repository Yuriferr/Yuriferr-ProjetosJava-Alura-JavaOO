
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12345);
		
		Conta conta2 = new Conta(2675, 24226);
		Conta conta3 = new Conta(3456, 65832);
		
		System.out.println(Conta.getTotal());
	}
}
