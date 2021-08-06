
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaPedro =  new Conta();
		
		contaPedro.depositar(200);
		
		System.out.println(contaPedro.saldo);
		
		
		boolean conseguio = contaPedro.sacar(90);
		
		if(conseguio){
			
			System.out.println(conseguio);
			System.out.println("Saque realizado");
			
		}else{
			
			System.out.println(conseguio);
			System.out.println("Algo deu errado");
			
		}
		
		
		Conta contaMaria = new Conta();
		
		contaMaria.depositar(1000);
		
		System.out.println("antes "+contaMaria.saldo);
		System.out.println("antes "+contaPedro.saldo);
		
		
		contaMaria.trasferir(3000, contaPedro);
				
		System.out.println("depois "+contaMaria.saldo);
		System.out.println("depois "+contaPedro.saldo);
		
		
		contaPedro.titular = "Pedro Barbosa";
		
		System.out.println(contaPedro.titular);
		
		Conta contaRicardo = new Conta();
		
		contaPedro.trasferir(42,contaRicardo);
	
		System.out.println(contaRicardo.saldo);
		System.out.println(contaPedro.saldo);
	}

}
