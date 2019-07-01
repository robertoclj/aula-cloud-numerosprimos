package uni7.cloud.numerosprimos.controller.maior;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by robertoclj on 08/11/2017.
 */
@RestController
public class MaiorNumeroPrimoController {

    @GetMapping(value = "/proximoteste")
    public ResponseEntity<Integer> proximoTeste() {
        return new ResponseEntity<Integer>(MaiorNumeroPrimo.getProximoTeste(), HttpStatus.OK);
    }

    @GetMapping(value = "/maior")
    public ResponseEntity<Integer> maior() {
        return new ResponseEntity<Integer>(MaiorNumeroPrimo.getMaiorEncontrado(), HttpStatus.OK);
    }

    @GetMapping(value = "/novomaior")
    public ResponseEntity<Boolean> novoMaior(@RequestParam("maior") Integer maior) {
        MaiorNumeroPrimo.setNovoMaiorPrimo(maior);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

}
