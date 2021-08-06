package e;
public class Conta{
	
	double saldo;
	int    agencia; 
	int    numero;
	Cliente titular;

	public void depositar(double valor){
		
		this.saldo += valor;
		
	}
	
	public boolean sacar(double valor){
			
		if(this.saldo >= valor){
		
			this.saldo -= valor;
			return true;
			
		}else {
			
			return false;
			
		}
	}
	
	public boolean trasferir(double valor,Conta destino){
		
		if(this.saldo >= valor){
			
			this.sacar(valor);
			destino.depositar(valor);
			
			System.out.println("Trasferencia efetuada com sucesso ");
			
			return true;
			
		}else{
		
			System.out.println("Saldo insuficiente para realizar a trasferencia");
			return false;
			
		}
	}

}
