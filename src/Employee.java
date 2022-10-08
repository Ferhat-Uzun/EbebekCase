public class Employee{
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    //Constructor
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear =hireYear ;
    }

    //Tax method
    public double tax(){
        if (this.salary > 1000){
            return this.salary*3/100;
        }
        return 0.0;
    }

    //Bonus method
    public double bonus(){
        if (this.workHours>40){
            return 30*(this.workHours-40);
        }
        return 0.0;
    }

    final int currentYear = 2021;

    public double raiseSalary(){
        int year = currentYear-this.hireYear;

        if (year < 10){
            return (this.salary*5/100)-tax()+bonus();
        } else if (year>=10 && year<20) {
            return  (this.salary*10/100)-tax()+bonus() ;
        }
        return (this.salary*15/100)-tax()+bonus();
    }

    public String toString(){
        return "Çalısanın ismi: " + this.name +
                "\nÇalısanın başlangıç maaşı: "+ this.salary +
                "\nÇalısanın işe giriş tarihi: "+ this.hireYear +
                "\nÇalısanın mesai saati: "+ this.workHours+
                "\nÇalısandan alınan vergi: "+tax()+
                "\nÇalısana verilen bonus: "+bonus()+
                "\nÇalısanın zammı : "+raiseSalary()+
                "\nÇalısanın yeni maası : "+(this.salary+raiseSalary());
    }

}