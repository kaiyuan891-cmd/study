class Student extends Person{
  private double score;
  static int count = 0;
  public Student(){
      count++;
  }
  public Student(String name,int age,double score){
      super(name,age);
      this.score = score;
      count++;
  }
  @Override
    public void showInfo(){
      System.out.println("I'm Student");
      System.out.println("name:"+name);
      System.out.println("age:"+ age);
      System.out.println("score:"+score);
  }
  public double getScore(){
      return score;
  }
}
