package ar.edu.unnoba.comunidad.qrprices.controller;

import ar.edu.unnoba.comunidad.qrprices.model.User;
import ar.edu.unnoba.comunidad.qrprices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        // Validar y guardar el usuario en la base de datos
        userService.createUserWithRole(user, user.getRole());
        return "redirect:/login"; // Redirige al usuario a la página de inicio de sesión después del registro
    }
}



