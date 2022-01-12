package app.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/add_new_user")
    public String  addNewUserForm(Model model){
        model.addAttribute("user", new User());
        return "addNewUser";
    }
}
