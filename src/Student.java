import java.util.Arrays;
import java.util.Random;

public class Student extends Person {

    private Character grade;
    private double[] grades;

    public Student(String name, int age, Character grade) {
        super(name, age);
        this.grade = grade;
    }

    public Character getGrade() {
        return this.grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public double[] getGrades() {
        return this.grades;
    }

    public static double[] getRandomGrades(int l){
        double[] arr = new double[l];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextDouble()*100.0; // returns num from 0-1
        }
        return arr;
    }

    public double getAvgGrade() {
        double avg = 0;
        for(int i=0; i<this.grades.length; i++){
            avg = grades[i] + avg;
        }
        avg /= (double)this.grades.length;
        return avg;
    }
}
