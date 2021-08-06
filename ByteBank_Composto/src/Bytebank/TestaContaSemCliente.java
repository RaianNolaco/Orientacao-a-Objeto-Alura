package Bytebank;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaRaquel =  new Conta();
		
		System.out.println(contaRaquel.titular);
		
		//contaRaquel.titular.nome = "Raquel Saturnino";
	
		//System.out.println(contaRaquel.titular.nome);
		
		contaRaquel.titular = new Cliente();
	
		System.out.println(contaRaquel.titular);
		
		contaRaquel.titular.nome = "Raquel Saturnino";
	
		System.out.println(contaRaquel.titular.nome);
		
	}

}
