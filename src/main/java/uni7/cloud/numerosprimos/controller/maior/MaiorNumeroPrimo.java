package uni7.cloud.numerosprimos.controller.maior;

/**
 * Created by robertoclj on 08/11/2017.
 */
public class MaiorNumeroPrimo {

    private static Integer maior = 2;

    private static Integer maiorTeste = 2;

    protected synchronized static Integer getProximoTeste() {
        maiorTeste = maiorTeste + 1;
        return maiorTeste;
    }

    protected static Integer getMaiorEncontrado() {
        return maior;
    }

    protected static void setNovoMaiorPrimo(Integer primo) {
        if (primo > maior) {
            maior = primo;
        }
    }

}
