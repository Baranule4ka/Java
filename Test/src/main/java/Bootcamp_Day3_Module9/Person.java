package Bootcamp_Day3_Module9;
public class Person {

    private int weight;
    private float height;

    // Getters and setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBodyMassIndex(double weight, double height) {
        if (weight <= 0 || weight > 600 || height <= 0 || height > 3.0) {
            return "Invalid input";
        }

        // Calculate BMI
        double bmi = weight / (height * height);

        // Return classification
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}