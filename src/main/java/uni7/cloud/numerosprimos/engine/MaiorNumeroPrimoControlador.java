package uni7.cloud.numerosprimos.engine;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by robertoclj on 08/11/2017.
 */
public class MaiorNumeroPrimoControlador {

    private static final String host = "http://127.0.0.1:8080/numerosprimos";

    public synchronized static Integer getProximoTeste() {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();

        // Request
        RestTemplate restTemplate = new RestTemplate();
        String fullUrl = host + "/proximoteste";

        Integer maiorTeste = restTemplate.getForObject(fullUrl, Integer.class);
        return maiorTeste;
    }

    public static Integer getMaiorEncontrado() {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();

        // Request
        RestTemplate restTemplate = new RestTemplate();
        String fullUrl = host + "/maior";

        Integer maiorEncontrado = restTemplate.getForObject(fullUrl, Integer.class);
        return maiorEncontrado;
    }

    public static void setNovoMaiorPrimo(Integer primo) {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();

        // Request
        RestTemplate restTemplate = new RestTemplate();
        String fullUrl = host + "/novomaior?maior=" + primo;

        Boolean maiorEncontrado = restTemplate.getForObject(fullUrl, Boolean.class);
    }

}
