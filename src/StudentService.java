public class StudentService {
    //Task 1: Print full names of students

    private static void printFullName(Student a) {
        System.out.println("Full name: " + a.getFirstName() + " " + a.getLastName());
    }

    static void printFullNames(Student a, Student b, Student c) {
        printFullName(a);
        printFullName(b);
        printFullName(c);
    }

    //Task2: Print all male students
    private static void printStudentInfo(Student a) {
        System.out.println("Student's info...");
        printFullName(a);
        System.out.println("Birth Year: " + a.getBirthYear());
        System.out.println("Gender: " + (a.getGender() == 'f' ? "Female" : "Male"));
        System.out.println("Mark: " + a.getStudentScore());
    }

    private static boolean checkArrayIsEmpty(Student[] s) {
        if (s == null || s.length == 0) {
            System.out.println("Array is null or empty.");
            return true;
        }
        return false;
    }

    static void printMaleStudents(Student[] students) {
        if (checkArrayIsEmpty(students)) {
            return;
        }
        int count = 0;
        for (Student x : students) {
            if (x.getGender() == 'm') {
                printStudentInfo(x);
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("No male students found.");
        }
    }

    //Task 3: Print all female students who has mark greater then 50.4
    public static void printFemaleStudentsW_HigherMark(Student[] s) {
        if (checkArrayIsEmpty(s)) {
            return;
        }
        int count = 0;
        for (Student x : s) {
            if (x.getGender() == 'f' && x.getStudentScore() > 50.4) {
                printStudentInfo(x);
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("No Female students were found with mark greater than 50.4 .");
        }
    }

    //Task 4: Print student information having the minimal mark
    //If there are some of them, this function will return first one.
    public static void printStudentWithMinMark(Student[] s) {
        if (checkArrayIsEmpty(s)) {
            return;
        }
        Student min = s[0];
        for (int i = 1; i < s.length; i++) {
            if (min.getStudentScore() > s[i].getStudentScore()) {
                min = s[i];
            }
        }
        printStudentInfo(min);
    }

    //task5: Print biggest male student information
    public static void printEldestMaleStudent(Student[] students) {
        if (checkArrayIsEmpty(students)) {
            return;
        }
        Student biggestMaleStudent = null;
        int count = 0;
        for (Student x : students) {
            if (x.getGender() == 'm') {
                ++count;
                if (biggestMaleStudent == null) {
                    biggestMaleStudent = x;
                    continue;
                }
                if (biggestMaleStudent.getBirthYear() > x.getBirthYear()) {
                    biggestMaleStudent = x;
                }
            }
        }
        if (count == 0) {
            System.out.println("No male  were found.");
        } else {
            printStudentInfo(biggestMaleStudent);
        }
    }


    //Task6: Print students sorted by mark
    public static void sortedStudentsByMarksAscending(Student[] s) {
        if (checkArrayIsEmpty(s)) {
            return;
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j].getStudentScore() > s[j + 1].getStudentScore()) {
                    Student reservedStud = s[j + 1];
                    s[j + 1] = s[j];
                    s[j] = reservedStud;
                }
            }
        }
        for (Student n : s) {
            printStudentInfo(n);
        }
    }

    //Task 7: Print female students sorted by year
    public static void sortedFemaleStudentsByBirthYear(Student[] s) {
        if (checkArrayIsEmpty(s)) {
            return;
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j].getBirthYear() > s[j + 1].getBirthYear()) {
                    Student reservedStud = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = reservedStud;
                }
            }
        }
        int count = 0;
        for (Student n : s) {
            if (n.getGender() == 'f') {
                ++count;
                printStudentInfo(n);
            }
        }
        if (count == 0) {
            System.out.println("No female students were found.");
        }
    }
}
