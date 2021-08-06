
public class TesteDeReferencias {
	
	public static void main(String[] args) {
		
		Conta contaUm =  new Conta();
		
		contaUm.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + contaUm.saldo);
	
		Conta contaDois = contaUm;
		
		
		System.out.println("Saldo da segunda conta: " + contaDois.saldo);
		
		contaDois.saldo += 100;		

		System.out.println("Saldo da primeira conta: " + contaUm.saldo);
		System.out.println("Saldo da segunda conta: " + contaDois.saldo);
	
		/* contaUm e contaDois se referem ao mesmo objeto, então não importa
		se eu colocar dinhiero na contaUm ou na Dois ambos vão somar a um objeto só*/
		
		if(contaUm == contaDois){
			
			System.out.println("É o msm role");
			
		}else{
			
			System.out.println("É diferente");
		}
	
		
		System.out.println(contaUm);
		System.out.println(contaDois);
		
		
	}

}
