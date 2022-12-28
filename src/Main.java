public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("task1:");
        int age = 7, ageLimit = 18;
        if (age < ageLimit) {
            System.out.println("Если возраст человека равен " + age + ", то человек не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то человек достиг совершеннолетия");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");
        int temperature = -5, temperatureLimit = 5;
        if (temperature < temperatureLimit) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");
        int speed = 61, speedLimit = 60;
        if (speed <= speedLimit) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4:");
        int age = 7;
        int kindergartenAgeLimitMin = 2;
        int schoolAgeLimitMin = 7;
        int universityAgeLimitMin = 19;
        int workAgeLimitMin = 25;
        if (age >= kindergartenAgeLimitMin && age < schoolAgeLimitMin) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= schoolAgeLimitMin && age < universityAgeLimitMin) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= universityAgeLimitMin && age < workAgeLimitMin) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= workAgeLimitMin) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5:");
        int age = 12;
        int AgeLimit1 = 5;
        int AgeLimit2 = 14;
        if (age < AgeLimit1) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= AgeLimit2) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("task6:");
        int numberOfPassengers = 100;
        int trainCarCapacity = 102;
        int numberOfSeats = 60;
        if (numberOfPassengers > trainCarCapacity) {
            System.out.println("Количество пассажиров " + numberOfPassengers + ". В вагоне нет свободных мест.");
        } else if (numberOfPassengers < numberOfSeats) {
            System.out.println("Количество пассажиров " + numberOfPassengers + ". В вагоне есть сидячие места.");
        } else {
            System.out.println("Количество пассажиров " + numberOfPassengers + ". В вагоне есть стоячие места.");
        }
     }

    public static void task7() {
        System.out.println();
        System.out.println("task7:");
        int one = 0;
        int two = -2;
        int three = -1;
        System.out.println("даны три числа: " + one + "," + two + "," + three);
        if (one < two) {
            System.out.println((two > three)? "большее из трех чисел - число " + two:"большее из трех чисел - число " + three );
        } else {
            System.out.println((one > three)? "большее из трех чисел - число " + one:"большее из трех чисел - число " + three );
        }
    }
}