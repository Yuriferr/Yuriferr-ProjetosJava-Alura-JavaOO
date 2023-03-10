
public class TestaBanco {

	public static void main(String[] args) {
		Cliente yuri =  new Cliente();
		yuri.nome = "Yuri Fernandes";
		yuri.cpf = "000.000.000-00";
		yuri.profissao= "programador";
		
		Conta contaYuri = new Conta();
		contaYuri.deposita(100);
		
		contaYuri.titular = yuri;
		System.out.println(contaYuri.titular.nome);
	}

}
