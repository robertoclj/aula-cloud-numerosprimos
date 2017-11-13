package uni7.cloud.numerosprimos;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import uni7.cloud.numerosprimos.engine.NumeroPrimoFinderThread;

/**
 * Copyright (C) E-NOVAR SOLUCOES TECNOLOGICAS - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by robertoclj on 14/09/16.
 */
@Component
public class NumerosPrimosContextLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {

        NumeroPrimoFinderThread n = new NumeroPrimoFinderThread();
        Thread t = new Thread(n);
        Thread t2 = new Thread(n);
        Thread t3 = new Thread(n);
        Thread t4 = new Thread(n);
        Thread t5 = new Thread(n);
        Thread t6 = new Thread(n);
        Thread t7 = new Thread(n);
        Thread t8 = new Thread(n);
        Thread t9 = new Thread(n);
        Thread t10 = new Thread(n);

        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }

}
