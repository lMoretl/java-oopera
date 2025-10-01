public class Theatre {
    public static void main(String[] args) {

        Actor a1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor a2 = new Actor("Пётр", "Петров", Gender.MALE, 175);
        Actor a3 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);

        Director d1 = new Director("Сергей", "Орлов", Gender.MALE, 15);
        Director d2 = new Director("Анна", "Власова", Gender.FEMALE, 8);

        Person composer = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show drama = new Show("Гроза", 120, d1);

        Opera opera = new Opera(
                "Травиата",
                150,
                d2,
                new Person("Джузеппе", "Верди", Gender.MALE),
                "История любви Виолетты и Альфредо",
                30
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                140,
                d1,
                composer,
                "История Одиллии и Зигфрида",
                choreographer
        );

        drama.addActor(a1);
        drama.addActor(a2);

        opera.addActor(a2);
        opera.addActor(a3);

        ballet.addActor(a1);
        ballet.addActor(a3);

        System.out.println();
        drama.printActors();
        opera.printActors();
        ballet.printActors();

        System.out.println();
        drama.replaceActor(a3, "Петров");
        drama.printActors();

        drama.replaceActor(a2, "Кузнецов");

        System.out.println();
        opera.printLibretto();
        ballet.printLibretto();
    }
}
