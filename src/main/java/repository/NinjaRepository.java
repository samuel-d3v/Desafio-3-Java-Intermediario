package repository;

import model.Category;
import model.Ninja;
import model.Uchiha;

import java.util.*;

import static model.Category.*;
import static model.DifficultyLevel.*;

public class NinjaRepository {
    public final Map<Category, Ninja> ninjasForCategory = new HashMap<>();

    // Lista dos ninjas
    public List<Ninja> listNinjas(){
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja(1L, "Might Guy", 29, "Konohagakure", JONIN, "Resgate do Kazekage", S, "Sucesso"));
        ninjas.add(new Ninja(2L, "Kakashi Hatake", 27, "Konohagakure", JONIN, "Protecao de Tazuna", A, "Sucesso"));
        ninjas.add(new Ninja(3L, "Naruto Uzumaki", 12, "Konohagakure", GENIN, "Protecao de Tazuna", C, "Sucesso"));
        ninjas.add(new Uchiha(4L, "Sasuke Uchiha",12, "Konohagakure", GENIN, "Protecao de Tazuna", C, "Sucesso"));
        ninjas.add(new Ninja(5L, "Shikamaru Nara", 13, "Konohagakure", CHUNIN, "Recuperacao de Sasuke", B, "Fracasso"));

        return ninjas;
    }

    // Lista com ninjas filtrados por categoria
    public List<Ninja> filterNinjasForCategory(Category category){

        return listNinjas().stream()
                .filter(n -> n.getCategory() == category)
                .toList();
    }

}
