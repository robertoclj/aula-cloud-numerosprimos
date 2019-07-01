package uni7.cloud.numerosprimos.engine;

import uni7.cloud.numerosprimos.controller.maior.MaiorNumeroPrimo;

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

        if (primo(x) && x > MaiorNumeroPrimoControlador.getMaiorEncontrado()) {
            MaiorNumeroPrimoControlador.setNovoMaiorPrimo(x);
            System.out.println(x);
        } else {
            procuraMaior(MaiorNumeroPrimoControlador.getProximoTeste());
        }
    }

    public void run() {
        while (true) {
            int x = MaiorNumeroPrimoControlador.getProximoTeste();
            procuraMaior(x);

            try {
                if (x > 300000 && x <= 305000) {
                    Thread.sleep(5000L);
                }
                if (x > 450000 && x <= 455000) {
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
