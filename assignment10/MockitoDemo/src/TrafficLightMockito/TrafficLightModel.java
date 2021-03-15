package TrafficLightMockito;
import java.util.Observable;

public class TrafficLightModel extends Observable {
    private String color;

    public TrafficLightModel() {
        color = "red";
    }

    public void trigger() {
        // TODO: Implement red->yellow->green sequence
        setChanged();
        notifyObservers(color);
    }
}
