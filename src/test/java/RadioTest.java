import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void MoreThanTheMaximumRadioStationNumberTest(){
        radio.setCurrentRadioStationNumber(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void nextStationOverMaxTest() {
        radio.setCurrentRadioStationNumber(9);
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationTest() {
        radio.setCurrentRadioStationNumber(7);
        int expected = 8;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationTest() {
        radio.setCurrentRadioStationNumber(5);
        int expected = 4;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationLessMinTest() {
        radio.setCurrentRadioStationNumber(0);
        int expected = 9;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeTest() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeTest(){
        radio.setCurrentVolume(6);
        int expected = 7;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMaxTest() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeMinTest(){
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTest() {
        radio.setCurrentVolume(47);
        int expected = 46;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}

