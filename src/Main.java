public class Main {
    public static void main(String[] args) {
        System.out.println("Переменные. Часть 2");

        System.out.println("Задача 1");
        int black = 33000;
        System.out.println("Значение переменной black c типом int равно " + black);
        byte white = 100;
        System.out.println("Значение переменной white c типом byte равно " + white);
        short red = 200;
        System.out.println("Значение переменной red c типом short равно " + red);
        long blue = 330000L;
        System.out.println("Значение переменной blue c типом long равно " + blue);
        float green = 3.3333333F;
        System.out.println("Значение переменной green c типом float равно " + green);
        double yellow = 4.44444444;
        System.out.println("Значение переменной yellow c типом double равно " + yellow);

        System.out.println("Задача 2");
        float letterA = 27.12F;
        long letterB = 987_678_965_549L;
        double letterC = 2.786;
        boolean letterD = false;
        int letterE = 569;
        short letterF = -159;
        char letterG = 27897;
        byte letterH = 67;

        System.out.println("Задача 3");
        short teacherLP = 23;
        short teacherAS = 27;
        short teacherEA = 30;
        short paper = 480;
        int pupilPaper = paper/(teacherLP+teacherAS+teacherEA);
        System.out.println("На каждого ученика расчитано " + pupilPaper + " листов бумаги.");

        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int twentyMinutes = 20;
        System.out.println("За "+twentyMinutes+" минут машина произвела бутылок "+twentyMinutes/minutes*bottles+" штук.");
        int day = (24*60/minutes*16);
        System.out.println("За сутки машина произвела бутылок "+day+" штук.");
        System.out.println("За 3 дня машина произвела бутылок "+day*3+" штук.");
        System.out.println("За 1 месяц машина произвела бутылок "+day*30+" штук.");

        System.out.println("Задача 5");
        int paintCan = 120;
        int whiteCan = 2;
        int brownCan = 4;
        int classes = paintCan/(whiteCan+brownCan);
        System.out.println("В школе, где "+classes+" классов, нужно "+classes*whiteCan+" банок белой краски и "+classes*brownCan+" банок коричневой краски.");

        System.out.println("Задача 6");
        int bananas = 5;
        int oneBananas = 80;
        int milk = 200;
        int oneHundredMilk = 105;
        int icecream = 2;
        int oneIcecream = 100;
        int eggs = 4;
        int oneEggs = 70;
        int breakfast = bananas*oneBananas+2*oneHundredMilk+icecream*oneIcecream+eggs*oneEggs;
        float secondBreakfast = breakfast/1000F;
        System.out.println("Вес спорт-завтрака спортсмена составляет "+breakfast+" грамм или "+secondBreakfast+" килограмм.");

        System.out.println("Задача 7");
        int weight = 7;
        int secondWeight = weight*1000;
        int firstVariant = 250;
        int secondVariant = 500;
        int firstDiet = secondWeight/firstVariant;
        int secondDiet = secondWeight/secondVariant;
        System.out.println("Если спортмен будет терять каждый день по "+firstVariant+" грамм, он похудеет за "+firstDiet+" дней.");
        System.out.println("Если спортмен будет терять каждый день по "+secondVariant+" грамм, он похудеет за "+secondDiet+" дней.");
        System.out.println("В среднем спортсмен похудеет за "+(firstDiet+secondDiet)/2+" дней.");

        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        int newMasha = masha*10/100+masha;
        int newDenis = denis*10/100+denis;
        int newCristina = cristina*10/100+cristina;
        int oldYearMasha = 12*masha;
        int oldYearDenis = 12*denis;
        int oldYearCristina = 12*cristina;
        int newYearMasha = 12*newMasha;
        int newYearDenis = 12*newDenis;
        int newYearCristina = 12*newCristina;
        System.out.println("Маша теперь получает "+newMasha+" рублей. Годовой доход вырос на "+(newYearMasha-oldYearMasha)+" рублей.");
        System.out.println("Денис теперь получает "+newDenis+" рублей. Годовой доход вырос на "+(newYearDenis-oldYearDenis)+" рублей.");
        System.out.println("Кристина теперь получает "+newCristina+" рублей. Годовой доход вырос на "+(newYearCristina-oldYearCristina)+" рублей.");




    }
}