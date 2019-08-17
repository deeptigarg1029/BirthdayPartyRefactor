package com.lendup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirthdayPartyTest {
  private BirthdayParty birthdayParty;

  @Before
  public void setUp() {
    Balloon balloon = new Balloon("Red", "Latex", "5");
    Cake cake = new Cake("Chocolate", "Chocolate", "Square", "Big", "Red");
    birthdayParty = new BirthdayParty(balloon, cake);
  }

  @Test
  public void orderBalloonTest() {
    String balloonOrder = birthdayParty.orderBalloon();
    assertEquals(balloonOrder, "Balloons ordered; Red, Latex, 5");
  }

  @Test
  public void orderCakeTest() {
    String cakeOrder = birthdayParty.orderCake();
    assertEquals(cakeOrder, "cake ordered; Chocolate, Chocolate, Square, Big, Red");
  }

}
