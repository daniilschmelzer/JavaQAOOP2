import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Radio {
    private int numCurrentStation;
    private int currentVolume;
    private final int stationsCount;

    public Radio() {
        this.stationsCount = 10;
    }

    public void nextNumStation() {
        if (numCurrentStation < stationsCount - 1) {
            numCurrentStation = numCurrentStation + 1;
        }
        if (numCurrentStation == stationsCount - 1) {
            numCurrentStation = 0;
        }
    }

    public void prevNumStation() {
        if (numCurrentStation > 0) {
            numCurrentStation = numCurrentStation - 1;
        }
        if (numCurrentStation == 0) {
            numCurrentStation = stationsCount - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setNumStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > stationsCount - 1) {
            return;
        }
        numCurrentStation = newCurrentStation;
    }
}
