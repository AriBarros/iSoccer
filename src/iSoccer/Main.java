package iSoccer;

import java.util.Scanner;

public class Main {
	
	/*
			 0					  1
			 
		N� Funcion�ro |	  Tipo de funcion�rio  | 
		
	
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
						else {
							pessoa[numeroFuncionario][8] = "Inabilitado";
						}
		
						
						System.out.println("\n\nJogador adicionado com sucesso! \n\n");
						
							
					}
					else {
						System.out.println("\nOp��o inv�lida!\n");
					}
					
					
					numeroFuncionario++;
					
					break;
				
				case 2:
					
					System.out.println("ADICIONAR S�CIO-TORCEDOR");
					
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
					
					//7 = adimplente ou inadimplente
					//8 = tipo s�cio torcedor
					
					numeroSocio++;
					
					break;
					
				case 3:
					
					//7 = adimplente ou inadimplente
					//8 = tipo s�cio torcedor
					
					//Olhar com calma requisito 3
					
					
					break;
					
				case 4:
					
					System.out.println("GERENCIAR RECURSOS F�SICOS");
					
					System.out.println("Escolha uma op��o: ");
					
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
							
							System.out.println("1 - Adicionar\n");
							System.out.println("2 - Verificar\n");
							
							subopcaoOnibus = input.nextInt();
							input.nextLine();
							
							if(subopcaoOnibus == 1) {
								
								qntOnibus++;
								
								System.out.println("�nibus adicionado com sucesso!");
								
							}
							else {
								System.out.println("Quantidade de �nibus: " + qntOnibus);
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
							
							System.out.println("1 - Adicionar\n");
							System.out.println("2 - Buscar\n");
							
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
								
								//buscar est�dio
								
							}
							else {
								
								System.out.println("Op��o inv�lida");
								
							}
							
							
						}
						else
						{
							
							//1 devido ao id do est�dio criado acima
							if(numeroEstadio >1) {
								System.out.println("H� disponibilidade de est�dio!");
							}
							else {
								System.out.println("N�o h� disponibilidade de est�dio!");
							}
							
						}
						
						
					}
					if(opcaoRecurso == 3) {
						
						System.out.println("Selecione a op��o desejada\n");
						
						System.out.println("1 - Adicionar Centro de treinamento");
						System.out.println("2 - Informar disponibilidade");
						System.out.println("3 - Informar quantidade de dormit�rios");
						
						if(opcaoCentro == 1) {
							
							System.out.println("Digite a quantidade de dormit�rios");
							
							qntDormitorio = input.nextInt();
							input.nextLine();
							
							qntCentro++;
							
						}
						else if(opcaoCentro == 2) {
							
							if(qntCentro>0) {
								
								System.out.println("H� disponibilidade de Centro de treinamento");
							
							}
							else {
								System.out.println("N�o h� disponibilidade de Centro de treinamento");
							}
							
						}
						else if(opcaoCentro== 3) {
							
							System.out.println("Quantidade de dormit�rios: " + qntDormitorio);
							
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
