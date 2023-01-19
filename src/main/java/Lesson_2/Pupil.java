package Lesson_2;

public class Pupil extends Student {

    @Override
    public String Play() {
        String play = super.Play();
        return play + " toys";
    }

    @Override
    public String Study() {
        return "I love school";
    }

    public String ExtendedDay(){
        return "I've signed to extended day group!";
    }
}
