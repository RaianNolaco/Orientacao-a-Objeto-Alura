package Bytebank;

public class TesteBanco {

	
	public static void main(String[] args) {
		
		Cliente raian = new Cliente();
		
		raian.nome = "Raian Medeiros";
		
		raian.cpf = "639.990.559-73";
		
		raian.profissao = "Programador";
		
		Conta contaRaian = new Conta();
		
		contaRaian.depositar(100);
		
		contaRaian.titular = raian;
		
		System.out.println(contaRaian.titular.nome);
		
	}
	
}
