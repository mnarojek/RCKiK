package app.dawca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DawcaController {

    @Autowired private DawcaService service;

    @GetMapping("/dawcy")
    public String pokazListeDawcow(Model model) {
        List<Dawca> ListaDawcow = service.listAll();
        model.addAttribute("ListaDawcow", ListaDawcow);


        return "dawcy";
    }

    @GetMapping("/dawcy/nowy")
    public String formularzRejestracyjny(Model model) {
        model.addAttribute("dawca", new Dawca());
        return "formularz_rejestracji";
    }

    @PostMapping("/dawcy/zapisz")
    public String zapiszDawcę(Dawca dawca){
        service.save(dawca);

        return "redirect:/dawcy";
    }


}
