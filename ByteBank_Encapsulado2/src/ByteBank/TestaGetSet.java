package ByteBank;

public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setAgencia(133);
		System.out.println(conta.getAgencia());
		
		conta.setNumero(123321);
		System.out.println(conta.getNumero());
		
		Cliente raian = new Cliente();
		
		conta.setTitular(raian);
		
		conta.getTitular().setNome("Raian Medeiros");
		
		System.out.println(conta.getTitular().getNome());
		
		
	}
	
}
