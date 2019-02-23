import java.util.*;

public class CreatePlayers {
    public static void playersInfo() {
        List<Players> lista = new ArrayList<> ();
        String stop = "stop";
        boolean wyniki = true;
        while (wyniki) {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Wprowadz dane gracza");
            String name = scanner.nextLine ();
            if (name.equals (stop)) {
                System.out.println ("Stop");
                wyniki = false;
            } else {
                String surname = scanner.nextLine ();
                int result = scanner.nextInt ();
                Players players = new Players (name, surname, result);
                lista.add (players);
            }
        }
        Collections.sort (lista);
        System.out.println (lista);
    }
}

