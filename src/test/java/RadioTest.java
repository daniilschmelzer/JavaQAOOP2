import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.setNumCurrentStation(5);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldSetNextNumStation() {
        radio.setNumCurrentStation(6);
        radio.nextNumStation();
        int expected = 7;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldSetPrevNumStation() {
        radio.setNumCurrentStation(5);
        radio.prevNumStation();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume2() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume2() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNumStation() {
        radio.setNumCurrentStation(5);
        radio.setNumStation(7);
        int expected = 7;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldLastToFirstNextStation() {
        radio.setNumCurrentStation(9);
        radio.nextNumStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldFirstToLastPrevStation() {
        radio.setNumCurrentStation(0);
        radio.prevNumStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldValidChoiceStation() {
        radio.setNumCurrentStation(7);
        radio.setNumStation(-1);
        int expected = 7;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldValidChoiceStation2() {
        radio.setNumCurrentStation(8);
        radio.setNumStation(10);
        int expected = 8;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(20);
        radio.setNumStation(17);
        int expected = 17;
        Assertions.assertEquals(expected, radio.getNumCurrentStation());
    }

}
