package ByteBank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	
	
	
	public double getSaldo() {

		return this.saldo;
	}

	public int getAgencia() {

		return this.agencia;
	}

	public void setAgencia(int agencia) {

		this.agencia = agencia;
	}

	public int getNumero() {

		return this.numero;

	}

	public void setNumero(int numero) {

		this.numero = numero;

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

}
