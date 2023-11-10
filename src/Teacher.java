public class Teacher extends Person {

    private char teachingGrade;

    public Teacher(String name, int age,char grade){
        super(name, age);
        this.teachingGrade = grade;
    }

    public double[] getGrades(Student[] students) {
        //grades[i] -> avg of sridents[i]
        double[] grades = new double[students.length];
        for(int i=0;i<students.length;i++){
            grades[i]=students[i].getAvgGrade();
        }
        return grades;
    }

    @Override
    public double[] getGrades() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrades'");
    }
    
}
