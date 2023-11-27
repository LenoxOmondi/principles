public class inheritance {

    float salary = 40000;
}
class teacher extends inheritance {
    int bonus = 10000;
    float total = salary + bonus;
    public static void main(String[] args) {
        teacher t = new teacher();//creating object teacher
        System.out.println("Teacher's salary is "+t.salary);
        System.out.println("The bonus is "+t.bonus);
        System.out.println("In a month, he pockets "+t.total); 
    }
}