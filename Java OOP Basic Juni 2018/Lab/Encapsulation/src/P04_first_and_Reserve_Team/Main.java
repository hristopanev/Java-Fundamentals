package P04_first_and_Reserve_Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        Team team = new Team("Name");

        while (count-- > 0){
            String[] info = reader.readLine().split("\\s+");

            Player player = null;

            try {
                player = new Player(info[0], info[1], Integer.parseInt(info[2]),
                Double.parseDouble(info[3]));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            team.addPlayer(player);
        }

        System.out.println(team);
    }
}
