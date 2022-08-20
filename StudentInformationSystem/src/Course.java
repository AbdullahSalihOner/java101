public class Course {
    Teacher lectureTeacher;
    String name;
    String code;
    String prefix;
    double note;
    int oralExamNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0 ;
        this.oralExamNote = 0;
    }

    public void addTeacher(Teacher t){

        if (this.prefix.equals(t.branch)){
            this.lectureTeacher = t ;
            System.out.println(" Operation Successful ");
        }else{
            System.out.println("Teacher " +t.name + " cannot teach this lesson");
        }

    }


    public void printTeacher() {
        if (lectureTeacher != null) {
            System.out.println(lectureTeacher.name + " is Teacher of " + this.name + " lecture");
        }else{
            System.out.println( " No Teacher assigned to course " + this.name);
        }
    }


}
