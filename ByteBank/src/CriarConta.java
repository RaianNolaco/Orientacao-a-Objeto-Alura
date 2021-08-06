
public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);

	
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		// conta 2.
	
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("A 1° conta tem " + primeiraConta.saldo);
		System.out.println("A 2° conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		
		segundaConta.agencia = 12;
		
		System.out.println("A 2° conta está na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta){
			
			System.out.println("É o msm role");
			
		}else{
			
			System.out.println("É diferente");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	

		
	} 
	
}
