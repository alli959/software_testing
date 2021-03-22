package junit5Demo;

public class Money {
  private int amount;

  public Money(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public Money add(Money m) {
    return new Money(amount + m.getAmount());
  }

  public boolean equals(Object o) {
    if (o instanceof Money) {
      return (amount == ((Money) o).getAmount());
    } else
      return false;
  }

  public String toString() {
    return Integer.toString(amount);
  }
}