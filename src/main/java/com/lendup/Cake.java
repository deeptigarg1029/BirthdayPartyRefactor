package com.lendup;

public class Cake {
  private String flavor;
  private String frostingFlavor;
  private String shape;
  private String size;
  private String cakeColor;

  public Cake(String flavor, String frostingFlavor, String shape, String size, String cakeColor) {
    this.flavor = flavor;
    this.frostingFlavor = frostingFlavor;
    this.shape = shape;
    this.size = size;
    this.cakeColor = cakeColor;
  }

  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public String getFrostingFlavor() {
    return frostingFlavor;
  }

  public void setFrostingFlavor(String frostingFlavor) {
    this.frostingFlavor = frostingFlavor;
  }

  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getCakeColor() {
    return cakeColor;
  }

  public void setCakeColor(String cakeColor) {
    this.cakeColor = cakeColor;
  }
}
