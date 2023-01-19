package Lesson_2;

public class HighSchool extends Student{

    public static String SmokeCancel(){
        return "I canceled smoking";
    }

    @Override
    public String Study() {
        return "I got to study";
    }

    public String Exam(){
        return "I've signed to exam";
    }
}
