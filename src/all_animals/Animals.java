package src.all_animals;

public abstract class Animals {
    String voice = "anysound";
    String state = "active";
    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void sleep() {
        this.state = "sleeping";
        this.voice = "";
    }
    public void eat() {
        this.state = "active";
        this.voice = "anysound";
    }
    public void voice() {
        System.out.println(this.getVoice());
    }
}
