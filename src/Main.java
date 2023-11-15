public class Main {
    public static void main(String[] args) {

        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicBand = new ClassicMusic();

        MusicStyles[] musicBands = {popBand, rockBand, classicBand};
        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}
