
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);

	
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		// conta 2
	
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("A 1� conta tem " + primeiraConta.saldo);
		System.out.println("A 2� conta tem " + segundaConta.saldo);
		
	} 
	
}
