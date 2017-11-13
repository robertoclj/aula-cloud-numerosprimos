package uni7.cloud.numerosprimos.engine;

/**
 * Created by robertoclj on 08/11/2017.
 */
public class MaiorNumeroPrimo {

    public static Integer maior = 2;

    private static Integer maiorTeste = 2;

    public synchronized static Integer getMaiorTeste() {
        maiorTeste = maiorTeste + 1;
        return maiorTeste;
    }

}
