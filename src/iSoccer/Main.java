package iSoccer;

import java.util.Scanner;

public class Main {
	
	/*
			 0					  1
			 
		N° Funcionáro |	  Tipo de funcionário  | 
		
	
	*/
	
	static int opcao, opcaoFuncionario, opcaoRecurso, opcaoRelatorio, opcaoOnibus, subopcaoOnibus, opcaoEstadio, subopcaoEstadio, opcaoCentro;
	static String login, senha;
	
	
	
	public static void main(String[] args) {
		
		int numeroFuncionario = 1, situacaoJogador, numeroSocio = 1, qntOnibus = 0, numeroEstadio = 1, qntCentro=0, qntDormitorio=0;
		int i = 100, j = 9;
		
		String[][] pessoa = new String[i][j];
		String[][] socioTorcedor = new String[i][j];
		String[][] estadio = new String[i][5];
	
		
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
					input.nextLine();
					
					
					if(opcaoFuncionario == 1) {
				
						pessoa[numeroFuncionario][1] = "Presidente";
						
						System.out.println("Digite o nome completo do Presidente");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Presidente");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Presidente");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do Presidente");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do Presidente");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						
						System.out.println("\n\nPresidente adicionado com sucesso! \n\n");
						
						
					}
					else if(opcaoFuncionario == 2) {
						
						pessoa[numeroFuncionario][1] = "Médico";
						
						System.out.println("Digite o nome completo do Médico");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Médico");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Médico");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o CRM do Médico");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o salário do Médico");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("Digite o telefone do Médico");
						
						pessoa[numeroFuncionario][7] = input.nextLine();
						
						
						System.out.println("\n\nMédico adicionado com sucesso! \n\n");
						
					}
					else if(opcaoFuncionario == 3) {
						
						pessoa[numeroFuncionario][1] = "Técnico";
						
						System.out.println("Digite o nome completo do Técnico");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Técnico");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Técnico");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do Técnico");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do Médico");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("\n\nTécnico adicionado com sucesso! \n\n");
										
					}
					else if(opcaoFuncionario == 4) {
						
						pessoa[numeroFuncionario][1] = "Preparador físico";
						
						System.out.println("Digite o nome completo do Preparador Físico");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Preparador Físico");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Preparador Físico");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do Técnico");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do Preparador Físico");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("\n\nPreparador físico adicionado com sucesso! \n\n");
								
						
				
					}
					else if(opcaoFuncionario == 5) {
						
						pessoa[numeroFuncionario][1] = "Motorista";
						
						System.out.println("Digite o nome completo do Motorista");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Motorista");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Motorista");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do Motorista");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o número de habilitação do Motorista");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("Digite o telefone do Motorista");
						
						pessoa[numeroFuncionario][7] = input.nextLine();
						
						
						System.out.println("\n\nMotorista adicionado com sucesso! \n\n");
								
						
						
					}
					else if(opcaoFuncionario == 6) {
						
						pessoa[numeroFuncionario][1] = "Cozinheiro";
						
						System.out.println("Digite o nome completo do Cozinheiro");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Cozinheiro");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Cozinheiro");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do Cozinheiro");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
							
						System.out.println("Digite o telefone do Cozinheiro");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						
						System.out.println("\n\nCozinheiro adicionado com sucesso! \n\n");
							
						
						
					}
					else if(opcaoFuncionario == 7) {
						
						pessoa[numeroFuncionario][1] = "Advogado";
						
						System.out.println("Digite o nome completo do Advogado");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Advogado");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Advogado");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o salário do Advogado");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
							
						System.out.println("Digite o telefone do Advogado");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						
						System.out.println("\n\nAdvogado adicionado com sucesso! \n\n");
							
						
					}
					else if(opcaoFuncionario == 8) {
						
						pessoa[numeroFuncionario][1] = "Jogador";
						
						System.out.println("Digite o nome completo do Jogador");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o tipo de jogador (volante, zagueiro, meia, goleiro, atacante, lateral esquerdo ou lateral direito");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o email do Jogador");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o CPF do Jogador");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
							
						System.out.println("Digite o salário do Jogador");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("Digite o telefone do Jogador");
						
						pessoa[numeroFuncionario][7] = input.nextLine();
						
						
						System.out.println("Escolha a situação do jogador");
						
						System.out.println("1 - Habilitado para jogar");
						System.out.println("2 - Inabilitado (Departamento médico)");
						
						situacaoJogador = input.nextInt();
						input.nextLine();
						
						if(situacaoJogador == 1) {
							pessoa[numeroFuncionario][8] = "Habilitado";
						}
						else {
							pessoa[numeroFuncionario][8] = "Inabilitado";
						}
		
						
						System.out.println("\n\nJogador adicionado com sucesso! \n\n");
						
							
					}
					else {
						System.out.println("\nOpção inválida!\n");
					}
					
					
					numeroFuncionario++;
					
					break;
				
				case 2:
					
					System.out.println("ADICIONAR SÓCIO-TORCEDOR");
					
					socioTorcedor[numeroSocio][0] = Integer.toString(numeroSocio);
					
					System.out.println("Informe o nome do sócio-torcedor");
					
					socioTorcedor[numeroSocio][1] = input.nextLine();
					
					System.out.println("Informe o email do sócio-torcedor");
					
					socioTorcedor[numeroSocio][2] = input.nextLine();
					
					System.out.println("Informe o CPF do sócio-torcedor");
					
					socioTorcedor[numeroSocio][3] = input.nextLine();
					
					System.out.println("Informe o telefone do sócio-torcedor");
					
					socioTorcedor[numeroSocio][4] = input.nextLine();
					
					System.out.println("Informe o endereço do sócio-torcedor");
					
					socioTorcedor[numeroSocio][5] = input.nextLine();
					
					System.out.println("Informe o valor de contribuição do sócio-torcedor");
					
					socioTorcedor[numeroSocio][6] = input.nextLine();
					
					//7 = adimplente ou inadimplente
					//8 = tipo sócio torcedor
					
					numeroSocio++;
					
					break;
					
				case 3:
					
					//7 = adimplente ou inadimplente
					//8 = tipo sócio torcedor
					
					//Olhar com calma requisito 3
					
					
					break;
					
				case 4:
					
					System.out.println("GERENCIAR RECURSOS FÍSICOS");
					
					System.out.println("Escolha uma opção: ");
					
					System.out.println("1 - Ônibus");
					System.out.println("2 - Estádio");
					System.out.println("3 - Centro de treinamento");
					
					opcaoRecurso = input.nextInt();
					input.nextLine();
					
					if(opcaoRecurso == 1) {
						
						System.out.println("Gerenciar recurso físico: Ônibus \n");
						
						System.out.println("Selecione a opção desejada\n");
						
						System.out.println("1 - Adicionar ou verificar ônibus");
						System.out.println("2 - Informar disponibilidade");
						
						opcaoOnibus = input.nextInt();
						input.nextLine();
						
						if(opcaoOnibus == 1) {
							
							System.out.println("1 - Adicionar\n");
							System.out.println("2 - Verificar\n");
							
							subopcaoOnibus = input.nextInt();
							input.nextLine();
							
							if(subopcaoOnibus == 1) {
								
								qntOnibus++;
								
								System.out.println("Ônibus adicionado com sucesso!");
								
							}
							else {
								System.out.println("Quantidade de ônibus: " + qntOnibus);
							}
							
						}
						else if(opcaoOnibus == 2) {
							
							if(qntOnibus!=0) {
								System.out.println("Há disponibilidade de Ônibus!");
							}
							else {
								System.out.println("Não há disponibilidade de Ônibus!");
							}
							
						}
						else {
							
							System.out.println("\nOpção inválida!\n");
							
						}
						
						
					}
					else if(opcaoRecurso == 2) {
						
						System.out.println("Gerenciar recurso físico: Estádio \n");
						
						System.out.println("Selecione a opção desejada\n");
						
						System.out.println("1 - Adicionar ou buscar Estádio");
						System.out.println("2 - Informar disponibilidade");
				
						opcaoEstadio = input.nextInt();
						input.nextLine();
						
						if(opcaoEstadio == 1) {
							
							System.out.println("1 - Adicionar\n");
							System.out.println("2 - Buscar\n");
							
							subopcaoEstadio = input.nextInt();
							input.nextLine();
							
							if(subopcaoEstadio == 1) {
								
								estadio[numeroEstadio][0] = Integer.toString(numeroEstadio);
								
								System.out.println("Digite o nome do estádio");
								
								estadio[numeroEstadio][1] = input.nextLine();
								
								System.out.println("Digite o número de torcedores suportados no estádio");
								
								estadio[numeroEstadio][2] = input.nextLine();
								
								System.out.println("Digite a quantidade de banheiros do estádio");
								
								estadio[numeroEstadio][3] = input.nextLine();
								
								
								System.out.println("Digite a quantidade de lanchonetes do estádio");
								
								estadio[numeroEstadio][4] = input.nextLine();
								
								System.out.println("\nEstádio adicionado com sucesso!\n");
								
								numeroEstadio++;
								
							}
							else if(subopcaoEstadio == 2){
								
								//buscar estádio
								
							}
							else {
								
								System.out.println("Opção inválida");
								
							}
							
							
						}
						else
						{
							
							//1 devido ao id do estádio criado acima
							if(numeroEstadio >1) {
								System.out.println("Há disponibilidade de estádio!");
							}
							else {
								System.out.println("Não há disponibilidade de estádio!");
							}
							
						}
						
						
					}
					if(opcaoRecurso == 3) {
						
						System.out.println("Selecione a opção desejada\n");
						
						System.out.println("1 - Adicionar Centro de treinamento");
						System.out.println("2 - Informar disponibilidade");
						System.out.println("3 - Informar quantidade de dormitórios");
						
						if(opcaoCentro == 1) {
							
							System.out.println("Digite a quantidade de dormitórios");
							
							qntDormitorio = input.nextInt();
							input.nextLine();
							
							qntCentro++;
							
						}
						else if(opcaoCentro == 2) {
							
							if(qntCentro>0) {
								
								System.out.println("Há disponibilidade de Centro de treinamento");
							
							}
							else {
								System.out.println("Não há disponibilidade de Centro de treinamento");
							}
							
						}
						else if(opcaoCentro== 3) {
							
							System.out.println("Quantidade de dormitórios: " + qntDormitorio);
							
						}
						else {
							
							System.out.println("\nOpção inválida!\n");
							
						}
						

					}
					else {
						
						System.out.println("\nOpção inválida!\n");
						
					}
					
					
					
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
