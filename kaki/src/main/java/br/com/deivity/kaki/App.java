package br.com.deivity.kaki;

import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		System.out.println("Digite qual é o tamanho do ovo : ");
		Scanner ler = new Scanner(System.in);
		String tamanho = ler.next();

		Integer t = Integer.valueOf(tamanho);
		Ovo ovo = new Ovo(t);
		ovo.quebrar();

		String quantidadeFrito = "1";
		while(!quantidadeFrito.equals("0")) {
			System.out.println("Digite o quanto quer fritar o ovo, caso deseje parar escreva 0 : ");
			quantidadeFrito = ler.next();
			Integer frita=Integer.valueOf(quantidadeFrito);
			for(int i=0; i<frita;i++) {
				ovo.fritar();
			}
			System.out.println("O ovo está : "+ovo.pegarStatus());
		}
		System.out.println("Você terminou de fritar o seu ovo!!!");
	}
}