import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.numCurrentStation = 5;
        int expected = 5;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldSetNextNumStation() {
        radio.numCurrentStation = 6;
        radio.nextNumStation();
        int expected = 7;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldSetPrevNumStation() {
        radio.numCurrentStation = 5;
        radio.prevNumStation();
        int expected = 4;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.currentVolume = 8;
        radio.increaseVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.currentVolume);
    }

    @Test
    public void shouldIncreaseVolume2() {
        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 10;
        Assertions.assertEquals(expected, radio.currentVolume);
    }

    @Test
    public void shouldReduceVolume() {
        radio.currentVolume = 10;
        radio.reduceVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.currentVolume);
    }

    @Test
    public void shouldReduceVolume2() {
        radio.currentVolume = 0;
        radio.reduceVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.currentVolume);
    }

    @Test
    public void shouldSetNumStation() {
        radio.numCurrentStation = 5;
        radio.setNumStation(7);
        int expected = 7;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldLastToFirstNextStation() {
        radio.numCurrentStation = 9;
        radio.nextNumStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldFirstToLastPrevStation() {
        radio.numCurrentStation = 0;
        radio.prevNumStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldValidChoiceStation() {
        radio.numCurrentStation = 7;
        radio.setNumStation(-1);
        int expected = 7;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldValidChoiceStation2() {
        radio.numCurrentStation = 8;
        radio.setNumStation(10);
        int expected = 8;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(20);
        radio.setNumStation(17);
        int expected = 17;
        Assertions.assertEquals(expected, radio.numCurrentStation);
    }

}
