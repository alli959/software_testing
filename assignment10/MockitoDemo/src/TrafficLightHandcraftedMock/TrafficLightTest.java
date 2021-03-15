package TrafficLightHandcraftedMock;

import org.junit.Test;

public class TrafficLightTest {
	@Test
	public void testTrigger() {
    TrafficLightObserverMock trafficLightObserverMock = new TrafficLightObserverMock();

    TrafficLightModel trafficLight = new TrafficLightModel();
    trafficLight.addObserver(trafficLightObserverMock);

    trafficLight.trigger();
    trafficLight.trigger();
    trafficLight.trigger();

    trafficLightObserverMock.addExpectedColor("red");
    trafficLightObserverMock.addExpectedColor("yellow");
    trafficLightObserverMock.addExpectedColor("green");
    trafficLightObserverMock.verify();
  }
}
