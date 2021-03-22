package TrafficLightHandcraftedMock;

import java.util.*;
import static org.junit.Assert.*;

public class TrafficLightObserverMock implements Observer {
  private List expectedColors = new ArrayList();
  private List observedColors = new ArrayList();

  public void addExpectedColor(String color) {
    expectedColors.add(color);
  }

  public void update(Observable o, Object arg) {
    observedColors.add(arg);
  }

  public void verify() {
   assertEquals(expectedColors, observedColors);
  }
}
