public class Returns {

    public static void main(String[] args) {
        String student;
        String grades;

        grades = findGrades(90);
        displayGrades("John", grades);

        grades = findGrades(70);
        displayGrades("Abid", grades);

        grades = findGrades(65);
        displayGrades("Shojon", grades);

    }
     public static String findGrades(int score) {
         String grades;

         if (score >= 80 && score <= 100) {
             grades = "A";
         } else if (score >= 70 && score <= 79) {
             grades = "B";
         } else if (score >= 60 && score <= 69) {
             grades = "C";
         } else if (score >= 50 && score <= 59) {
             grades = "D";
         } else {
             grades = "F";
         }
         return grades;
     }


      public static void displayGrades(String student, String grades) {
        System.out.println("**********");
        System.out.println("grade of " + student + " is " + grades);
        System.out.println("**********");
      }
    }






