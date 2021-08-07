package Bytebank;

public class TesteBanco {

	
	public static void main(String[] args) {
		
		Cliente raian = new Cliente();
		
		raian.nome = "Raian Medeiros";
		
		raian.cpf = "639.990.559-73";
		
		raian.profissao = "Programador Senior";
		
		Conta contaRaian = new Conta();
		
		contaRaian.depositar(100);
		
		contaRaian.titular = raian;
		
		System.out.println(contaRaian.titular.nome);
		
		Conta contaRicardo = new Conta();
		
		contaRicardo.titular.nome = "Ricardo Soares";
		
		contaRicardo.titular.cpf = "852.963.741-87";
		
		contaRicardo.titular.profissao = "Programador Junior";
		
		contaRicardo.titular.endereco.bairro = "Jd.Limoeiro";
		
		contaRicardo.titular.endereco.cep = "45688-984";
		
		System.out.println(contaRicardo.titular);
		
		
		
	}
	
}
