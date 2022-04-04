package Uebungen.Unterricht.IfBedingungen;

public class GradingTable {
    public static void main(String[] args) {
        int points = 40;

        System.out.println("With " + points + " points, the grade is: " + getGrade(points));
        System.out.println("The grade is: " + getGrade(65));
        System.out.println("The grade is: " + getGrade(78));
        System.out.println("The grade is: " + getGrade(90));

    }
    //methode grade berechnen
    public static String getGrade(int points){
        String grade;
        if (points >= 90) {
            grade = "Outstanding";
        } else if (points >= 78) {
            grade = "Excellent";
        } else if (points >= 65) {
            grade = "Acceptable";
        } else if (points >= 51) {
            grade = "Passing";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}
