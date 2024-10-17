public class Main {
    public static void main(String[] args) {

        // Задача 1.

        System.out.println("Задача 1.");

        int earnings = 0;
        int investment = 15000;
        int monthCount = 0;

        while (earnings <= 2459000) {
            earnings = earnings + investment;
            monthCount++;
            System.out.println(monthCount + "-ой(ый) месяц сумма накоплений равна " + earnings);
        }

        System.out.println("\nВсего потребуется " + monthCount +
                " месяцев за которые мы накопим 2459000, а именно " + earnings);

        // Задача 2.

        System.out.println("\nЗадача 2.");

        int numbers = 0;

        while (numbers < 10) {
            numbers++;
            System.out.print(numbers + " ");
        }

        System.out.println();

        for (int count = 10; count >= 1; count--) {
            System.out.print(count + " ");
        }

        // Задача 3

        System.out.println("\n\nЗадача 3.");

        int population = 12_000_000;

        int years = 0;

        while (years < 10) {
            int mortality = population * 8 / 1000;
            int birthRate = population * 17 / 1000;
            years++;
            population = population - mortality + birthRate;
            System.out.println(years + "-ой(ый) год население страны: " + population);
        }

        // Задача 4

        System.out.println("\nЗадача 4.");

        int earning1 = 0;
        int investments1 = 15_000;
        int count1 = 0;
        int percentPerMonth = 7;

        while (earning1 < 12_000_000) {
            earning1 = earning1 + investments1 + earning1 * percentPerMonth / 100;
            count1++;
            System.out.println(count1 + "-ой(ый) месяц сумма накоплений равна " + earning1);
        }

        System.out.println("\nВсего потребуется " + count1 +
                " месяцев за которые мы накопим 12000000, а именно " + earning1);

        // Задача 5

        System.out.println("\nЗадача 5.");

        int earning2 = 0;
        int investments2 = 15_000;
        int count2 = 0;
        int percentPerMonth2 = 7;

        while (earning2 < 12_000_000) {
            earning2 = earning2 + investments2 + earning2 * percentPerMonth2 / 100;
            count2++;
            if (count2 % 6 == 0) {
                System.out.println(count2 + "-ой(ый) месяц сумма накоплений равна " + earning2);
            }
        }

        System.out.println("\nВсего потребуется " + count2 +
                " месяцев за которые мы накопим 12000000, а именно " + earning2);

        // Задача 6

        System.out.println("\nЗадача 6.");

        int earning3 = 0;
        int investments3 = 15_000;
        int count3 = 0;
        int percentPerMonth3 = 7;
        int months = 9 * 12;

        while (count3 < months) {
            earning3 = earning3 + investments3 + earning3 * percentPerMonth3 / 100;
            count3++;
            if (count3 % 6 == 0) {
                System.out.println(count3 + "-ой(ый) месяц сумма накоплений равна " + earning3);
            }
        }

        System.out.println("\nОбщая сумма накоплений за " + count3 +
                " месяцев или " + count3 / 12 + " лет равна " + earning3);

        // Задача 7
        System.out.println("\nЗадача 7.");

        int dayCount = 0;
        int firstFriday = 4;

        while (dayCount < 31) {
            dayCount++;

            if ((dayCount - firstFriday) % 7 == 0) {
                System.out.println("Сегодня " + dayCount + " день месяца - Пятница. Необходимо подготовить отчет");
            }
        }

        // Задача 8
        System.out.println("\nЗадача 8.");

        int startDate = 1817;
        int finishDate = 2117;

        while (startDate < finishDate) {
            startDate++;
            if ((startDate - 1817) % 79 == 0) {
                System.out.println(startDate);
            }
        }
    }
}