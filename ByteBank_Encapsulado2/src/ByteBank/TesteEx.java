package ByteBank;

import java.util.Scanner;

public class TesteEx {

	public static void main(String[] args) {
		
		int inp = 0;
		int par = 0; 
		int pos = 0; 
		int neg = 0;
		
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i<= 5;i++){
				
			int x = sc.nextInt();

			if(x >= 0){
				pos +=1;
			}else neg+=1;

			if(x % 2 == 0){
				par+=1;
			}else inp+=1;
	
		}
		
		System.out.println("Valores Positivos: " + pos);
		System.out.println("Valores negativos: " + neg);
		System.out.println("Valores impares: "   + inp);
		System.out.println("Valores pares: "     + par);
		
		sc.close();
	}
	
}
