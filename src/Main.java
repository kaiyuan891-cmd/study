public class Main{
    public static void main(String[] args){
        Student s = new Student("Tom",18,99);

        Teacher t = new Teacher("Mile",35,8000);
        Teacher t1 = new Teacher("iii",99,1000);

        s.showInfo();
        System.out.println("score:" + s.score);
        System.out.println("Stydent number:"+ Student.count);

        t.showInfo();
        System.out.println("salary:" + t.salary);
        System.out.println("Teacher number:" +Teacher.count);
    }
}