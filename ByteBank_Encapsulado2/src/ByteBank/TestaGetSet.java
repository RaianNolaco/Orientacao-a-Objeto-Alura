package ByteBank;

public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); 
		
		conta.setAgencia(133);
		System.out.println(conta.getAgencia());
		
		conta.setNumero(123321);
		System.out.println(conta.getNumero());
		
		Cliente raian = new Cliente();
		
		raian.setNome("Raian");
		
		conta.setTitular(raian);
		
		System.out.println(conta.getTitular() +"     "+conta.getTitular().getNome());
		
		conta.getTitular().setNome("Raian Medeiros");
		
		System.out.println(raian.getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		
	}
	
}
