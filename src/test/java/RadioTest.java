import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void MoreThanTheMaximumRadioStationNumberTest(){
        radio.setRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void nextStationOverMaxTest() {
        radio.setRadioStationNumber(9);
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationTest() {
        radio.setRadioStationNumber(7);
        int expected = 8;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationTest() {
        radio.setRadioStationNumber(5);
        int expected = 4;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationLessMinTest() {
        radio.setRadioStationNumber(0);
        int expected = 9;
        int actual = radio.prevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeTest(){
        radio.setCurrentVolume(14);
        int expected = 10;
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
    public void increaseVolumeMaxTest(){
        radio.setCurrentVolume(10);
        int expected = 10;
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
    public void decreaseVolumeTest(){
        radio.setCurrentVolume(4);
        int expected = 3;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}

