package labs_task.lab6;

// Interface Camera
interface Camera {
    void takePhoto();
    void recordVideo();
}

// Interface MusicPlayer
interface MusicPlayer {
    void playMusic();
    void shuffleMusic();
    void stopMusic();
}

// Smartphone implements both interfaces
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo using Smartphone camera");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video using Smartphone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music using Smartphone music player");
    }

    @Override
    public void shuffleMusic() {
        System.out.println("Shuffling music using Smartphone music player");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music using Smartphone music player");
    }
}

// Main class
public class SmartphoneDriver {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.recordVideo();
        phone.playMusic();
        phone.shuffleMusic();
        phone.stopMusic();
    }
}