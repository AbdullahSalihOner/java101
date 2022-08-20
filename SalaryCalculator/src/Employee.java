public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int workHours, int hireYear, double salary){
        this.name = name;
        this.workHours = workHours;
        this.hireYear= hireYear;
        this.salary = salary;

    }

    public  double raiseSalary(){
        double raise;
        if (2021 - hireYear < 10){

            //salary = (salary * 105)/100;
            raise = (salary * 5)/100;
            return raise;


        }else if (2021 -hireYear > 9 && 2021 - hireYear < 20){

            //salary = (salary * 110)/100;
            raise = (salary * 10)/100;
            return raise;

        }else if (2021 -hireYear > 19){

            //salary = (salary * 115)/100;
            raise = (salary * 15)/100;
            return raise;

        }else {
            System.out.println("Hire Year wrong !!!!");
        }
        return 0;
    }




    public double tax(){
        if (salary<1000){
            return 0;
        }else {
            double tax = (salary *0.03 );
            return tax;
        }
    }

    public int bonus(){
        if (workHours > 40){
            int extraHour = workHours-40;
            int bonus = (extraHour * 30);
            return bonus;
        }
        return 0;
    }

    public String toString(){
        double total = salary - tax() +bonus() ;
        double newSalary =  salary + bonus() -tax() +raiseSalary() ;
        System.out.println( "\tName  \t: " + name);
        System.out.println("\tSalary \t: "+ salary);
        System.out.println("\tWork Hour \t: " +workHours);
        System.out.println("\tHire Year \t: " +hireYear);
        System.out.println(("\tTax \t: " + tax()));
        System.out.println("\tBonus \t: " + bonus());
        System.out.println("\tRaise of salary \t: " + raiseSalary());
        System.out.println( "\tSalary with tax and bonus \t: " + total);
        System.out.println("\tTotal Salary\t: " + newSalary);

        return null;
    }

}
