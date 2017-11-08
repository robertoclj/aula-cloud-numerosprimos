package uni7.cloud.numerosprimos.engine;

/**
 * Created by robertoclj on 08/11/2017.
 */
public class NumeroPrimoFinderThread implements Runnable {

    public static boolean primo(int x) {

        int n, cont;
        n = x;
        cont = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                cont = cont + 1;
        }
        if (cont == 2) {
            return true;
        } else {
            return false;
        }


    }

    public void procuraMaior(int x) {

        x = x + 1;

        if (primo(x)) {
            MaiorNumeroPrimo.maior = x;
            System.out.println(x);
        } else {
            procuraMaior(x);
        }
    }

    public void run() {
        while(true) {
            int x = MaiorNumeroPrimo.maior;
            procuraMaior(x);

            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
