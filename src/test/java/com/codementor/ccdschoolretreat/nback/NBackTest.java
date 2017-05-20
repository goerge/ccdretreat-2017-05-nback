package com.codementor.ccdschoolretreat.nback;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.jupiter.api.Test;

class NBackTest {
  @Test
  void timer() {
    new Timer().schedule(new TimerTask() {
      @Override
      public void run() {
        System.out.println("timer run out");
      }
    }, 100);
  }
}
