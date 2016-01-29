public enum Drink {
  TEA("T", .4f), COFFEE("C", .6f), CHOCOLATE("H", .5f), ORANGE_JUICE("O", .6f);

  private String code;
  private float price;

  Drink(String code, float price) {
    this.code = code;
    this.price = price;
  }

  public String code() {
    return code;
  }

  public float price() {
    return price;
  }
}
