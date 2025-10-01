import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Актёров пока нет.");
            return;
        }
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor a : listOfActors) {
            System.out.println(" • " + a);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в \"" + title + "\".");
        } else {
            listOfActors.add(actor);
            System.out.println("Добавлен актёр " + actor + " в \"" + title + "\".");
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        int foundIndex = -1;
        int count = 0;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                foundIndex = i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Актёр с фамилией \"" + surnameToReplace +
                    "\" не найден в \"" + title + "\".");
        } else if (count > 1) {
            System.out.println("Найдено несколько актёров с фамилией \"" +
                    surnameToReplace + "\". Замена не выполнена.");
        } else {
            listOfActors.set(foundIndex, newActor);
            System.out.println("В \"" + title + "\" актёр с фамилией \"" +
                    surnameToReplace + "\" заменён на " + newActor);
        }
    }
}
