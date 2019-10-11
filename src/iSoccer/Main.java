package iSoccer;

import java.util.Scanner;

public class Main {
	
	/*
			 0					  1
			 
		N� Funcion�ro |	  Tipo de funcion�rio  | 
		
	
	*/
	
	static int opcao, opcaoFuncionario, opcaoRecurso, opcaoRelatorio;
	static String login, senha;
	
	
	
	public static void main(String[] args) {
		
		int numeroFuncionario = 1;
		int i = 100, j = 7;
		
		String[][] pessoa = new String[i][j];
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o login e a senha para entrar no sistema\n");
		System.out.print("Login: ");
		
		login = input.nextLine();
		
		System.out.print("Senha: ");
		
		senha = input.nextLine();
		
		if(login.equals("admin") && senha.equals("123")) {
			
		
			while(opcao!=6) {
				
				System.out.println("\n--�-- Bem-vindo ao iSoccer --�-- \n");
				
				System.out.println("Escolha uma das op��es a seguir: \n");
				System.out.println("1 - Adicionar funcion�rio");
				System.out.println("2 - Adicionar s�cio-torcedor");
				System.out.println("3 - Alterar estado de pagamento dos s�cios");
				System.out.println("4 - Gerenciar recursos f�sicos");
				System.out.println("5 - Soliciar relat�rio");
				System.out.println("6 - Sair do sistema\n");
				
				opcao = input.nextInt();
				input.nextLine();
				
				
				switch(opcao) {
				
				case 1:
					
					pessoa[numeroFuncionario][0] = Integer.toString(numeroFuncionario);
					
					System.out.println("\n-- ADICIONAR FUNCION�RIO --\n");
					
					System.out.println("Escolha uma tipo de funcion�rio para adicionar: \n");
					
					System.out.println("1 - Presidente");
					System.out.println("2 - M�dico");
					System.out.println("3 - T�cnico");
					System.out.println("4 - Preparador f�sico");
					System.out.println("5 - Motorista");
					System.out.println("6 - Cozinheiro");
					System.out.println("7 - Advogado");
					System.out.println("8 - Jogador");
					
					opcaoFuncionario = input.nextInt();
					
					
					if(opcaoFuncionario == 1) {
				
						pessoa[numeroFuncionario][1] = "Presidente";
						
						System.out.println("Digite o nome completo do funcion�rio");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do funcion�rio");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do funcion�rio");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o sal�rio do funcion�rio");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do funcion�rio");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						
						
						
					}
					else if(opcaoFuncionario == 2) {
						
						pessoa[numeroFuncionario][1] = "M�dico";
						
						
					}
					else if(opcaoFuncionario == 3) {
						
						pessoa[numeroFuncionario][1] = "T�cnico";
						
										
					}
					else if(opcaoFuncionario == 4) {
						
						pessoa[numeroFuncionario][1] = "Preparador f�sico";
						
				
					}
					else if(opcaoFuncionario == 5) {
						
						pessoa[numeroFuncionario][1] = "Motorista";
						
						
					}
					else if(opcaoFuncionario == 6) {
						
						pessoa[numeroFuncionario][1] = "Cozinheiro";
						
						
					}
					else if(opcaoFuncionario == 7) {
						
						pessoa[numeroFuncionario][1] = "Advogado";
						
						
					}
					else if(opcaoFuncionario == 8) {
						
						pessoa[numeroFuncionario][1] = "Jogador";
						
					}
					else {
						System.out.println("\nOp��o inv�lida!\n");
					}
					
					System.out.println(pessoa[numeroFuncionario][1]);
					
					
					
					break;
				
				case 2:
					
					System.out.println("ADICIONAR S�CIO-TORCEDOR");
					
					System.out.println("Informe o seu nome: ");
					System.out.println("Informe seu email: ");
					System.out.println("Informe seu CPF: ");
					System.out.println("Informe seu telefone: ");
					System.out.println("Informe seu endere�o: ");
					System.out.println("Informe o valor de contribui��o: ");
					
					break;
					
				case 3:
					
					//Olhar com calma requisito 3
					
					
					break;
					
				case 4:
					
					System.out.println("GERENCIAR RECURSOS F�SICOS");
					
					System.out.println("Escolha uma op��o: ");
					
					System.out.println("1 - �nibus");
					System.out.println("2 - Est�dio");
					System.out.println("3 - Centro de treinamento");
					
					
					break;
					
				case 5:
					
					System.out.println("SOLICITAR RELAT�RIO");
					
					System.out.println("Escolha uma op��o: ");
					
					System.out.println("1 - Relat�rio sobre funcion�rios");
					System.out.println("2 - Relat�rio sobre recursos f�sicos");
					System.out.println("3 - Relat�rio sobre s�cios-torcedores");
					System.out.println("4 - Relat�rio geral");
					
					
					
					
					break;
					
				case 6:
					
					System.exit(0);
					
				default:
					
					System.out.println("\nOp��o inv�lida, digite uma op��o novamente\n");
							
				}
				
				
			}
		}
	}

}
