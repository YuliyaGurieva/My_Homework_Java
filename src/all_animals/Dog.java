package src.all_animals;

public class Dog extends Animals {
    @Override
    public String getVoice() {
        if (state.equals("sleeping")) {
            voice = "";
        } else {
            voice = "Gav!";
        }
        return voice;
    }
}
