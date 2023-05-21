package br.com.geekuniversity.secao12;

/*
  Benef�cios da heren�a
  
  - Evita a repeti��o  de c�digo
  - Facilita a manuten��o do programa;
  - Quando uma classe herda de outra classe, ela ganha
  todos os atributos e m�todos da classe herdada
  - Classe espec�fica, sub-classe, classe filha
 */
//Aluno � uma pessoa
public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		//Pessoa(nome, ano_nascimento);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	//Overriding / Sobrescrita de m�todo
	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}
	
	//Overriding / Sobrescrita de m�todo
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
	}

}
