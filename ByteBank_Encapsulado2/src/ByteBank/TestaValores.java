package ByteBank;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,01123);
		
		//conta está inconsistente
		//conta.setAgencia(-123);
		//conta.setNumero(-12345678);
		
		System.out.println(conta.getAgencia() + "\n"+ conta.getNumero());
		
	}

}
