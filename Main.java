public class Main {
    public static int add(int a, int b) {
        return a + b;
    }
        public static double calcBMI(double height, double weight) {
            return weight / (height * height);
        }

        public static void checkAge(int age) {
            if (age >= 18) {
                System.out.println("已成年");
            } else {
                System.out.println("未成年");
            }
        }
        public static void main(String[] args) {
            int result1 = add(1, 1);
            System.out.println(result1);
            double result2 = calcBMI(1.7, 70);
            System.out.println(result2);
            checkAge(20);
            Person p = new Person();
            p.name = "Mike";
            p.age = 20;
            p.height = 1.7;
            p.weight = 70;
            System.out.println("name:" + p.name);
            System.out.println("BMI:" + p.calcBMI());
        }

}