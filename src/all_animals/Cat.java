package src.all_animals;

public class Cat extends Animals {
    @Override
    public String getVoice() {
        if (state.equals("sleeping")) {
            voice = "";
        } else {
            voice = "Meow!";
        }
        return voice;
    }
}
