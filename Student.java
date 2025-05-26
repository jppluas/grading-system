import java.util.*;

public class Student {
    private String id;
    private String name;
    private List<Double> gradesList;
    private boolean honorRoll;
    private String passStatus;

    public Student(String id, String name) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.id = id;
        this.name = name;
        this.gradesList = new ArrayList<>();
        this.honorRoll = false;
        this.passStatus = "Unknown";
    }

    public boolean addGrade(double newGrade) {
        if (newGrade < 0 || newGrade > 100) {
            System.out.println("Error: Grade must be between 0 and 100.");
            return false;
        }
        gradesList.add(newGrade);
        updateStatus();
        return true;
    }

    public double average() {
        if (gradesList.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double grade : gradesList) {
            sum += grade;
        }
        return sum / gradesList.size();
    }

    private void updateStatus() {
        double avg = average();
        honorRoll = avg >= 90;
        passStatus = avg >= 60 ? "Passed" : "Failed";
    }

    public boolean removeGradeByIndex(int idx) {
        if (idx < 0 || idx >= gradesList.size()) {
            System.out.println("Error: Index out of bounds.");
            return false;
        }
        gradesList.remove(idx);
        updateStatus();
        return true;
    }

    public boolean removeGradeByValue(double value) {
        if (!gradesList.contains(value)) {
            System.out.println("Error: Grade value not found.");
            return false;
        }
        gradesList.remove(value);
        updateStatus();
        return true;
    }

    public String getLetterGrade() {
        double avg = average();
        if (avg >= 90) return "A";
        if (avg >= 80) return "B";
        if (avg >= 70) return "C";
        if (avg >= 60) return "D";
        return "F";
    }

    public void reportCard() {
        System.out.println("----- Student Summary Report -----");
        System.out.println("Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades Number: " + gradesList.size());
        System.out.printf("Average: %.2f\n", average());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Pass/Fail: " + passStatus);
        System.out.println("Honor Roll: " + (honorRoll ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }

}