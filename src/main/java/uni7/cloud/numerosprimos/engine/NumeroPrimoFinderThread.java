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

        if (primo(x) && x > MaiorNumeroPrimo.maior) {
            MaiorNumeroPrimo.maior = x;
            System.out.println(x);
        } else {
            procuraMaior(MaiorNumeroPrimo.getMaiorTeste());
        }
    }

    public void run() {
        while(true) {
            int x = MaiorNumeroPrimo.getMaiorTeste();
            procuraMaior(x);

            try {
                if (x > 150000 && x <= 155000) {
                    Thread.sleep(5000L);
                } if (x > 300000 && x <= 305000) {
                    Thread.sleep(5000L);
                } if (x > 450000 && x <= 455000) {
                    Thread.sleep(5000L);
                } else {
                    Thread.sleep(50L);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
