class Student extends Person{
    double score;
  static int count = 0;
  public Student(){
      count++;
  }
  public Student(String name,int age,double score){
      super(name,age);
      this.score = score;
      count++;
  }
}
