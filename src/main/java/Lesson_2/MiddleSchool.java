package Lesson_2;

public class MiddleSchool extends Student{
    @Override
    public String Play() {
        String play = super.Play();

        return play + " minecraft";
    }

    @Override
    public String Study() {
        return "I hate school";
    }

    public String StartSmoking(){
        return "I started smoking";
    }
}
