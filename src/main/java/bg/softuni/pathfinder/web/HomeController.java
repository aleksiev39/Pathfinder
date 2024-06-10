package bg.softuni.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class HomeController {

    // Controller handling the info pages - home, about ,contact

    @GetMapping("/")
    public String index(Model model) {
        double SofiaTemp = new Random().nextDouble();

        model.addAttribute("sofiaTemperature",SofiaTemp);

        return "index";
    }

}
