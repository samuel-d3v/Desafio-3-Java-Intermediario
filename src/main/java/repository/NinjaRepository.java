package service;

import model.Categoria;
import model.Ninja;
import model.Uchiha;

import java.util.*;
import java.util.stream.Collectors;

import static model.Categoria.*;

public class NinjaRepository {
    public final Map<Categoria, Ninja> ninjasForCategory = new HashMap<>();
    // Lista dos ninjas
    public List<Ninja> listaNinjas(){
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja(1L, "Might Guy", 29, "Konohagakure", JONIN));
        ninjas.add(new Ninja(2L, "Kakashi Hatake", 27, "Konohagakure", JONIN));
        ninjas.add(new Uchiha(3L, "Naruto Uzumaki", 12, "Konohagakure", GENIN));
        ninjas.add(new Ninja(4L, "Sasuke Uchiha",12, "Konohagakure", GENIN));
        ninjas.add(new Ninja(5L, "Gaara ", 13, "Sunagakure", GENIN));
        ninjas.add(new Ninja(6L, "Shikamaru Nara", 12, "Konohagakure", CHUNIN));
        ninjas.add(new Ninja(7L, "Kabuto Yakushi", 20, "Konohagakure", GENIN));
        ninjas.add(new Ninja(8L, "Orochimaru ", 50, "Konohagakure", SANNIN));

        return ninjas;
    }
}
