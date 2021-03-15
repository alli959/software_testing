package junit5Demo.moneyTest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import junit5Demo.Money;

public class MoneyTest {

  @Test
  public void testEquals() {
    Money m12 = new Money(12);
    Money m14 = new Money(14);
    Money equalMoney = new Money(12);
    System.out.println("junit5Demo.moneyTest.MoneyTest.testEquals()");
    assertTrue(m12.equals(m12));
    assertTrue(m12.equals(equalMoney));
    assertFalse(m12.equals(m14));
  }

  @Test
  public void testAdd() {
    Money m12 = new Money(12);
    Money m14 = new Money(14);
    Money expected = new Money(26);
    System.out.println("junit5Demo.moneyTest.MoneyTest.testAdd()");
    assertEquals(expected, m12.add(m14));
  }
}