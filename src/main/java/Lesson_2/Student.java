package Lesson_2;

public abstract class Student {
    protected String nameStudent;
    protected String GPA;
    protected String nameClass;
    public Student() {
    }

    public String Play(){
        return "Play";
    }

    public String Study(){
        return "Study";
    }
}
