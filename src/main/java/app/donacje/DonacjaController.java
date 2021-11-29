package app.donacje;


import app.dawca.Dawca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DonacjaController {
    @Autowired private DonacjaService donacjaService;

    @GetMapping("/donacje")
    public String pokazListeDonacji(Model model){
        List<Donacja> listaDonacji = donacjaService.listAll();
        model.addAttribute("listaDonacji", listaDonacji);
        return "donacje";
    }

    @GetMapping("zaloz/donacje")
     public String zalozDonacje(Model model){
        model.addAttribute("donacja", new Donacja());
        return "formularz_donacji";
    }

    @PostMapping("/donacja/zapisz")
    public String zapiszDonacje(Donacja donacja){
        donacjaService.save(donacja);
        return "redirect:/donacje";
    }

}
