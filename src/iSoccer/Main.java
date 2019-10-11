package iSoccer;

import java.util.Scanner;

public class Main {
	
	/*
			 0					  1
			 
		N° Funcionáro |	  Tipo de funcionário  | 
		
	
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
				
				System.out.println("\n--°-- Bem-vindo ao iSoccer --°-- \n");
				
				System.out.println("Escolha uma das opções a seguir: \n");
				System.out.println("1 - Adicionar funcionário");
				System.out.println("2 - Adicionar sócio-torcedor");
				System.out.println("3 - Alterar estado de pagamento dos sócios");
				System.out.println("4 - Gerenciar recursos físicos");
				System.out.println("5 - Soliciar relatório");
				System.out.println("6 - Sair do sistema\n");
				
				opcao = input.nextInt();
				input.nextLine();
				
				
				switch(opcao) {
				
				case 1:
					
					pessoa[numeroFuncionario][0] = Integer.toString(numeroFuncionario);
					
					System.out.println("\n-- ADICIONAR FUNCIONÁRIO --\n");
					
					System.out.println("Escolha uma tipo de funcionário para adicionar: \n");
					
					System.out.println("1 - Presidente");
					System.out.println("2 - Médico");
					System.out.println("3 - Técnico");
					System.out.println("4 - Preparador físico");
					System.out.println("5 - Motorista");
					System.out.println("6 - Cozinheiro");
					System.out.println("7 - Advogado");
					System.out.println("8 - Jogador");
					
					opcaoFuncionario = input.nextInt();
					
					
					if(opcaoFuncionario == 1) {
				
						pessoa[numeroFuncionario][1] = "Presidente";
						
						System.out.println("Digite o nome completo do funcionário");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do funcionário");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do funcionário");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do funcionário");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do funcionário");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						
						
						
					}
					else if(opcaoFuncionario == 2) {
						
						pessoa[numeroFuncionario][1] = "Médico";
						
						
					}
					else if(opcaoFuncionario == 3) {
						
						pessoa[numeroFuncionario][1] = "Técnico";
						
										
					}
					else if(opcaoFuncionario == 4) {
						
						pessoa[numeroFuncionario][1] = "Preparador físico";
						
				
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
						System.out.println("\nOpção inválida!\n");
					}
					
					System.out.println(pessoa[numeroFuncionario][1]);
					
					
					
					break;
				
				case 2:
					
					System.out.println("ADICIONAR SÓCIO-TORCEDOR");
					
					System.out.println("Informe o seu nome: ");
					System.out.println("Informe seu email: ");
					System.out.println("Informe seu CPF: ");
					System.out.println("Informe seu telefone: ");
					System.out.println("Informe seu endereço: ");
					System.out.println("Informe o valor de contribuição: ");
					
					break;
					
				case 3:
					
					//Olhar com calma requisito 3
					
					
					break;
					
				case 4:
					
					System.out.println("GERENCIAR RECURSOS FÍSICOS");
					
					System.out.println("Escolha uma opção: ");
					
					System.out.println("1 - Ônibus");
					System.out.println("2 - Estádio");
					System.out.println("3 - Centro de treinamento");
					
					
					break;
					
				case 5:
					
					System.out.println("SOLICITAR RELATÓRIO");
					
					System.out.println("Escolha uma opção: ");
					
					System.out.println("1 - Relatório sobre funcionários");
					System.out.println("2 - Relatório sobre recursos físicos");
					System.out.println("3 - Relatório sobre sócios-torcedores");
					System.out.println("4 - Relatório geral");
					
					
					
					
					break;
					
				case 6:
					
					System.exit(0);
					
				default:
					
					System.out.println("\nOpção inválida, digite uma opção novamente\n");
							
				}
				
				
			}
		}
	}

}
