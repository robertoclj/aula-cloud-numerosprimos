package uni7.cloud.numerosprimos.controller.processador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import uni7.cloud.numerosprimos.controller.maior.MaiorNumeroPrimo;
import uni7.cloud.numerosprimos.engine.MaiorNumeroPrimoControlador;
import uni7.cloud.numerosprimos.model.NumeroPrimoEncontrado;
import uni7.cloud.numerosprimos.repository.NumeroPrimoEncontradoRepository;

import java.util.Date;

/**
 * Created by robertoclj on 08/11/2017.
 */
@Controller
public class NumeroPrimoController {

    @Autowired
    private NumeroPrimoEncontradoRepository numeroPrimoEncontradoRepository;

    @GetMapping(value = "/home")
    public ModelAndView list(){

        Integer maior = MaiorNumeroPrimoControlador.getMaiorEncontrado();
        NumeroPrimoEncontrado numeroPrimoEncontrado = new NumeroPrimoEncontrado();
        numeroPrimoEncontrado.setDate(new Date());
        numeroPrimoEncontrado.setNumberFound(new Long(maior));
        numeroPrimoEncontradoRepository.save(numeroPrimoEncontrado);

        ModelAndView mv = new ModelAndView("home/home");
        mv.addObject("maior", maior);

        return mv;
    }

}
