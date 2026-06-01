public class Main{
    public static void main(String[] args){
        Person p1 = new Teacher();
        Person p2 = new Student();

        p1.showInfo();
        p2.showInfo();//初步理解多态
        System.out.println("--------------------");
        Person[] people = {
                new Student("Tom",18,99),
                new Teacher("Mike",35,8000),
                new Student("Jack",20,88),
        };
        for(Person p : people ){
            p.showInfo();
            if(p instanceof Student){
                Student s = (Student)p;
                System.out.println(s.getScore());
                System.out.println();
            }else if(p instanceof Teacher){
                Teacher t = (Teacher)p;
                System.out.println(t.getSalary());
                System.out.println();
            }
           // 成员变量：编译看左边，运行也看左边
           // 成员方法：编译看左边，运行看右边
        }
    }
}