package ByteBank;

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco = new Endereco();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;	
	}
	
	public String getCpf(){
		return cpf;
	}	
	
}
