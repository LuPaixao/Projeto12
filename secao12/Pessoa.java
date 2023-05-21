package br.com.geekuniversity.secao12;
/*
 - Classe base (serve de base p/ outras classes)
 - Classe M�e
 - Classe Pai
 - Super classe
 - Classe gen�rica 
 
 */
//Agora como classe abstrata
//Impossibilitando a cria��o de objetos dessa classe
/*
 - Uma classe abstrata pode ter:
 
  atributos
  m�todos
  m�todos abstratos
  
 - M�todos abstratos s�o: 
  S�o m�todos que n�o possuem implementa��es({}), apenas possuem declara��o(;),e obrigatoriamente 
  as classe que herdarem dessa classe com m�todo abstrato, precisa implemntar
  esses m�todos
 */
public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Overriding / Sobrescrita de m�todo
	public String toString() {
		return "Nome: " + this.nome + "\nAno de nascimento: " + this.ano_nascimento + "\nE-mail: " + this.email;
	}
	
	//Overloading / Sobrecarga de m�todo
	public void mensagem() {
		System.out.println("Essa � a minha mensagem...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}

	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	
	//Declara��o do m�todo abstrato
	public abstract void outra_mensagem(String texto);
		
	
	
}
