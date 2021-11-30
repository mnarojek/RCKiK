package app.dawca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DawcaService {
    @Autowired private DawcaRepository repo;

    public List<Dawca> listAll(){
        return (List<Dawca>) repo.findAll();
    }

    public void save(Dawca dawca) {
        repo.save(dawca);
    }
}
