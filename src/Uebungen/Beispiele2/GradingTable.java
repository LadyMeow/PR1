package Uebungen.Beispiele2;

public class GradingTable {
    public static void main(String[] args) {

    }

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

