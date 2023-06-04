package application;

import java.util.Scanner;

import entities.Champion;

public class Combate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Champion c1 = new Champion();
		Champion c2 = new Champion();

		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
		c1.name = sc.nextLine();

		System.out.print("Vida inicial: ");
		c1.life = sc.nextInt();

		System.out.print("Ataque: ");
		c1.attack = sc.nextInt();

		System.out.print("Armadura: ");
		c1.armor = sc.nextInt();

		System.out.println();
		System.out.println("Digite os dados do segundo campeao:");
		System.out.print("Nome: ");
		sc.nextLine();
		c2.name = sc.nextLine();

		System.out.print("Vida inicial: ");
		c2.life = sc.nextInt();

		System.out.print("Ataque: ");
		c2.attack = sc.nextInt();

		System.out.print("Armadura: ");
		c2.armor = sc.nextInt();

		System.out.println();
		System.out.print("Quantos turnos voce deseja executar? ");
		int N = sc.nextInt();
		
		System.out.println();
		for (int i = 1; i <= N; i++) {
			while(c1.getLife() > 0 && c2.getLife() > 0 && i <= N) {
				System.out.println("Resultado do turno " + i++ + ":");
				c1.takeDamage(c2);
				c2.takeDamage(c1);
				System.out.println(c1.status());
				System.out.println(c2.status());
				System.out.println();
			}
		}
		
		System.out.println("FIM DO COMBATE");


		sc.close();
	}

}
