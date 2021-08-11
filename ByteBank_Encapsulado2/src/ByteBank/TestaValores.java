package ByteBank;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,01123);
		
		//conta está inconsistente
		//conta.setAgencia(-123);
		//conta.setNumero(-12345678);
		
		System.out.println(conta.getAgencia() + "\n"+ conta.getNumero());
		
		Conta conta2 = new Conta(12,4556);
		Conta conta3 = new Conta(14,34534);
		
		System.out.println(Conta.getTotal());
		
	}

}
