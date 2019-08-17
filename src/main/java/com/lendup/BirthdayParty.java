package com.lendup;

public class BirthdayParty {
  private Balloon balloon;
  private Cake cake;

  public BirthdayParty(Balloon balloon, Cake cake) {
    this.balloon = balloon;
    this.cake = cake;
  }

  public String orderBalloon() {
    String balloonOrder = "Balloons ordered; " + balloon.getBalloonColor() + ", " + balloon.getMaterial()  + ", " + balloon.getNumber();
    System.out.println(balloonOrder);
    return balloonOrder;
  }

  public String orderCake() {
    String cakeOrder = "cake ordered; " + cake.getFlavor() + ", " + cake.getFrostingFlavor()  + ", " + cake.getShape() + ", " + cake.getSize() + ", " + cake.getCakeColor();
    System.out.println(cakeOrder);
    return cakeOrder;
  }
}
