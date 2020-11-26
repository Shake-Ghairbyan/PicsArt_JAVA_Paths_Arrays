public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private char gender;
    private double studentScore;

    public double getStudentScore() {
        return studentScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public char getGender() {
        return gender;
    }

    private String parseName(String str) {
        if (str != null && str.length() > 0) {
            return str;
        } else {
            System.out.println("Invalid input");
            return "Not available";
        }
    }

    public Student(String s) {
        String[] split = s.split(",");
        firstName = parseName(split[0]);
        lastName = parseName(split[1]);
        birthYear = Integer.parseInt(split[2]);
        gender = split[3].charAt(0);
        studentScore = Double.parseDouble(split[4]);
    }
}
