package com.codementor.ccdschoolretreat.nback;

import java.io.IOException;
import java.util.function.Consumer;

class UI {
  private final Runnable startEvent;
  private final Consumer<Wiederholung> antwortEvent;
  private Config config;

  public UI(Runnable startEvent, Consumer<Wiederholung> antwortEvent) {
    this.startEvent = startEvent;
    this.antwortEvent = antwortEvent;
  }

  public void config(Config config) {
    this.config = config;
    configAusgeben();
    aufStartWarten();
    startEvent.run();
  }

  private void configAusgeben() {
    System.out.println("Testparameter");
    System.out.println("Proband: " + config.proband);
    System.out.println("N: " + config.n);
    System.out.println("Reizdauer: " + config.reizdauer);
    System.out.println("Anzahl Reize: " + config.anzahlReize);
  }

  private void aufStartWarten() {
    System.out.println("Zum Starten Enter drücken.");
    try {
      System.in.read();
    } catch (IOException e) {
    }
  }

  public void reiz(Reiz reiz) {
    reizAusgeben(reiz);
    Wiederholung wdh = aufBeurteilungWarten();
    antwortEvent.accept(wdh);
  }

  private void reizAusgeben(Reiz reiz) {
    System.out.println(String.format("Reiz %d/%d   %s", reiz.index, config.anzahlReize, reiz.zeichen));
  }

  private Wiederholung aufBeurteilungWarten() {

    return Wiederholung.Neu;
  }
}
