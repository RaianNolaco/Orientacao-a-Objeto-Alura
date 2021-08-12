package ByteBank;

public class Endereco {
	
	private String lagradouro;
	private String cep;
	private String complemento;
	private String numero;
	private String bairro;
	private String cidade;
	
	//Contrutor
	public Endereco(String lagradouro,String cep,String complemento,String bairro, String cidade){
		
		this.lagradouro = lagradouro;
		this.cep = cep;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;

	}
	
	public Endereco(String lagradouro,String cep,String bairro, String cidade){
		
		this(lagradouro,cep," ",bairro,cidade);
		
	}
	
	// Getters e Setters
	
	//lagradouro
	public String getLagradouro() {
		return lagradouro;
	}
	
	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}
	
	//cep
	public String getCep(){
		return cep;
	}
	
	public void set(String cep){
		this.cep = cep;
	}
	
	//complemento
	public String getComplemento(){
		return complemento;
	}
	
	public void setComplemento(String complemento){
		this.complemento = complemento;
	}
	
	//numero
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	//bairro
	public String getBairro(){
		return bairro;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	//cidade
	public String getCidade(){
		return cidade;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}

}
