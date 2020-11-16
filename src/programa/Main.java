package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;
import entidades.Terceirizado;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Empregado> list = new ArrayList<>();
		
	System.out.print("Entre o número de empregados: ");
	int n = sc.nextInt();
	
	for(int i = 0 ; i<n ; i++) {
		System.out.println("Empregado #"+ (i+1) + " Dados: ");
		System.out.print("Ele é terceirizado(s/n)?");
		char ch = sc.next().charAt(0);
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Horas: ");
		int horas = sc.nextInt();
		System.out.print("Valor por horas: ");
		double valorPorHoras = sc.nextDouble();
		
		if(ch == 's') {
			System.out.print("Pagamento adicional: ");
			double pagamentoAdicional = sc.nextDouble();
			list.add(new Terceirizado(nome, horas, valorPorHoras, pagamentoAdicional));
		}else {
			list.add(new Empregado(nome, horas, valorPorHoras));
		}
	}
	System.out.println();
	System.out.println("Pagamentos: ");
	for(Empregado emp : list) {
		System.out.println(emp.getNome() + ": $" + String.format("%.2f", emp.pagamento()) );
	}

	sc.close();
	}

}
