package br.com.inmetrics.teste.util;

import java.util.Random;

public class GenerateNames {

	public String generateNames() {

		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		int qtd = 8;

		for (int i = 0; i < qtd; i++) {
			char c = (char) (r.nextInt(8) + 'A');
			sb.append(c);
		}
		return sb.toString();
	}
	
	public String generateCPF() {

		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		int qtd = 5;

		for (int i = 0; i < qtd; i++) {
			char c = (char) (r.nextInt(8) + '0');
			sb.append(c);
		}
		return sb.toString();
	}

}
