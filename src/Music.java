// Базовий клас MusicStyles
class MusicStyles {
    void playMusic() {
        System.out.println("Playing music");
    }
}
// Спадкоємець PopMusic
class PopMusic extends MusicStyles {
    @Override
    void playMusic() {
        System.out.println("popBand playing pop music");
    }
}
// Спадкоємець RockMusic
class RockMusic extends MusicStyles {
    @Override
    void playMusic() {
        System.out.println("rockBand playing rock music");
    }
}
// Спадкоємець ClassicMusic
class ClassicMusic extends MusicStyles {
    @Override
    void playMusic() {
        System.out.println("classicBand playing classical music");
    }
}

