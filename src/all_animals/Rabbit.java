package src.all_animals;

public class Rabbit extends Animals {
    @Override
    public String getVoice() {
        voice = "";
            System.out.println("Rabbits can't do sounds");
        return voice;
    }
}
