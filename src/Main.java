public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int total = 0;
        int contributionMonth = 15000;
        int i = 0;
        float monthPercent = 1.01F;

        while (total <= 2459000) {
            i++;
            total = (int) (total * monthPercent + contributionMonth);
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");

        int k = 0;
        while (k < 10) {
            k++;
            System.out.print(k + " ");
        }
        System.out.println();
        int n;
        for (n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");

        int population = 12000000;
        float fertility = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = (int) (population + population * fertility - population * mortality);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");

        int contribution = 15000;
        int j = 0;
        float contributionPercent = 1.07F;
        while (contribution <= 12000000) {
            j++;
            contribution = (int) (contribution * contributionPercent);
            System.out.println("Месяц " + j + " сумма накоплений равна " + contribution + " рублей");
        }
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        int contribution2 = 15000;
        int p = 0;
        float contributionPercent2 = 1.07F;
        while (contribution2 <= 12000000) {
            p++;
            contribution2 = (int) (contribution2 * contributionPercent2);
            if (p % 6 == 0) {
                System.out.println("Месяц " + p + " сумма накоплений равна " + contribution2 + " рублей");
            }
        }
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");

        int contribution3 = 15000;
        int totalMonth = 9 * 12;
        int month = 0;
        float contributionPercent3 = 1.07F;
        while (month <= totalMonth) {
            month++;
            contribution3 = (int) (contribution3 * contributionPercent3);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + contribution3 + " рублей");
            }
        }
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");

        int friday = 5;
        int monthDay = 31;
        while (friday < monthDay) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println();

        //Задача
        System.out.println("Задача 8");
        int yearComet1 = 2022;
        int beforeComet1 = yearComet1 - 200;
        int afterComet1 = yearComet1 + 100;
        for (int year1 = beforeComet1; year1 < afterComet1; year1++){
            if (year1 % 79 == 0) {
                System.out.println(year1);
            }
        } System.out.println();

        //Задача
        System.out.println("Задача 8 Вариант 2");

        int yearComet = 2022;
        int beforeComet = yearComet - 200;
        int afterComet = yearComet + 100;
        int yearCounter = 0;
        while (yearCounter > beforeComet && yearCounter < afterComet) {
            if (yearCounter % 79 == 0) {
                System.out.println(yearCounter);
            }
        }
    }
}
