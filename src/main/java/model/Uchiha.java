package model;

public class Uchiha extends Ninja{
    private String specialAbility = "Sharingan";

    public Uchiha(Long id, String name, int age, String village, Category category, String mission, DifficultyLevel difficultyLevel, String missionStatus) {
        super(id, name, age, village, category, mission, difficultyLevel, missionStatus);
    }

    public String showSpecialAbility(){
        return specialAbility;
    }
    @Override
    public String showInformation(){
        return String.format("\n######################################" +
                "\n######## INFORMACOES DO NINJA ########" +
                "\n# Nome do ninja: %s" +
                "\n# Idade: %d" +
                "\n# Habilidade Especial: %s\n" +
                "\n######## INFORMACOES DA MISSAO #######" +
                "\n# Missao: %s" +
                "\n# Nivel da missao: %s" +
                "\n# Status da missao: %s" +
                "\n######################################", getName(), getAge(), specialAbility,getMission(), getDifficultyLevel(), getMissionStatus());
    }
}