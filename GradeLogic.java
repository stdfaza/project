public class GradeLogic {
    public static String getGrade(int score) {
        if (score >= 85 && score <= 100) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 55) {
            return "C";
        } else if (score >= 40) {
            return "D";
        } else if (score >= 0) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}

