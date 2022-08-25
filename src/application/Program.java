package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion championOne;
		Champion championTwo;

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		championOne = new Champion(name, life, attack, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		sc.nextLine();
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		championTwo = new Champion(name, life, attack, armor);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();

		int cont = 1;
		while (cont <= turns) {

			championOne.takeDamage(championTwo);
			championTwo.takeDamage(championOne);

			System.out.println(); 
//			System.out.printf("Resultado do turno %d%n : ", cont);
			System.out.println("Resultado do turno " + cont );
			System.out.println(championOne.status());
			System.out.println(championTwo.status());

			cont += 1;
			
			if (championOne.getLife() == 0 || championTwo.getLife() == 0) {
				break;				
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();

	}

}
