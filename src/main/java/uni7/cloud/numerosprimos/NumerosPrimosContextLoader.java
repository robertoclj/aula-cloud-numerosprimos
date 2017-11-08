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
        t.start();

    }

}
