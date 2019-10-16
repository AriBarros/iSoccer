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
				
				System.out.println("\n--�-- Bem-vindo ao iSoccer --�-- \n");
				
				System.out.println("Escolha uma das op��es a seguir: \n");
				System.out.println("1 - Adicionar funcion�rio");
				System.out.println("2 - Adicionar s�cio-torcedor");
				System.out.println("3 - Atualizar s�cio-torcedor");
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
					input.nextLine();
					
					
					if(opcaoFuncionario == 1) {
				
						pessoa[numeroFuncionario][1] = "Presidente";
						
						System.out.println("Digite o nome completo do Presidente");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Presidente");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Presidente");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o sal�rio do Presidente");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do Presidente");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						pessoa[numeroFuncionario][6] = pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						System.out.println("\n\nPresidente adicionado com sucesso! \n\n");
						
						
					}
					else if(opcaoFuncionario == 2) {
						
						pessoa[numeroFuncionario][1] = "M�dico";
						
						System.out.println("Digite o nome completo do M�dico");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do M�dico");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do M�dico");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o CRM do M�dico");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o sal�rio do M�dico");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("Digite o telefone do M�dico");
						
						pessoa[numeroFuncionario][7] = input.nextLine();
						
						pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
	
						System.out.println("\n\nM�dico adicionado com sucesso! \n\n");
						
					}
					else if(opcaoFuncionario == 3) {
						
						pessoa[numeroFuncionario][1] = "T�cnico";
						
						System.out.println("Digite o nome completo do T�cnico");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do T�cnico");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do T�cnico");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o sal�rio do T�cnico");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do M�dico");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
						System.out.println("\n\nT�cnico adicionado com sucesso! \n\n");
										
					}
					else if(opcaoFuncionario == 4) {
						
						pessoa[numeroFuncionario][1] = "Preparador f�sico";
						
						System.out.println("Digite o nome completo do Preparador F�sico");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Preparador F�sico");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Preparador F�sico");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o sal�rio do T�cnico");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o telefone do Preparador F�sico");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						pessoa[numeroFuncionario][7] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][8] = pessoa[numeroFuncionario][9] = null;
						
						
						System.out.println("\n\nPreparador f�sico adicionado com sucesso! \n\n");
								
						
				
					}
					else if(opcaoFuncionario == 5) {
						
						pessoa[numeroFuncionario][1] = "Motorista";
						
						System.out.println("Digite o nome completo do Motorista");
						
						pessoa[numeroFuncionario][2] = input.nextLine();
						
						System.out.println("Digite o email do Motorista");
						
						pessoa[numeroFuncionario][3] = input.nextLine();
						
						System.out.println("Digite o CPF do Motorista");
						
						pessoa[numeroFuncionario][4] = input.nextLine();
						
						System.out.println("Digite o sal�rio do Motorista");
						
						pessoa[numeroFuncionario][5] = input.nextLine();
						
						System.out.println("Digite o n�mero de habilita��o do Motorista");
						
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
						
						System.out.println("Digite o sal�rio do Cozinheiro");
						
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
						
						System.out.println("Digite o sal�rio do Advogado");
						
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
							
						System.out.println("Digite o sal�rio do Jogador");
						
						pessoa[numeroFuncionario][6] = input.nextLine();
						
						System.out.println("Digite o telefone do Jogador");
						
						pessoa[numeroFuncionario][7] = input.nextLine();
						
						
						System.out.println("Escolha a situa��o do jogador");
						
						System.out.println("1 - Habilitado para jogar");
						System.out.println("2 - Inabilitado (Departamento m�dico)");
						
						situacaoJogador = input.nextInt();
						input.nextLine();
						
						if(situacaoJogador == 1) {
							
							pessoa[numeroFuncionario][8] = "Habilitado";
											
						}
						else if(situacaoJogador == 2) {
							
							pessoa[numeroFuncionario][8] = "Inabilitado";
							
						}
						else {
							System.out.println("\nOp��o Inv�lida!\n");
							break;
						}
		
						
						System.out.println("\n\nJogador adicionado com sucesso! \n\n");
						
							
					}
					else {
						System.out.println("\nOp��o inv�lida!\n");
						break;
					}
					
					pessoa[numeroFuncionario][9] = null;
					
					
					numeroFuncionario++;
					
					
					break;
				
				case 2:
					
					System.out.println("\n-- ADICIONAR S�CIO-TORCEDOR --\n");
					
					socioTorcedor[numeroSocio][0] = Integer.toString(numeroSocio);
					
					System.out.println("Informe o nome do s�cio-torcedor");
					
					socioTorcedor[numeroSocio][1] = input.nextLine();
					
					System.out.println("Informe o email do s�cio-torcedor");
					
					socioTorcedor[numeroSocio][2] = input.nextLine();
					
					System.out.println("Informe o CPF do s�cio-torcedor");
					
					socioTorcedor[numeroSocio][3] = input.nextLine();
					
					System.out.println("Informe o telefone do s�cio-torcedor");
					
					socioTorcedor[numeroSocio][4] = input.nextLine();
					
					System.out.println("Informe o endere�o do s�cio-torcedor");
					
					socioTorcedor[numeroSocio][5] = input.nextLine();
					
					System.out.println("Informe o valor de contribui��o do s�cio-torcedor");
					
					socioTorcedor[numeroSocio][6] = input.nextLine();
					
					System.out.println("Informe o tipo de s�cio-torcedor: 1 - J�nior, 2 - S�nior, 3 - Elite");
					
					tipoSocio = input.nextInt();
					input.nextLine();
					
					if(tipoSocio == 1) {
						socioTorcedor[numeroSocio][7] = "J�nior";
					}
					else if(tipoSocio == 2) {
						socioTorcedor[numeroSocio][7] = "S�nior";
					}
					else if(tipoSocio == 3) {
						socioTorcedor[numeroSocio][7] = "Elite";
					}
					else {
						System.out.println("\nOp��o Inv�lida!\n");
						break;
					}
					
			
					System.out.println("Informe o estado de pagamento do s�cio-torcedor: 1- Adimplente ou 2- Inadimplente");
					
	
					statusSocio = input.nextInt();
					input.nextLine();
					
					if(statusSocio == 1) {
						socioTorcedor[numeroSocio][8] = "Adimplente";
					}
					else if(statusSocio == 2) {
						socioTorcedor[numeroSocio][8] = "Inadimplente";
						
					}
					else {
						System.out.println("\nOp��o Inv�lida!\n");
						break;
					}
					
					System.out.println("S�cio-torcedor adicionado com sucesso!");
						
					numeroSocio++;
					qntSocio++;
					
					break;
					
				case 3:
					
					if(numeroSocio<=1) {
						
						System.out.println("N�o h� s�cios-torcedores para atualizar");
						
						break;
					}
					
					System.out.println("\n-- ATUALIZAR S�CIO-TORCEDOR --\n");
					
					System.out.println("Escolha a op��o que deseja\n");
					
					System.out.println("1 - Alterar tipo de s�cio-torcedor");
					System.out.println("2 - Alterar o valor de pagamento do s�cio-torcedor");
					System.out.println("3 - Alterar estado de pagamento do s�cio-torcedor");
					
					opcaoSocio = input.nextInt();
					input.nextLine();
					
					if(opcaoSocio == 1) {
						
						System.out.println("Escolha o n�mero do s�cio torcedor\n");
						
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
								
								System.out.println("Escolha o tipo de s�cio para atualizar o atual\n");
								
								System.out.println("1 - J�nior");
								System.out.println("2 - S�nior");
								System.out.println("3 - Elite");
								
								tipoSocio = input.nextInt();
								input.nextLine();
								
								if(tipoSocio == 1) {
									socioTorcedor[i][7] = "J�nior";
								}
								else if(tipoSocio == 2) {
									socioTorcedor[i][7] = "S�nior";
								}
								else if(tipoSocio == 3) {
									socioTorcedor[i][7] = "Elite";
								}
								else {
									System.out.println("\nOp��o Inv�lida!\n");
									break;
								}
								
								break;
								
							}
							
						}
						
						System.out.println("\nS�cio-torcedor atualizado com sucesso!\n");
						
					}
					else if(opcaoSocio == 2) {
						
						System.out.println("Escolha o n�mero do s�cio torcedor\n");
						
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
								
								System.out.println("Digite o valor de contribui��o para que o atual seja modificado");
								
								socioTorcedor[i][6] = input.nextLine();
								
								break;
							}
							
						}
						
						System.out.println("\nS�cio-torcedor atualizado com sucesso!\n");
						
					}
					else if(opcaoSocio == 3) {
						
						System.out.println("Escolha o n�mero do s�cio torcedor\n");
						
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
								
								System.out.println("Escolha o estado de pagamento do s�cio-torcedor");
								
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
									System.out.println("\nOp��o Inv�lida!\n");
									break;
								}
								
								break;
							}
							
						}
						
						System.out.println("\nS�cio-torcedor atualizado com sucesso!\n");
						
					}
					else {
						System.out.println("\nOp��o Inv�lida!\n");
					}
									
					break;
					
				case 4:
					
					System.out.println("\n-- GERENCIAR RECURSOS F�SICOS --\n");
					
					System.out.println("Escolha uma op��o\n");
					
					System.out.println("1 - �nibus");
					System.out.println("2 - Est�dio");
					System.out.println("3 - Centro de treinamento");
					
					opcaoRecurso = input.nextInt();
					input.nextLine();
					
					if(opcaoRecurso == 1) {
						
						System.out.println("Gerenciar recurso f�sico: �nibus \n");
						
						System.out.println("Selecione a op��o desejada\n");
						
						System.out.println("1 - Adicionar ou verificar �nibus");
						System.out.println("2 - Informar disponibilidade");
						
						opcaoOnibus = input.nextInt();
						input.nextLine();
						
						if(opcaoOnibus == 1) {
							
							System.out.println("Digite a op��o\n");
							System.out.println("1 - Adicionar");
							System.out.println("2 - Verificar");
							
							subopcaoOnibus = input.nextInt();
							input.nextLine();
							
							if(subopcaoOnibus == 1) {
								
								qntOnibus++;
								
								System.out.println("�nibus adicionado com sucesso!");
								
							}
							else if(subopcaoOnibus == 2) {
								System.out.println("Quantidade de �nibus: " + qntOnibus);
							}
							else {
								System.out.println("\nOp��o Inv�lida!\n");
								break;
							}
							
						}
						else if(opcaoOnibus == 2) {
							
							if(qntOnibus!=0) {
								System.out.println("H� disponibilidade de �nibus!");
							}
							else {
								System.out.println("N�o h� disponibilidade de �nibus!");
							}
							
						}
						else {
							
							System.out.println("\nOp��o inv�lida!\n");
							
						}
						
						
					}
					else if(opcaoRecurso == 2) {
						
						System.out.println("Gerenciar recurso f�sico: Est�dio \n");
						
						System.out.println("Selecione a op��o desejada\n");
						
						System.out.println("1 - Adicionar ou buscar Est�dio");
						System.out.println("2 - Informar disponibilidade");
				
						opcaoEstadio = input.nextInt();
						input.nextLine();
						
						if(opcaoEstadio == 1) {
							
							System.out.println("Digite a op��o\n");
							
							System.out.println("1 - Adicionar");
							System.out.println("2 - Buscar");
							
							subopcaoEstadio = input.nextInt();
							input.nextLine();
							
							if(subopcaoEstadio == 1) {
								
								estadio[numeroEstadio][0] = Integer.toString(numeroEstadio);
								
								System.out.println("Digite o nome do est�dio");
								
								estadio[numeroEstadio][1] = input.nextLine();
								
								System.out.println("Digite o n�mero de torcedores suportados no est�dio");
								
								estadio[numeroEstadio][2] = input.nextLine();
								
								System.out.println("Digite a quantidade de banheiros do est�dio");
								
								estadio[numeroEstadio][3] = input.nextLine();
								
								System.out.println("Digite a quantidade de lanchonetes do est�dio");
								
								estadio[numeroEstadio][4] = input.nextLine();
								
								System.out.println("\nEst�dio adicionado com sucesso!\n");
								
								numeroEstadio++;
								
							}
							else if(subopcaoEstadio == 2){
								
								if(numeroEstadio<=1) {
									
									System.out.println("Nenhum est�dio dispon�vel para a busca");
									break;
									
								}
								
								System.out.println("Digite o n�mero do est�dio\n");
								
								idEstadio = input.nextInt();
								
								for(int i = 1; i < numeroEstadio; i++) {
									
									if(idEstadio == i) {
										
										System.out.println("Nome: " + estadio[i][1] + " | N�mero de torcedores suportados: " + estadio[i][2] + " | N�mero de banheiros: " + estadio[i][3] + " | N�mero de lanchonetes: " + estadio[i][4]);
										
									}
									
								}
								
								
							}
							else {
								
								System.out.println("\nOp��o inv�lida!\n");
								
							}
							
							
						}
						else if(opcaoEstadio == 2)
						{
							
							//1 devido ao id do est�dio criado acima
							if(numeroEstadio >1) {
								System.out.println("H� disponibilidade de est�dio!");
							}
							else {
								System.out.println("N�o h� disponibilidade de est�dio!");
							}
							
						}
						else {
							
							System.out.println("\nOp��o Inv�lida!\n");
							
						}
						
						
					}
					else if(opcaoRecurso == 3) {
						
						System.out.println("Selecione a op��o desejada\n");
						
						System.out.println("1 - Adicionar Centro de treinamento");
						System.out.println("2 - Informar disponibilidade");
						System.out.println("3 - Informar quantidade de dormit�rios");
						
						opcaoCentro = input.nextInt();
						input.nextLine();
						
						if(opcaoCentro == 1) {
							
							centro[numeroCentro][0] = Integer.toString(numeroCentro);
							
							System.out.println("Digite a quantidade de dormit�rios");
							
							centro[numeroCentro][1] = input.nextLine();
							
							System.out.println("\nCentro de treinamento adicionado com sucesso!\n");
											
							numeroCentro++;
							
						}
						else if(opcaoCentro == 2) {
							
							//1 por causa do id do numeroCentro
							if(numeroCentro>1) {
								
								System.out.println("H� disponibilidade de Centro de treinamento");
							
							}
							else {
								System.out.println("N�o h� disponibilidade de Centro de treinamento");
							}
							
						}
						else if(opcaoCentro == 3) {
							
							System.out.println("Quantidade de dormit�rios a partir dos Centros de treinamento dispon�veis");
							
							for(int i = 1; i<numeroCentro; i++) {
								
								System.out.print("" + i + " - Quantidade de dormit�rios:");
								for(int j= 1; j<2; j++) {
									System.out.println("" + centro[i][j]);
								}
								
							}
							
						}
						else {
							
							System.out.println("\nOp��o inv�lida!\n");
							
						}
						

					}
					else {
						
						System.out.println("\nOp��o inv�lida!\n");
						
					}
					
					
					
					break;
					
				case 5:
					
					System.out.println("\n-- SOLICITAR RELAT�RIO --\n");
					
					System.out.println("Escolha uma op��o\n");
					
					System.out.println("1 - Relat�rio sobre funcion�rios");
					System.out.println("2 - Relat�rio sobre recursos f�sicos");
					System.out.println("3 - Relat�rio sobre s�cios-torcedores");
					System.out.println("4 - Relat�rio geral");
					
					opcaoRelatorio = input.nextInt();
					input.nextLine();
					
					
					if(opcaoRelatorio == 1) {
						
						System.out.println("\nEscolha o relat�rio sobre funcion�rios que deseja\n");
						
						System.out.println("1 - Time");
						System.out.println("2 - Jogadores aptos para jogar");
						System.out.println("3 - Jogadores inaptos para jogar");
						System.out.println("4 - Servi�os gerais");
						
						relatorioFuncionario = input.nextInt();
						input.nextLine();
						
						if(relatorioFuncionario == 1) {
							
							System.out.println("\nT�cnico(s):\n");
							
							//Informa��o dos t�cnicos
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "T�cnico") {
									
									for(int j = 1; j<7; j++) {
										
										System.out.print("" + pessoa[i][j] + " | ");
										
									}
									
									System.out.println();
								}
								
							}
							
							System.out.println("\n\nJogador(es):\n");
							
							//Informa��o dos jogadores
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
							
							System.out.println("\nM�dico(s):\n");
							for(int i = 1; i< numeroFuncionario; i++) {
								
								if(pessoa[i][1] == "M�dico") {
									
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
							System.out.println("\nOp��o inv�lida!\n");
						}
						
					}
					else if(opcaoRelatorio == 2) {
						
						System.out.println("\nEscolha o relat�rio do recurso f�sico que deseja");
						
						System.out.println("1 - Transporte");
						System.out.println("2 - Centro de treinamento");
						System.out.println("3 - Est�dio");
						
						
						relatorioRecurso = input.nextInt();
						input.nextLine();
						
						if(relatorioRecurso == 1) {
							System.out.println("\nQuantidade de �nibus: " + qntOnibus);
						}
						else if(relatorioRecurso == 2) {
							
							System.out.println("\nCentro(s) de treinamento(s):\n");
							
							for(int i = 1; i<numeroCentro; i++) {
								
								System.out.print("" + i + " - Quantidade de dormit�rios: ");
								for(int j= 1; j<2; j++) {
									System.out.println("" + centro[i][j]);
								}
								
							}
							
						}
						else if(relatorioRecurso == 3) {
							
							System.out.println("\nEst�dio(s):\n");
							
							for(int i = 1; i < numeroEstadio; i++) {
								
								System.out.println("Nome: " + estadio[i][1] + " | N�mero de torcedores suportados: " + estadio[i][2] + " | N�mero de banheiros: " + estadio[i][3] + " | N�mero de lanchonetes: " + estadio[i][4]);
									
							}
							
						}
						else {
							
							System.out.println("\nOp��o inv�lida!\n");
							
						}
						
					}
					else if(opcaoRelatorio == 3) {
						
						System.out.println("\nEscolha o tipo de relat�rio desejado\n");
						
						System.out.println("1 - Quantidade de s�cio-torcedores");
						System.out.println("2 - S�cio-torcedores adimplentes");
						System.out.println("3 - S�cio-torcedores inadimplentes");
						System.out.println("4 - Lista com dados individuais");
						
						relatorioSocio = input.nextInt();
						input.nextLine();
						
						if(relatorioSocio == 1) {
							
							System.out.println("Quantidade de s�cio-torcedores: " + qntSocio);

						}
						else if(relatorioSocio == 2) {
							
							System.out.println("S�cio-torcedores adimplentes");
							
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
							
							
							System.out.println("S�cio-torcedores inadimplentes");
							
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
							
							System.out.println("Lista de s�cio-torcedores com dados individuais");
							
							for(int i= 1; i<numeroSocio; i++) {
								
								System.out.print("" + i + " - ");
								for(int j =1; j<9; j++) {
									
									System.out.print("" + socioTorcedor[i][j] + " | ");
									
								}
								
								System.out.println();
							}
							
							
						}
						else {
							
							System.out.println("\nOp��o inv�lida!\n");
							
						}
						
						
					}
					else if(opcaoRelatorio == 4) {
						
						System.out.println("\nRelat�rio de funcion�rios, recursos f�sicos e s�cio-torcedor\n");
						
						System.out.println("Funcion�rio(s):");
						
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
						
						System.out.println("Quantidade de �nibus: " + qntOnibus);
						
						System.out.println("\nEst�dio(s):");
						
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
						
						
						System.out.println("\nS�cio-torcedore(s):");
						
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
						System.out.println("\nOp��o inv�lida!\n");
					}
					
					break;
					
				case 6:
					
					System.exit(0);
					
				default:
					
					System.out.println("\nOp��o inv�lida, digite uma op��o novamente\n");
							
				}
				
				
			}
		}
	}


