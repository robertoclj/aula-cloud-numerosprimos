package uni7.cloud.numerosprimos.controller.processador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import uni7.cloud.numerosprimos.controller.maior.MaiorNumeroPrimo;
import uni7.cloud.numerosprimos.engine.MaiorNumeroPrimoControlador;

/**
 * Created by robertoclj on 08/11/2017.
 */
@Controller
public class NumeroPrimoController {

    @GetMapping(value = "/home")
    public ModelAndView list(){

        ModelAndView mv = new ModelAndView("home/home");
        mv.addObject("maior", MaiorNumeroPrimoControlador.getMaiorEncontrado());

        return mv;
    }

}
