public class Main {
    public static void main(String[] args) {
        /* task1 */
        byte s = 100;
        System.out.println("Значение переменной s c типом byte равно " + s);
        short m = 10000;
        System.out.println("Значение переменной m c типом short равно " + m);
        int l = 100000000;
        System.out.println("Значение переменной l c типом int равно " + l);
        long xl = 10000000000L;
        System.out.println("Значение переменной xl c типом long равно " + xl);
        float fraction = 3.14f;
        System.out.println("Значение переменной fraction c типом float равно " + fraction);
        double particle = 3.1415926d;
        System.out.println("Значение переменной particle c типом double равно " + particle);
        /* task2 */
        float firstNumber = 27.12f;
        long secondNumber = 98767896554L;
        float thirdNumber = 2.786f;
        short fourthNumber = 569;
        short fifthNumber = -159;
        short sixthNumber = 27897;
        byte seventhNumber = 67;
        /* task3 */
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short papers = 480;
        int allStudents = lpStudents + asStudents + eaStudents;
        int papersForStudent = papers / allStudents;
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");
    }
}