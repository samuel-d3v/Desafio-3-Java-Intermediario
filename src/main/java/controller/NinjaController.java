package controller;

import repository.NinjaRepository;
import service.NinjaService;

import java.util.Scanner;

public class NinjaController {
    NinjaService service = new NinjaService(new NinjaRepository());
    Scanner scanner = new Scanner(System.in);

    public void initial(){

        while (true) {
            String choiceCategory = readMissionCategory();

            if(choiceCategory.equalsIgnoreCase("A") || choiceCategory.equalsIgnoreCase("B") || choiceCategory.equalsIgnoreCase("C") || choiceCategory.equalsIgnoreCase("D") || choiceCategory.equalsIgnoreCase("S")) {
                service.classifyMission(choiceCategory).stream().map(ninja -> ninja.showInformation()).forEach(System.out::println);
            } else if (choiceCategory.equals("0")) {
                System.out.println("Saindo..");
                break;
            } else {
                System.out.println("Opcao invalida.");
                break;
            }
            String choiceMoreInfo = readMoreInfo();

            while (!choiceMoreInfo.equals("1") && !choiceMoreInfo.equals("2")) {
                System.out.println("\nOpcao nao encontrada, voce vai ser redirecionado para tentar novamente..");
                System.out.println("-----------------------------------------------------------------------\n");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                choiceMoreInfo = readMoreInfo();
            }

            if(choiceMoreInfo.equals("2")) {
                System.out.println("\nObrigado! Ate breve..");
                System.out.println("-----------------------------------------------------------------------\n");
                break;
            }
        }

        scanner.close();
    }

    public String readMissionCategory(){
        System.out.print("Categoria das missoes:" +
                "\nD - Missoes simples e de baixo risco, como cuidar de criancas ou pintar cercas, pagando de $5.000 a $50.000 ryo." +
                "\nC - Missoes de combate de baixa intensidade, como proteger pessoas de bandidos ou realizar investigacoes. O pagamento varia entre $30.000 e $100.000 ryo." +
                "\nB - Missoes que envolvem combate com outros ninjas, como espionagem ou protecao de alvos importantes. A recompensa eh de $80.000 a $200.000 ryo." +
                "\nA - Missoes de alto risco que lidam com assuntos de nivel vila ou estado. O pagamento varia de $150.000 a $1.000.000 ryo." +
                "\nS - As missoes mais perigosas, geralmente envolvendo assuntos confidenciais e de nivel estadual, como assassinato de figuras importantes ou transporte de documentos ultra-secretos. A recompensa eh de pelo menos $1.000.000 ryo e so sao confiadas a jonin experientes." +
                "\n0 - Sair sem contratar missao." +
                "\n" +
                "Escolha uma categoria de acordo com a descricao das missoes: ");
        String choice = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        return choice;
    }

    public String readMoreInfo() {
        System.out.print("\nDeseja ver mais informacoes dos ninjas de acordo com a categoria das missoes?" +
                "\n1 - Sim" +
                "\n2 - Nao" +
                "\n" +
                "Escolha o numero de acordo com a opcao desejada: ");
        String choice = scanner.nextLine();
        System.out.println("--------------------------------------------------");

        return choice;
    }
}
