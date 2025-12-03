package model;

public class Ninja {
    private final Long id;
    private final String name;
    private int age;
    private Category category;
    private String village;
    private String mission;
    private DifficultyLevel difficultyLevel;
    private String missionStatus;

    public Ninja(Long id, String name, int age, String village, Category category, String mission, DifficultyLevel difficultyLevel, String missionStatus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.village = village;
        this.category = category;
        this.mission = mission;
        this.difficultyLevel = difficultyLevel;
        this.missionStatus = missionStatus;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getMission(){
        return mission;
    }
    public String getMissionStatus(){
        return missionStatus;
    }
    public DifficultyLevel getDifficultyLevel(){
        return difficultyLevel;
    }
    public Category getCategory(){
        return category;
    }
    public String showInformation(){
        return String.format("\n######################################" +
                "\n######## INFORMACOES DO NINJA ########" +
                "\n# Nome do ninja: %s" +
                "\n# Idade: %d\n" +
                "\n######## INFORMACOES DA MISSAO #######" +
                "\n# Missao: %s" +
                "\n# Nivel da missao: %s" +
                "\n# Status da missao: %s" +
                "\n######################################", name, age, mission, difficultyLevel, missionStatus);
    }
}