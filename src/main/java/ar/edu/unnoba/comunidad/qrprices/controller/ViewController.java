package ar.edu.unnoba.comunidad.qrprices.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewController {


    @GetMapping("/view")
    public String viewProduct(Model model) {

        return "view";
    }
}
