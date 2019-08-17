package com.lendup;

public class Balloon {
  private String balloonColor;
  private String material;
  private String number;

  public Balloon(String balloonColor, String material, String number) {
    this.balloonColor = balloonColor;
    this.material = material;
    this.number = number;
  }

  public String getBalloonColor() {
    return balloonColor;
  }

  public void setBalloonColor(String balloonColor) {
    this.balloonColor = balloonColor;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
