//Herança
package br.com.geekuniversity.secao12;

public class Programa28 {
	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa("Luana Linda", 2003, "luanaaaaa15@gmail.com");
		
//		System.out.println(p1); //executa o método .toString (imprimi o endereço de memória)
//		System.out.println(p1.getNome());		
		System.out.println("\n");
		
		Aluno a1 = new Aluno("Luana Aluna", 2002, "luanaaaaa15@gmail.com", "123456");
		
		System.out.println(a1);
		System.out.println(a1.getNome());		
		System.out.println("\n");
		
		Professor pr1 = new Professor("Luana Prof", 2001, "luanaaaaa15@gmail.com", "er345");
		
		System.out.println(pr1);
		System.out.println(pr1.getNome());
		System.out.println("\n");
		
	}
}
