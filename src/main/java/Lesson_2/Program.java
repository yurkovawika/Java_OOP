package Lesson_2;


public class Program {
    public static void main(String[] args) {
        Pupil pup = new Pupil();
        MiddleSchool stud = new MiddleSchool();
        HighSchool high = new HighSchool();

        Student[] studs = new Student[] {pup, stud, high};

        for (Student s : studs){
            Methods(s);
            System.out.println("--------------------------------------");
        }
    }

    public static void Methods(Student s){
        System.out.println(s.Study());


        if (s instanceof Pupil){
            Pupil pupil = (Pupil)s;

            System.out.println(pupil.ExtendedDay());
            System.out.println(pupil.Play());
        }

        if (s instanceof HighSchool){
            HighSchool highSchool = (HighSchool)s;

            System.out.println(highSchool.Exam());
            System.out.println(highSchool.SmokeCancel());
        }

        if (s instanceof MiddleSchool){
            MiddleSchool middleSchool = (MiddleSchool)s;

            System.out.println(middleSchool.StartSmoking());
            System.out.println(middleSchool.Play());
        }
    }
}
