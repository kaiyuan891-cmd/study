class Person {

    String name;

    int age;

    double height;

    double weight;

    public double calcBMI() {
        return weight / (height * height);
    }
}