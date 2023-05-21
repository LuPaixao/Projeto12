package br.com.geekuniversity.secao12;
/*
 - Classe base (serve de base p/ outras classes)
 - Classe Mãe
 - Classe Pai
 - Super classe
 - Classe genérica 
 
 */
//Agora como classe abstrata
//Impossibilitando a criação de objetos dessa classe
/*
 - Uma classe abstrata pode ter:
 
  atributos
  métodos
  métodos abstratos
  
 - Métodos abstratos são: 
  São métodos que não possuem implementações({}), apenas possuem declaração(;),e obrigatoriamente 
  as classe que herdarem dessa classe com método abstrato, precisa implemntar
  esses métodos
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
	
	//Overriding / Sobrescrita de método
	public String toString() {
		return "Nome: " + this.nome + "\nAno de nascimento: " + this.ano_nascimento + "\nE-mail: " + this.email;
	}
	
	//Overloading / Sobrecarga de método
	public void mensagem() {
		System.out.println("Essa é a minha mensagem...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}

	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	
	//Declaração do método abstrato
	public abstract void outra_mensagem(String texto);
		
	
	
}
