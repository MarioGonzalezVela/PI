package SuperPrestamosSA;

import java.util.Scanner;

public class SuperEmpresa extends LogIn{
	
	private Paises paisSede;

	public void loginSuperEmpresa(String nickname, String contrasenya) {
		
		boolean nombre_valido;
		boolean contra_valida;
		
		Scanner sc = new Scanner(System.in); 
		
		do { // BUCLE QUE FUNCIONA HASTA QUE SE INTRODUZCA UN NICKNAME VÁLIDO
		System.out.printf("Introduzca un nickname\n➤");
		sc = new Scanner(System.in);
		nickname = sc.next();
		nombre_valido=verificarNickname(nickname);
		}
		while(nombre_valido == false);
		do { // BUCLE QUE FUNCIONA HASTA QUE SE INTRODUZCA UNA CONTRASEÑA VÁLIDA
			System.out.printf("Introduzca una contraseña\n➤");
			sc = new Scanner(System.in);
			contrasenya = sc.next();
			contra_valida=verificarContrasenya(contrasenya);
			
		}while(contra_valida == false);	
		
		listaSuperEmpresas.put(nickname, contrasenya); // Añadimos al TreeMap
	}
}
