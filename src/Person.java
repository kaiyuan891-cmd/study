class Person{
     String name;
     int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(){}
    public void showInfo(){
        System.out.println("name:"+name);
        System.out.println("age:"+ age);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}