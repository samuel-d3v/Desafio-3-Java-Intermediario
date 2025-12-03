package service;

import model.Category;
import model.Ninja;
import repository.NinjaRepository;

import java.util.List;

import static model.Category.*;

public class NinjaService {
    NinjaRepository repository;

    public NinjaService(NinjaRepository repository){
        this.repository = repository;
    }

    public List<Ninja> classifyMission(String choice){
        Category classification = switch(choice.toUpperCase()){
            case "D", "C" -> GENIN;
            case "B" -> CHUNIN;
            case "A", "S" -> JONIN;
            default -> null;
        };

        if (classification == null) {
            return List.of();
        }

        return repository.filterNinjasForCategory(classification);
    }
}
