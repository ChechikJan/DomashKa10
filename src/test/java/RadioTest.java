import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(15);
    @Test
    public void MoreThanTheMaximumRadioStationNumberTest(){
        radio.setCurrentRadioStationNumber(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void nextStationOverMaxTest() {
        radio.setCurrentRadioStationNumber(14);
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationTest() {
        radio.setCurrentRadioStationNumber(11);
        int expected = 12;
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
        int expected = 14;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeTest() {
        radio.setCurrentVolume(55);
        int expected = 55;
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

