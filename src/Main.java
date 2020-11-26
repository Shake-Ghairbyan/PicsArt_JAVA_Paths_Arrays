public class Main {
    public static void main(String[] args) throws Exception {
        String[] read = FileService.read("/Users/shake/Downloads/text (1).txt");
        Student student1 = new Student(read[0]);
        Student student2 = new Student(read[1]);
        Student student3 = new Student(read[2]);
        Student[] students = {student1, student2, student3};
        //Task 1: Print full names of students
        System.out.println("------------------Task1----------------------");

        StudentService.printFullNames(student1, student2, student3);

        //Task2: Print all male students
        System.out.println("------------------Task2----------------------");

        StudentService.printMaleStudents(students);

        //Task 3: Print all female students who has mark greater then 50.4
        System.out.println("------------------Task3----------------------");

        StudentService.printFemaleStudentsW_HigherMark(students);

        //Task 4: Print student information having the minimal mark
        System.out.println("------------------Task4----------------------");

        StudentService.printStudentWithMinMark(students);

        //task5: Print biggest male student information
        System.out.println("------------------Task5----------------------");

        StudentService.printBiggestMaleStudent(students);

        //Task6: Print students sorted by mark
        System.out.println("------------------Task6----------------------");

        StudentService.sortedStudentsByMarksAscending(students);

        //Task 7: Print female students sorted by year
        System.out.println("------------------Task7----------------------");

        StudentService.sortedFemaleStudentsByBirthYear(students);



    }

}
