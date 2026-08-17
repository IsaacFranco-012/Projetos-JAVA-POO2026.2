package br.edu.principal;
import java.util.Scanner

public class Principal {

	public static void main(String[] args) {
		
		String nome;
		String rua;
		double num;
		String bairro;
		String compl;
		long cep;
		String cidade;
		String uf;
		long cpf;
		String data;
		double idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		nome = sc.next();
		
		System.out.println("Rua: ");
		rua = sc.next();
		
		System.out.println("Número: ");
		num = sc.nextDouble();
		
		System.out.println("Bairro: ");
		bairro = sc.next();
		
		System.out.println("Complemento: ");
		compl = sc.next();
		
		System.out.println("CEP: ");
		cep = sc.nextLong();
		
		System.out.println("Cidade: ");
		cidade = sc.next();
		
		System.out.println("UF: ");
		uf = sc.next();
		
		System.out.println("CPF: ");
		cpf = sc.nextLong();
		
		System.out.println("Data de Nascimento: ");
		data = sc.next();
		
		System.out.println(": ");
		idade = sc.nextDouble();
		
		System.out.println("Nome: " + nome);
		
		System.out.println("Endereço: " + rua + num + bairro + compl + cep + cidade);
		
		System.out.println("CPF: " + cpf);
		
		System.out.println("Data de nascimento: " + data);
		
		System.out.println("Idade: " + idade);



	}

}
