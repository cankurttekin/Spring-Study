public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double bmi() {
        return this.weight/(this.height * this.height);
    }

    public double maxHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return this.name + ", BMI: " + this.bmi() + ", Maximum Heart Rate: " + this.maxHeartRate();
    }
}
