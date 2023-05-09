import java.util.SortedMap;

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
        byte allStudents = (byte) (lpStudents + asStudents + eaStudents);
        short papersForStudent = (short) (papers / allStudents);
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");
        /* task4 */
        byte machinePerformanceFor2min = 16;
       byte machinePerformanceFor1min = (byte) (machinePerformanceFor2min / 2);
        System.out.println(machinePerformanceFor1min);
       short machinePerformanceFor20min = (short) (machinePerformanceFor1min * 20);
       short machinePerformanceForDay = (short) (machinePerformanceFor1min * 60 * 24);
       int machinePerformanceFor3Days = machinePerformanceForDay * 3;
       int machinePerformanceForMonth = machinePerformanceForDay * 30;
       System.out.println("За 20 минут машина произвела " + machinePerformanceFor20min + " штук бутылок");
       System.out.println("За сутки машина произвела " + machinePerformanceForDay + " штук бутылок");
       System.out.println("За 3 дня машина произвела " + machinePerformanceFor3Days + " штук бутылок");
       System.out.println("За месяц машина произвела " + machinePerformanceForMonth + " штук бутылок");
        /* task5 */
        byte paint = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        byte amountPaintForOneClass = (byte) (whitePaintForOneClass + brownPaintForOneClass);
        byte amountClasses = (byte) (paint / amountPaintForOneClass);
        byte amountWhitePaints = (byte) (amountClasses * whitePaintForOneClass);
        byte amountBrownPaints = (byte) (amountClasses * brownPaintForOneClass);
        System.out.println("В школе, где " + amountClasses + " классов, нужно " + amountWhitePaints + " банок белой краски и " + amountBrownPaints + " банок коричневой краски");
        /* task6 */
        byte bananas = 5;
        byte weightOneBanana = 80;
        byte milk = 2;
        byte weight100MlMilk = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte eggs = 4;
        byte weightOneEgg = 70;
        float weightOfMilkshake = (float) (weightOneBanana * bananas + weight100MlMilk * milk + iceCream * weightOneIceCream + eggs * weightOneEgg);
        System.out.println("Вес такого спорзавтрака " + weightOfMilkshake + "грамм");
        float weightOfMilkShakeOnKg = weightOfMilkshake / 100;
        System.out.println("Вес такого спорзавтрака " + weightOfMilkShakeOnKg + " килограмм");
        /* task7 */
        byte needLostWeight = 7;
        short needLostWeightGr = (short) (needLostWeight * 1000);
        short deficitCalFirstVariant = 250;
        short deficitCalSecondVariant = 500;
        short daysForWeightLossFirstVariant = (short) (needLostWeightGr / deficitCalFirstVariant);
        byte daysForWeightLossSecondVariant = (byte) (needLostWeightGr / deficitCalSecondVariant);
        System.out.println("Потребуется " + daysForWeightLossFirstVariant + " дней для похудения на " + needLostWeight + " кг");
        System.out.println("Потребуется " + daysForWeightLossSecondVariant + " дней для похудения на " + needLostWeight + " кг");
        short averageWeightLoss = (short) ((deficitCalFirstVariant + deficitCalSecondVariant) / 2);
        short daysForAverageWeightLoss = (short) (needLostWeightGr / averageWeightLoss);
        System.out.println("Потребуется в среднем " + daysForAverageWeightLoss + " дней для похудения на " + needLostWeight + " кг");
        /* task8 */
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = salaryMasha + (salaryMasha / 100 * 10);
        int newSalaryDenis = salaryDenis + (salaryDenis / 100 * 10);
        int newSalaryKristina = salaryKristina + (salaryKristina / 100 * 10);
        int salaryMashaForYear = salaryMasha * 12;
        int newSalaryMashaForYear = newSalaryMasha * 12;
        int salaryDenisForYear = salaryDenis * 12;
        int newSalaryDenisForYear = newSalaryDenis * 12;
        int salaryKristinaForYear = salaryKristina * 12;
        int newSalaryKristinaForYear = newSalaryKristina * 12;
        int differenceSalaryMasha = newSalaryMashaForYear - salaryMashaForYear;
        int differenceSalaryDenis = newSalaryDenisForYear - salaryDenisForYear;
        int differenceSalaryKristina = newSalaryKristinaForYear - salaryKristinaForYear;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей");


    }
}