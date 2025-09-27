import javax.swing.*;

public class GradeCalculatorGUI {
    public static void main(String[] args) {
        // Input nama
        String name = JOptionPane.showInputDialog(null, "Enter student name:");

        // Input nilai
        String scoreInput = JOptionPane.showInputDialog(null, "Enter score (0 - 100):");

        try {
            int score = Integer.parseInt(scoreInput);
            String grade = GradeLogic.getGrade(score);

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

