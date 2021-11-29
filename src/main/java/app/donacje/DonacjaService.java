package app.donacje;

import app.dawca.Dawca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonacjaService {

    @Autowired private DonacjaRepository donacjaRepositoryepo;

    public List<Donacja> listAll(){
        return (List<Donacja>) donacjaRepositoryepo.findAll();
    }

    public void save(Donacja donacja) {
        donacjaRepositoryepo.save(donacja);
    }
}
