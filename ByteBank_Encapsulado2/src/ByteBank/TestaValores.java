package ByteBank;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("cliente1","1111111");
		Cliente cliente2 = new Cliente("cliente2","2222222");
		Cliente cliente3 = new Cliente("cliente3","3333333");
		Cliente cliente4 = new Cliente("cliente4","4444444");

		
		Conta conta = new Conta(11,1111,cliente1);
		
		//conta está inconsistente
		//conta.setAgencia(-123);
		//conta.setNumero(-12345678);
				
		Conta conta2 = new Conta(22,2222,cliente2);
		Conta conta3 = new Conta(33,3333,cliente3);
		Conta conta4 = new Conta(44,4444,cliente4);

		
		System.out.println(conta.getAgencia() + "\n"+ conta.getNumero());
		System.out.println(conta2.getAgencia() + "\n"+ conta2.getNumero());
		System.out.println(conta3.getAgencia() + "\n"+ conta3.getNumero());
		System.out.println(conta4.getAgencia() + "\n"+ conta4.getNumero());

		
		System.out.println(Conta.getTotal() + " Contas foram criadas");
		System.out.println(Cliente.getQntCliente() + " clientes foram criados");
		
		
	}

}
