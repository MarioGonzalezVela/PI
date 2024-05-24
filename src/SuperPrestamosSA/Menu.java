package SuperPrestamosSA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	boolean salir;
	int opcion;

	public void imprimirMenu() {
		salir = false;

		while (salir == false) {
			System.out.println("**************** MENU ****************");

			System.out.println("1.- Registrar Usuario ");
			System.out.println("2.- Registrar Administrador");
			System.out.println("3.- ");
			System.out.println("4.- ");
			System.out.println("5.- ");
			System.out.println("6.- ");

			try {
				System.out.println("Seleccione la opción deseada: ");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					//
					break;
				case 2:
					//
					break;
				case 3:
					//
					break;
				case 4:
					//
					break;
				case 5:
					//
					break;
				case 6:
					salir = true;
					break;
				default:
					System.out.println("Las opciones son entre 1 y 6");

				}
			} catch (InputMismatchException e) {
				System.out.println("Debes seleccionar un número de opción");
				sc.next();
			}
		}

	}

}
