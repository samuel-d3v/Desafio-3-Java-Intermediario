package repository;

public class NinjaService {

    public String rateMission(int choice){
        if(choice<1 || choice>6) {
            return "Opção invalida.";
        }

        String classificacao = "";

        switch (choice){
            case 1:
                classificacao = "D";
                break;
            case 2:
                classificacao = "C";
                break;
            case 3:
                classificacao = "B";
                break;
            case 4:
                classificacao = "A";
                break;
            case 5:
                classificacao = "S";
                break;
        }
        return classificacao;
    }


}
