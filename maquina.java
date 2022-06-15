/**
 * 
 */
package maquina;

import java.util.Scanner;

/**
 * @author lucia
 *
 */
public class maquina {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int entrada;
		double lavPesada = 0;
		double lavNormal = 0;
		double lavRapida = 0;
		double lavEnxague = 0;
		double lavCentrifuga = 0;
		int peso = 0, estagio1 = 0, estagio2 = 0, estagio3 = 0, estagio4 = 0, estagio5 = 0;
		int voltagem = 0, tempo1 = 0, tempo2 = 0, tempo3 = 0, tempo4 = 0, tempo5 = 0;
		int kg = 0;
		double agua = 0;
		String marca ="";
		String modelo="";

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("======================================");
			System.out.println("          MENU DE SIMULACAO           ");
			System.out.println("======================================");
			System.out.println("                                      ");
			System.out.println("1 - Configurar a maquina de lavar"     );
			System.out.println("2 - Simular a maquina de lavar"        );
			System.out.println("0 - Sair"                              );
			System.out.println("Digite o codigo:"                      );
			entrada = teclado.nextInt();

			switch (entrada) {
			case 1: {
				System.out.println("======================================");
				System.out.println("  CONFIGURACAÉO DA MAQUINA DE LAVAR");
				System.out.println("======================================");
				System.out.println("                                      ");
				System.out.println("Digite a Marca da Maquina:");
				marca = teclado.nextLine();
				marca = teclado.nextLine();
				System.out.println("Digite o modelo da Maquina");
				modelo = teclado.nextLine();
				System.out.println("Escolha o Modelo da Maquina: 5kg, 7kg, 10kg ou 15kg");
				peso = teclado.nextInt();
				System.out.println("Voltagem: 220v ou 110v: ");
				voltagem = teclado.nextInt();
				if (peso == 5 || peso == 7 || peso == 10 ||peso == 15) {
				}
				
				System.out.println("=======================================");
				System.out.println("Duracao do Est·gio 1 - Lavacao Pesada: ");
				estagio1 = teclado.nextInt();
				tempo1 = (estagio1*1000)/5;
				System.out.println("Duracao do Estagio 2 - Lavacao Normal: ");
				estagio2 = teclado.nextInt();
				tempo2 = (estagio2*1000)/5;
				System.out.println("Duracao do Estagio 3 - Lavacao Rapida: ");
				estagio3 = teclado.nextInt();
				tempo3 = (estagio3*1000)/5;
				System.out.println("Duracao do Estagio 4 - Enxague: ");
				estagio4 = teclado.nextInt();
				tempo4 = (estagio4*1000)/5;
				System.out.println("Duracao do Estagio 5 - Centrifugacao: ");
				estagio5 = teclado.nextInt();
				tempo5 = (estagio5*1000)/5;
				break;
			}
			case 2: {
				if (peso == 5 || peso == 7 || peso == 10 || peso == 15) {
					if (voltagem == 110 || voltagem == 220) {
					System.out.println("======================================");
					System.out.println("  SIMULACAO DA MAQUINA DE LAVAR");
					System.out.println("======================================");
					System.out.println("======================================");
					System.out.println("Simulando o Modelo: "+ modelo + " de " + peso + " kg " + " da marca: " + marca +   " - Voltagem: " + voltagem + "v");
					System.out.println("======================================");
					System.out.println("======================================");
					System.out.println("  QUAL ESTAGIO VOCE DESEJA COMECAR?");
					System.out.println("======================================");
					System.out.println("1 - Lavacao Pesada");
					System.out.println("2 - Lavacao Normal");
					System.out.println("3 - Lavacao Leve"  );
					System.out.println("4 - Enxague"       );
					System.out.println("5 - Centrifugacao" );
					System.out.println("Selecione o estagio inicial:");
					int estagio = teclado.nextInt();
					switch (estagio) {

					case 1: {
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com agua: " + agua + "%");							
							Thread.sleep(1000);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavPesada = lavPesada + 20;
							System.out.println("Estagio 1 - No estagio Pesado: " + lavPesada + "%");														
							Thread.sleep(tempo1);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavNormal = lavNormal + 20;
							System.out.println("Estagio 2 - No estagio Normal: " + lavNormal + "%");							
							Thread.sleep(tempo2);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavRapida = lavRapida + 20;
							System.out.println("Estagio 3 - No estagio Leve: " + lavRapida + "%");							
							Thread.sleep(tempo3);

						}
						System.out.println("======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - No Enxague " + lavEnxague + "%");							
							Thread.sleep(tempo4);

						}
						System.out.println("=====================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavCentrifuga = lavCentrifuga + 20;
							System.out.println("Estagio 5 - Na Centrifugacao: " + lavCentrifuga + "%");							
							Thread.sleep(tempo5);
						}
						System.out.println("==================================");
						System.out.println("==================================");
						System.out.println("        SimulaÁao Finalizada"      );
						System.out.println("==================================");
						System.out.println("==================================");
						 	lavPesada = 0;
						    lavNormal = 0;
						    lavRapida = 0;
						    lavEnxague = 0;
						    lavCentrifuga = 0;
						    agua = 0;
						break;
					}
					case 2: {
						lavNormal = 0;
						lavRapida = 0;
						lavEnxague = 0;
						lavCentrifuga = 0;
						agua = 0;
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com agua: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavNormal = lavNormal + 20;
							System.out.println("Estagio 2 - No estagio Normal: " + lavNormal + "%");
							
							Thread.sleep(tempo2);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavRapida = lavRapida + 20;
							System.out.println("Estagio 3 - No estagio Leve: " + lavRapida + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - No Enxague " + lavEnxague + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavCentrifuga = lavCentrifuga + 20;
							System.out.println("Estagio 5 - Na Centrifugacao: " + lavCentrifuga + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("==================================");
						System.out.println("==================================");
						System.out.println("Simulacao Finalizada");
						System.out.println("==================================");
						System.out.println("==================================");
							
						    lavNormal = 0;
						    lavRapida = 0;
						    lavEnxague = 0;
						    lavCentrifuga = 0;
						    agua = 0;
						break;
					}
					case 3: {
						lavRapida = 0;
						lavEnxague = 0;
						lavCentrifuga = 0;
						agua = 0;
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com agua: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavRapida = lavRapida + 20;
							System.out.println("Estagio 3 - No estagio Leve: " + lavRapida + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - No Enxague " + lavEnxague + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavCentrifuga = lavCentrifuga + 20;
							System.out.println("Estagio 5 - Na Centrifugacao: " + lavCentrifuga + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("==================================");
						System.out.println("==================================");
						System.out.println("Simulacao Finalizada");
						System.out.println("==================================");
						System.out.println("==================================");
						 	
						    lavRapida = 0;
						    lavEnxague = 0;
						    lavCentrifuga = 0;
						    agua = 0;
						break;
					}
					case 4: {
						lavEnxague = 0;
						lavCentrifuga = 0;
						agua = 0;
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com aÅgua: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavEnxague = lavEnxague + 20;
							System.out.println("Estagio 4 - No Enxague " + lavEnxague + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavCentrifuga = lavCentrifuga + 20;
							System.out.println("Estagio 5 - Na Centrifugacao: " + lavCentrifuga + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("==================================");
						System.out.println("==================================");
						System.out.println("Simulacao Finalizada");
						System.out.println("==================================");
						System.out.println("==================================");
						 	
						    lavEnxague = 0;
						    lavCentrifuga = 0;
						    agua = 0;
						break;
					}
					case 5: {						
						lavCentrifuga = 0;						
						System.out.println("=======================================");
						for (int entrada1 = 0; entrada1 < 5; entrada1++) {
							lavCentrifuga = lavCentrifuga + 20;
							System.out.println("Estagio 5 - Na Centrifugacao: " + lavCentrifuga + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("======================================");
						System.out.println("======================================");
						System.out.println("SimulaÁ„o Finalizada");
						System.out.println("======================================");
						System.out.println("======================================");
																   
					    lavCentrifuga = 0;
					    agua = 0;
					    break;
					}
						
					}
					}
					break;
					} else {
						System.out.println("======================================");
						System.out.println("======================================");
						System.out.println("!!!!Escolha Maquina do catalago!!!!");
						System.out.println("======================================");
						System.out.println("======================================");
					
					
					
					
			} 
		}				
	}		
		} while (entrada != 0);
		System.out.println("==================================");
		System.out.println("==================================");
		System.out.println("      Programa Finalizado!"        );
		System.out.println("==================================");
		System.out.println("==================================");
	}


	}


