import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws IOException {
        World world = new World();
        world.load_tiles();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fantasy Adventure Game! What is your name, adventurer?");
        String playerName = input.nextLine();
        Player player = new Player(playerName);

        // Load the starting room and display the intro text
        MapTile room = World.tile_exists(player.getLocationX(), player.getLocationY());
        if (room != null) {
            System.out.println(room.intro_text());

            while ((player.is_alive()) && (!player.has_won())) {
                room = World.tile_exists(player.getLocationX(), player.getLocationY());
                room.modify_player(player);

                if ((player.is_alive()) && (!player.has_won())) {
                    System.out.println("Choose an action:");

                    ArrayList<Action> available_actions = room.available_actions();
                    for (Action action : available_actions) {
                        System.out.println(action.getHotkey() + " : " + action.getName());
                    }

                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Action: ");
                    char action_input = in.readLine().charAt(0);

                    for (Action action : available_actions) {
                        if (action_input == action.getHotkey()) {
                            player.do_action(action, null, room);
                            break;
                        }
                    }
                } else {
                    System.out.println("\n\tGame Over!!!");
                    player.writeToFile();
                }
            }

        }
    }
}
