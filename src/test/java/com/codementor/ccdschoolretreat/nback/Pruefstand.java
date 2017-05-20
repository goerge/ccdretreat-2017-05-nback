package com.codementor.ccdschoolretreat.nback;

public class Pruefstand {

  public static void main(String[] args) {
    final Config config = new Config("Peter", 3, 2000, 10);

    final UI ui = new UI(
      () -> System.err.println("Test wurde gestartet."),
      wdh -> System.err.println("Antwort lautet: " + wdh));

    ui.config(config);
    ui.reiz(new Reiz("A", 1));
  }
}
