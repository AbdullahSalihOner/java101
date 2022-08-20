public class Main {
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "MATH101", "MATH");
        Course physic = new Course("Physics", "PHY101", "PHYS");
        Course chemical = new Course("Chemical", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MATH");
        Teacher t2 = new Teacher("Fatma AySe", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHEM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "140144015", math,physic,chemical);
        s1.addAllExamNote(100,100,50,60,90,80);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", 4, "2211133", math,physic,chemical);
        s2.addAllExamNote(50,40,50,60,85,80);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", 4, "221121312", math,physic,chemical);
        s3.addAllExamNote(50,100,50,60,90,75);
        s3.isPass();
    }
}
