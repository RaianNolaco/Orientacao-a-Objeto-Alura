package ByteBank;

public class TestaGetSet {

	public static void main(String[] args) {
		
		Cliente raian = new Cliente("Raian Medeiros","52999655871");
		
		Conta conta = new Conta(123,123321,raian); 
		
		conta.setAgencia(133);
		System.out.println(conta.getAgencia());
		
		conta.setNumero(123321);
		System.out.println(conta.getNumero());
		
	
		raian.setNome("Raian");
		
		conta.setTitular(raian);
		
		System.out.println(conta.getTitular() +"     "+conta.getTitular().getNome());
		
		conta.getTitular().setNome("Raian Medeiros");
		
		System.out.println(raian.getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		
	}
	
}
