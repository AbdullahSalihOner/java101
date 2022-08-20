public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name, int classes,String stuNo,Course c1, Course c2, Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        calcAverage();
    }

    public void addAllExamNote(int c1, int c1_orlExm , int c2,  int c2_orlExm , int c3,int c3_orlExm){

        if (c1 >= 0 && c1<= 100){
            this.c1.note = ((c1*0.80)+(c1_orlExm*0.20));
        }
        if (c2 >= 0 && c2<= 100){
            this.c2.note = ((c2*0.70)+(c2_orlExm*0.30));
        }
        if (c3 >= 0 && c3<= 100){
            this.c3.note = ((c3*0.90)+(c3_orlExm*0.10));
        }
    }

    public  void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0){
            System.out.println("Notes not fully entered");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " +this.average);
            if (this.isPass){
                System.out.println("PASSED");
            }else {
                System.out.println("FAILED");
            }
        }
    }

    public void calcAverage(){
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3 ;
    }

    public  boolean isCheckPass(){
        calcAverage();
        return this.average>55;
    }

    public  void  printNote(){
        System.out.println("---------*********---------");
        System.out.println("Student : " + this.name);
        System.out.println("c1 note : " + this.c1.note);
        System.out.println("c2 note : " + this.c2.note);
        System.out.println("c3 note : " + this.c3.note);
    }
}
