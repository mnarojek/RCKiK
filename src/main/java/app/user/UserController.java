package app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add_new_user")
    public String  addNewUserForm(Model model){
        model.addAttribute("user", new User());
        return "addNewUser";
    }

    @PostMapping("/addUser_process")
    public String addNewUserProcess(User user){
        userRepository.save(user);

        return "add_new_user_success";
    }

}
