package ByteBank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	//private Cliente titular = new Cliente();
	private Cliente titular;
	private static int total; 
	
	public Conta(int agencia,int numero){
		
		Conta.total++;
		this.agencia = agencia;
		this.numero  = numero;
		
		System.out.println("Conta criada!");
		System.out.println("O total de contas é " + total);
	}
	
	//Saldo
	public double getSaldo() {

		return this.saldo;
	}

	//Agencia
	public int getAgencia() {

		return this.agencia;
	}

	public void setAgencia(int agencia) {

		if(agencia <= 0){
			
			System.out.println("valores invalidos, não são permitidos valores nulos ou negativos");
			return;
		}	
		this.agencia = agencia;
	}

	
	//Numero
	public int getNumero() {

		return this.numero;

	}

	public void setNumero(int numero) {

		if(numero <= 0){
			
			System.out.println("valores invalidos, não são permitidos valores nulos ou negativos");
			return;
		}	
		this.numero = numero;

	}
	
	
	//Titular
	public Cliente getTitular(){
		
		return this.titular;
		
	}
	
	public void setCliente(Cliente titular){
		
		this.titular= titular; 
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular =  titular;		
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			return true;

		} else {

			return false;

		}
	}

	public boolean trasferir(double valor, Conta destino) {

		if (this.saldo >= valor) {

			this.sacar(valor);
			destino.depositar(valor);

			System.out.println("Trasferencia efetuada com sucesso ");

			return true;

		} else {

			System.out.println("Saldo insuficiente para realizar a trasferencia");
			return false;

		}
	}
	
	public static int getTotal() {
		return total;
	}

}
