package com.lendup;

public class BirthdayPartyApp {

  public static void main (String[] args) {
    orderBirthdayPartyThings(new Balloon("red", "mylar", "4"),
                             new Cake("chocolate", "chocolate", "circle", "large", "brown"));

    orderBirthdayPartyThings(new Balloon("blue", "latex", "7"),
                             new Cake("Vanilla", "chocolate", "square", "med", "brown"));

    orderBirthdayPartyThings(new Balloon("yellow", "mylar", "4"),
                             new Cake("vanilla", "vanilla", "square", "small", "yellow"));
  }

  private static void orderBirthdayPartyThings(Balloon balloon, Cake cake) {
    BirthdayParty party = new BirthdayParty(balloon, cake);
    party.orderBalloon();
    party.orderCake();
  }
}
