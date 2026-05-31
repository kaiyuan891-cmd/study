class Teacher extends Person {
    double salary;
    static int count = 0;
    public Teacher(){
    count++;
    }
    public Teacher(String name,int age,double salary){
        super(name,age);
        this.salary=salary;
        count++;
    }
}
