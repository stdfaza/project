import javax.swing.*;

public class GradeCalculatorGUI {
    public static void main(String[] args) {
        // Pop-up untuk input nama
        String name = JOptionPane.showInputDialog(null, "Enter student name:");

        // Pop-up untuk input nilai
        String scoreInput = JOptionPane.showInputDialog(null, "Enter score (0 - 100):");

        String grade;
        try {
            int score = Integer.parseInt(scoreInput);

            if (score >= 85 && score <= 100) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 55) {
                grade = "C";
            } else if (score >= 40) {
                grade = "D";
            } else if (score >= 0) {
                grade = "E";
            } else {
                grade = "Invalid";
            }

            if (!grade.equals("Invalid")) {
                JOptionPane.showMessageDialog(
                    null,
                    "Student: " + name + "\nScore: " + score + "\nGrade: " + grade,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Error: score must be between 0–100.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "Error: invalid input, please enter a number!",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}

