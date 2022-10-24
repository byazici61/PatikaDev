public class Employee {


    String name;
    float salary;
    int workHouse;
    int hireYear;

    Employee(String name,float salary, int workHouse, int hireYear ) {

        this.name= name;
        this.salary=salary;
        this.workHouse=workHouse;
        this.hireYear= hireYear;

    }
    public float tax(){
        float vergi;
        if(salary>1000){
            vergi = salary*3/100;

        }
        else{
            vergi = 0;
        }
        return vergi;

    }

    public float bonus(){

        float bonus;
        if (workHouse>40){
            bonus= (workHouse-40)*30;
        }
        else{
            bonus=0;

        }
        return bonus;
    }
    
    public float raiseSalary(){
        
        float raise;
        float workYear = (2021-hireYear);
        if(workYear<10){
            raise = salary*5/100;
            
            
        }
        else if (workYear>9 && workYear<20) {

           raise = salary*10/100;
            
        }
        else {

            raise = salary*15/100;

        }
        return raise;
    }

        public String toString(){
            System.out.println("Adı : " + name);
            System.out.println("Maaşı : " + salary);
            System.out.println("Çalışma Saati : " + workHouse);
            System.out.println("Başlangıç Yılı : " + hireYear);
            System.out.println("Vergi : " + tax());
            System.out.println("Bonus : " + bonus());
            System.out.println("Maaş Artışı : " + raiseSalary());
            System.out.println("Vergi ve Bonuslar ile Maaş : " + (salary-tax()+bonus()));
            System.out.println("Toplam  Maaş : " + (salary-tax()+bonus()+raiseSalary()));

            return null;
        }
}
