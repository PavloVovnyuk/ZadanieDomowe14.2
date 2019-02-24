import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CreatePlayers {
    public Player createPlayer() {
        Scanner scanner = new Scanner (System.in);
        Player player = new Player (scanner.nextLine (), scanner.nextLine (), scanner.nextInt ());
        return player;
    }

    public List playersInfo() {
        List<Player> lista = new ArrayList<> ();
        String stop = "stop";
        boolean wyniki = true;
        while (wyniki) {
            System.out.println ("Wprowadz dane gracza");
            Player player1 = createPlayer ();
            if (player1.getName ().equals (stop)) {
                System.out.println ("Stop");
                wyniki = false;
            } else {
                lista.add (player1);
            }
        }
        return lista;
    }

        public List shovInfo() {
        List lista1 = playersInfo ();
        Collections.sort (lista1);
        System.out.println (lista1);
        return lista1;
    }

    public void createPlik() throws IOException {
        FileWriter fileWriter = new FileWriter ("status.csv");
        BufferedWriter bfw = new BufferedWriter (fileWriter);
        bfw.write (shovInfo ().toString ());
        bfw.close ();
    }
}


