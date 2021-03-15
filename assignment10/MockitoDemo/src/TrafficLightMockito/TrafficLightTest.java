package TrafficLightMockito;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.ArgumentCaptor;
import java.util.*;

public class TrafficLightTest {
	@Test
	public void testTrigger() {
		Observer trafficLightObserverMock = mock(Observer.class);
		TrafficLightModel trafficLight = new TrafficLightModel();
		trafficLight.addObserver(trafficLightObserverMock);
		
		trafficLight.trigger();
		trafficLight.trigger();
		trafficLight.trigger();
		
		ArgumentCaptor<Object> argumentCaptor = ArgumentCaptor.forClass(Object.class);
		verify(trafficLightObserverMock, times(3)).update(any(Observable.class), argumentCaptor.capture());
		List<Object> capturedSecondArguments = argumentCaptor.getAllValues();
		assertEquals("red", capturedSecondArguments.get(0));
		assertEquals("yellow", capturedSecondArguments.get(1));
		assertEquals("green", capturedSecondArguments.get(2));
	}
}
