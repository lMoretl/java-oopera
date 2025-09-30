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
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("В \"" + title + "\" актёр " + surnameToReplace +
                        " заменён на " + newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией \"" + surnameToReplace +
                "\" не найден в \"" + title + "\".");
    }
}
