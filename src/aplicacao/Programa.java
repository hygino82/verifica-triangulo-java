package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Ponto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Ponto a, b, c;
		double x, y;
		System.out.println("Informe as coordenadas do ponto a");
		x = sc.nextDouble();
		y = sc.nextDouble();
		a = new Ponto(x, y);
		System.out.println("Informe as coordenadas do ponto b");
		x = sc.nextDouble();
		y = sc.nextDouble();
		b = new Ponto(x, y);
		System.out.println("Informe as coordenadas do ponto c");
		x = sc.nextDouble();
		y = sc.nextDouble();
		c = new Ponto(x, y);
		System.out.println("A" + a);
		System.out.println("B" + b);
		System.out.println("C" + c);

		if (verifica_triangulo(a, b, c)) {
			System.out.println("\nOs pontos formam um triângulo");
			System.out.printf("A área do triangulo formado é %.2f\n", area(a, b, c));
		} else {
			System.out.println("\nOs pontos não formam um triângulo");
		}
		sc.close();

	}

	public static Double distancia(Ponto m, Ponto n) {
		return Math.sqrt(Math.pow(m.getX() - n.getX(), 2) + Math.pow(m.getY() - n.getY(), 2));
	}

	public static Double area(Ponto a, Ponto b, Ponto c) {
		Double area = Math.abs(a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * a.getY() - c.getX() * b.getY()
				- b.getX() * a.getY() - a.getX() * c.getY()) / 2.0;
		return area;
	}

	public static boolean verifica_triangulo(Ponto a, Ponto b, Ponto c) {
		Double d_ab = distancia(a, b);
		Double d_ac = distancia(a, c);
		Double d_cb = distancia(c, b);

		if ((d_ab < d_cb + d_ac) && (d_ac < d_ab + d_ac) && (d_cb < d_ab + d_ac)) {
			return true;
		}

		return false;
	}

}
