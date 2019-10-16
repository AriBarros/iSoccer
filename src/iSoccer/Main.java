package iSoccer;

import java.util.Scanner;

public class Main {
	
	
	static int opcao, opcaoFuncionario, opcaoRecurso, opcaoRelatorio, opcaoOnibus, subopcaoOnibus, opcaoEstadio, subopcaoEstadio, opcaoCentro, opcaoSocio;
	static int relatorioFuncionario, relatorioRecurso, relatorioSocio; 
	static int statusSocio, tipoSocio, atualizarSocio, estadoSocio;
	static int idEstadio;
	static String login, senha;	
	
	
	public static void main(String[] args) {
		
		int numeroFuncionario = 1, situacaoJogador, numeroSocio = 1, qntOnibus = 0, qntSocio = 0, numeroEstadio = 1, numeroCentro=1;
		int linha = 100, coluna = 10;
		
		
		String[][] pessoa = new String[linha][coluna];
		String[][] socioTorcedor = new String[linha][coluna];
		String[][] estadio = new String[linha][5];
		String[][] centro = new String[linha][2];
		
		
		Scanner input = new Scanner(System.in);
		
		//Login no sistema
		do {
			
			System.out.println("\nInforme o login e a senha para entrar no sistema\n");
			System.out.print("Login: ");
			
			login = input.nextLine();
			
			System.out.print("Senha: ");
			
			senha = input.nextLine();
			
			if(!login.equals("admin") && senha.equals("123")) {
				System.out.println("Login incorreto");
			}
			else if(login.equals("admin") && !senha.equals("123")) {
				System.out.println("Senha incorreta");
			}
			else if(!(login.equals("admin") && senha.equals("123"))) {
				System.out.println("Login e senha incorretos");
			}
			
			
		}
		while(!(login.equals("admin") && senha.equals("123"))); 
			
		
			while(opcao!=6) {
				
				System.out.println("\n--°-- Bem-vindo ao iSoccer --°-- \n");
				
				System.out.println("Escolha uma das opções a seguir: \n");
				System.out.println("1 - Adicionar funcionário");
				System.out.println("2 - Adicionar sócio-torcedor");
				System.out.println("3 - Atualizar sócio-torcedor");
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
						
						pessoa[numeroFuncionario][6] = pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
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
						
						pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
	
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
						
						pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
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
						
						pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
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
						
						pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
						
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
						
						pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
						
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
						
						pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
						
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
						else if(situacaoJogador == 2) {
							
							pessoa[numeroFuncionario][8] = "Inabilitado";
							
						}
						else {
							System.out.println("\nOpção Inválida!\n");
							break;
						}
		
						
						System.out.println("\n\nJogador adicionado com sucesso! \n\n");
						
							
					}
					else {
						System.out.println("\nOpção inválida!\n");
						break;
					}
					
					pessoa[numeroFuncionario][9] = null;
					
					
					numeroFuncionario++;
					
					
					break;
				
				case 2:
					
					System.out.println("\n-- ADICIONAR SÓCIO-TORCEDOR --\n");
					
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
					
					System.out.println("Informe o tipo de sócio-torcedor: 1 - Júnior, 2 - Sênior, 3 - Elite");
					
					tipoSocio = input.nextInt();
					input.nextLine();
					
					if(tipoSocio == 1) {
						socioTorcedor[numeroSocio][7] = "Júnior";
					}
					else if(tipoSocio == 2) {
						socioTorcedor[numeroSocio][7] = "Sênior";
					}
					else if(tipoSocio == 3) {
						socioTorcedor[numeroSocio][7] = "Elite";
					}
					else {
						System.out.println("\nOpção Inválida!\n");
						break;
					}
					
			
					System.out.println("Informe o estado de pagamento do sócio-torcedor: 1- Adimplente ou 2- Inadimplente");
					
	
					statusSocio = input.nextInt();
					input.nextLine();
					
					if(statusSocio == 1) {
						socioTorcedor[numeroSocio][8] = "Adimplente";
					}
					else if(statusSocio == 2) {
						socioTorcedor[numeroSocio][8] = "Inadimplente";
						
					}
					else {
						System.out.println("\nOpção Inválida!\n");
						break;
					}
					
					System.out.println("Sócio-torcedor adicionado com sucesso!");
						
					numeroSocio++;
					qntSocio++;
					
					break;
					
				case 3:
					
					if(numeroSocio<=1) {
						
						System.out.println("Não há sócios-torcedores para atualizar");
						
						break;
					}
					
					System.out.println("\n-- ATUALIZAR SÓCIO-TORCEDOR --\n");
					
					System.out.println("Escolha a opção que deseja\n");
					
					System.out.println("1 - Alterar tipo de sócio-torcedor");
					System.out.println("2 - Alterar o valor de pagamento do sócio-torcedor");
					System.out.println("3 - Alterar estado de pagamento do sócio-torcedor");
					
					opcaoSocio = input.nextInt();
					input.nextLine();
					
					if(opcaoSocio == 1) {
						
						System.out.println("Escolha o número do sócio torcedor\n");
						
						for(int i = 1; i<numeroSocio; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j =1; j<coluna; j++) {
								
								System.out.print("" + socioTorcedor[i][j] + " | ");
								
							}
							
							System.out.println("\n");
						}
						
						atualizarSocio = input.nextInt();
						input.nextLine();
						
						for(int i = 1; i<numeroSocio; i++) {
							
							if(atualizarSocio == i) {
								
								System.out.println("Escolha o tipo de sócio para atualizar o atual\n");
								
								System.out.println("1 - Júnior");
								System.out.println("2 - Sênior");
								System.out.println("3 - Elite");
								
								tipoSocio = input.nextInt();
								input.nextLine();
								
								if(tipoSocio == 1) {
									socioTorcedor[i][7] = "Júnior";
								}
								else if(tipoSocio == 2) {
									socioTorcedor[i][7] = "Sênior";
								}
								else if(tipoSocio == 3) {
									socioTorcedor[i][7] = "Elite";
								}
								else {
									System.out.println("\nOpção Inválida!\n");
									break;
								}
								
								break;
								
							}
							
						}
						
						System.out.println("\nSócio-torcedor atualizado com sucesso!\n");
						
					}
					else if(opcaoSocio == 2) {
						
						System.out.println("Escolha o número do sócio torcedor\n");
						
						for(int i = 1; i<numeroSocio; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j =1; j<coluna; j++) {
								
								System.out.print("" + socioTorcedor[i][j] + " | ");
								
							}
							
							System.out.println("\n");
						}
						
						atualizarSocio = input.nextInt();
						input.nextLine();
						
						for(int i = 1; i<numeroSocio; i++) {
							
							if(atualizarSocio == i) {
								
								System.out.println("Digite o valor de contribuição para que o atual seja modificado");
								
								socioTorcedor[i][6] = input.nextLine();
								
								break;
							}
							
						}
						
						System.out.println("\nSócio-torcedor atualizado com sucesso!\n");
						
					}
					else if(opcaoSocio == 3) {
						
						System.out.println("Escolha o número do sócio torcedor\n");
						
						for(int i = 1; i<numeroSocio; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j =1; j<coluna; j++) {
								
								System.out.print("" + socioTorcedor[i][j] + " | ");
								
							}
							
							System.out.println("\n");
						}
						
						atualizarSocio = input.nextInt();
						input.nextLine();
						
						for(int i = 1; i<numeroSocio; i++) {
							
							if(atualizarSocio == i) {
								
								System.out.println("Escolha o estado de pagamento do sócio-torcedor");
								
								System.out.println("1 - Adimplente");
								System.out.println("2 - Inadimplente");
								
								estadoSocio = input.nextInt();
								input.nextLine();
								
								if(estadoSocio == 1) {
									socioTorcedor[i][8] = "Adimplente";
								}
								else if(estadoSocio == 2) {
									socioTorcedor[i][8] = "Inadimplente";
								}
								else {
									System.out.println("\nOpção Inválida!\n");
									break;
								}
								
								break;
							}
							
						}
						
						System.out.println("\nSócio-torcedor atualizado com sucesso!\n");
						
					}
					else {
						System.out.println("\nOpção Inválida!\n");
					}
									
					break;
					
				case 4:
					
					System.out.println("\n-- GERENCIAR RECURSOS FÍSICOS --\n");
					
					System.out.println("Escolha uma opção\n");
					
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
							
							System.out.println("Digite a opção\n");
							System.out.println("1 - Adicionar");
							System.out.println("2 - Verificar");
							
							subopcaoOnibus = input.nextInt();
							input.nextLine();
							
							if(subopcaoOnibus == 1) {
								
								qntOnibus++;
								
								System.out.println("Ônibus adicionado com sucesso!");
								
							}
							else if(subopcaoOnibus == 2) {
								System.out.println("Quantidade de ônibus: " + qntOnibus);
							}
							else {
								System.out.println("\nOpção Inválida!\n");
								break;
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
							
							System.out.println("Digite a opção\n");
							
							System.out.println("1 - Adicionar");
							System.out.println("2 - Buscar");
							
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
								
								if(numeroEstadio<=1) {
									
									System.out.println("Nenhum estádio disponível para a busca");
									break;
									
								}
								
								System.out.println("Digite o número do estádio\n");
								
								idEstadio = input.nextInt();
								
								for(int i = 1; i < numeroEstadio; i++) {
									
									if(idEstadio == i) {
										
										System.out.println("Nome: " + estadio[i][1] + " | Número de torcedores suportados: " + estadio[i][2] + " | Número de banheiros: " + estadio[i][3] + " | Número de lanchonetes: " + estadio[i][4]);
										
									}
									
								}
								
								
							}
							else {
								
								System.out.println("\nOpção inválida!\n");
								
							}
							
							
						}
						else if(opcaoEstadio == 2)
						{
							
							//1 devido ao id do estádio criado acima
							if(numeroEstadio >1) {
								System.out.println("Há disponibilidade de estádio!");
							}
							else {
								System.out.println("Não há disponibilidade de estádio!");
							}
							
						}
						else {
							
							System.out.println("\nOpção Inválida!\n");
							
						}
						
						
					}
					else if(opcaoRecurso == 3) {
						
						System.out.println("Selecione a opção desejada\n");
						
						System.out.println("1 - Adicionar Centro de treinamento");
						System.out.println("2 - Informar disponibilidade");
						System.out.println("3 - Informar quantidade de dormitórios");
						
						opcaoCentro = input.nextInt();
						input.nextLine();
						
						if(opcaoCentro == 1) {
							
							centro[numeroCentro][0] = Integer.toString(numeroCentro);
							
							System.out.println("Digite a quantidade de dormitórios");
							
							centro[numeroCentro][1] = input.nextLine();
							
							System.out.println("\nCentro de treinamento adicionado com sucesso!\n");
											
							numeroCentro++;
							
						}
						else if(opcaoCentro == 2) {
							
							//1 por causa do id do numeroCentro
							if(numeroCentro>1) {
								
								System.out.println("Há disponibilidade de Centro de treinamento");
							
							}
							else {
								System.out.println("Não há disponibilidade de Centro de treinamento");
							}
							
						}
						else if(opcaoCentro == 3) {
							
							System.out.println("Quantidade de dormitórios a partir dos Centros de treinamento disponíveis");
							
							for(int i = 1; i<numeroCentro; i++) {
								
								System.out.print("" + i + " - Quantidade de dormitórios:");
								for(int j= 1; j<2; j++) {
									System.out.println("" + centro[i][j]);
								}
								
							}
							
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
					
					System.out.println("\n-- SOLICITAR RELATÓRIO --\n");
					
					System.out.println("Escolha uma opção\n");
					
					System.out.println("1 - Relatório sobre funcionários");
					System.out.println("2 - Relatório sobre recursos físicos");
					System.out.println("3 - Relatório sobre sócios-torcedores");
					System.out.println("4 - Relatório geral");
					
					opcaoRelatorio = input.nextInt();
					input.nextLine();
					
					
					if(opcaoRelatorio == 1) {
						
						System.out.println("\nEscolha o relatório sobre funcionários que deseja\n");
						
						System.out.println("1 - Time");
						System.out.println("2 - Jogadores aptos para jogar");
						System.out.println("3 - Jogadores inaptos para jogar");
						System.out.println("4 - Serviços gerais");
						
						relatorioFuncionario = input.nextInt();
						input.nextLine();
						
						if(relatorioFuncionario == 1) {
							
							System.out.println("\nTécnico(s):\n");
							
							//Informação dos técnicos
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "Técnico") {
									
									for(int j = 1; j<7; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
							System.out.println("\n\nJogador(es):\n");
							
							//Informação dos jogadores
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "Jogador") {
									
									for(int j = 1; j<9; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
							
							
						}
						else if(relatorioFuncionario == 2) {
							
							System.out.println("Jogador(es) apto(s):\n");
							
							for(int i = 1; i< numeroFuncionario; i++) {
								
								
								if(pessoa[i][1] == "Jogador" && pessoa[i][8] == "Habilitado") {
									
									for(int j = 1; j<9; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
						}
						else if(relatorioFuncionario == 3) {
							
							System.out.println("Jogador(es) inapto(s):\n");
							
							for(int i = 1; i< numeroFuncionario; i++) {
								
								
								if(pessoa[i][1] == "Jogador" && pessoa[i][8] == "Inabilitado") {
									
									for(int j = 1; j<9; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
						}
						else if(relatorioFuncionario == 4) {
							
							System.out.println("\nMédico(s):\n");
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "Médico") {
									
									for(int j = 1; j<8; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
							System.out.println("\nMotorista(s):\n");
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "Motorista") {
									
									for(int j = 1; j<8; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
							System.out.println("\nCozinheiro(s):\n");
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "Cozinheiro") {
									
									for(int j = 1; j<7; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
							
						}
						else {
							System.out.println("\nOpção inválida!\n");
						}
						
					}
					else if(opcaoRelatorio == 2) {
						
						System.out.println("\nEscolha o relatório do recurso físico que deseja");
						
						System.out.println("1 - Transporte");
						System.out.println("2 - Centro de treinamento");
						System.out.println("3 - Estádio");
						
						
						relatorioRecurso = input.nextInt();
						input.nextLine();
						
						if(relatorioRecurso == 1) {
							System.out.println("\nQuantidade de ônibus: " + qntOnibus);
						}
						else if(relatorioRecurso == 2) {
							
							System.out.println("\nCentro(s) de treinamento(s):\n");
							
							for(int i = 1; i<numeroCentro; i++) {
								
								System.out.print("" + i + " - Quantidade de dormitórios: ");
								for(int j= 1; j<2; j++) {
									System.out.println("" + centro[i][j]);
								}
								
							}
							
						}
						else if(relatorioRecurso == 3) {
							
							System.out.println("\nEstádio(s):\n");
							
							for(int i = 1; i < numeroEstadio; i++) {
								
								System.out.println("Nome: " + estadio[i][1] + " | Número de torcedores suportados: " + estadio[i][2] + " | Número de banheiros: " + estadio[i][3] + " | Número de lanchonetes: " + estadio[i][4]);
									
							}
							
						}
						else {
							
							System.out.println("\nOpção inválida!\n");
							
						}
						
					}
					else if(opcaoRelatorio == 3) {
						
						System.out.println("\nEscolha o tipo de relatório desejado\n");
						
						System.out.println("1 - Quantidade de sócio-torcedores");
						System.out.println("2 - Sócio-torcedores adimplentes");
						System.out.println("3 - Sócio-torcedores inadimplentes");
						System.out.println("4 - Lista com dados individuais");
						
						relatorioSocio = input.nextInt();
						input.nextLine();
						
						if(relatorioSocio == 1) {
							
							System.out.println("Quantidade de sócio-torcedores: " + qntSocio);

						}
						else if(relatorioSocio == 2) {
							
							System.out.println("Sócio-torcedores adimplentes");
							
							for(int i= 1; i<numeroSocio; i++) {
								
								if(socioTorcedor[i][8] == "Adimplente") {
															
									System.out.print("" + i + " - ");
									for(int j =1; j<9; j++) {
										
										System.out.print("" + socioTorcedor[i][j] + " | ");
										
									}
									
									System.out.println();
								}
							}
							
							
						}
						else if(relatorioSocio == 3) {
							
							
							System.out.println("Sócio-torcedores inadimplentes");
							
							for(int i= 1; i<numeroSocio; i++) {
								
								if(socioTorcedor[i][8] == "Inadimplente") {
															
									
									System.out.print("" + i + " - ");
									for(int j =1; j<9; j++) {
										
										System.out.print("" + socioTorcedor[i][j] + " | ");
										
									}
									
									System.out.println();
								}
							}
							
							
						}
						else if(relatorioSocio == 4) {
							
							System.out.println("Lista de sócio-torcedores com dados individuais");
							
							for(int i= 1; i<numeroSocio; i++) {
								
								System.out.print("" + i + " - ");
								for(int j =1; j<9; j++) {
									
									System.out.print("" + socioTorcedor[i][j] + " | ");
									
								}
								
								System.out.println();
							}
							
							
						}
						else {
							
							System.out.println("\nOpção inválida!\n");
							
						}
						
						
					}
					else if(opcaoRelatorio == 4) {
						
						System.out.println("\nRelatório de funcionários, recursos físicos e sócio-torcedor\n");
						
						System.out.println("Funcionário(s):");
						
						for(int i = 1; i<numeroFuncionario; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j = 1; j<coluna; j++) {
								
								if(pessoa[i][j] != null) {
									System.out.print("" + pessoa[i][j] + " | ");
								}
								
								
							}
							
							System.out.println();
							
						}
						
						System.out.println();
						
						System.out.println("Quantidade de ônibus: " + qntOnibus);
						
						System.out.println("\nEstádio(s):");
						
						for(int i=1; i<numeroEstadio; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j=1; j<5; j++) {
							
								System.out.print("" + estadio[i][j] + " | ");
								
							}
							
							System.out.println();
							
						}
						
						System.out.println();
						
						System.out.println("\nCentro(s) de treinamento(s):");
						
						for(int i = 1; i<numeroCentro; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j=1; j<2; j++) {
								
								System.out.print("" + centro[i][j] + " | ");
								
								
							}
							
							
						}
						
						System.out.println();
						
						
						System.out.println("\nSócio-torcedore(s):");
						
						for(int i = 1; i<numeroSocio; i++) {
							
							System.out.print("" + i + " - ");
							
							for(int j=1; j<9; j++) {
								
								System.out.print("" + socioTorcedor[i][j] + " | ");
								
							}
							System.out.println();
							
						}
						
						System.out.println();
						
						
					}
					else {
						System.out.println("\nOpção inválida!\n");
					}
					
					break;
					
				case 6:
					
					System.exit(0);
					
				default:
					
					System.out.println("\nOpção inválida, digite uma opção novamente\n");
							
				}
				
				
			}
		}
	}


