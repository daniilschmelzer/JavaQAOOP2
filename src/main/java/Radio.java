public class Radio {
    public int numCurrentStation;
    public int currentVolume;

    public void nextNumStation() {
        if (numCurrentStation < 9) {
            numCurrentStation = numCurrentStation + 1;
        }
        if (numCurrentStation == 9) {
            numCurrentStation = 0;
        }
    }

    public void prevNumStation() {
        if (numCurrentStation > 0) {
            numCurrentStation = numCurrentStation - 1;
        }
        if (numCurrentStation == 0) {
            numCurrentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
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
        if (newCurrentStation > 9) {
            return;
        }
        numCurrentStation = newCurrentStation;

    }
}
