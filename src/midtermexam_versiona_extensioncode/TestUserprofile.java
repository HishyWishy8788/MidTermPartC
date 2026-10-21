package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 * Creates a user profile from keyboard input.
 * @author HISHAM AHMAD
 */
public class TestUserprofile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};

        System.out.println("Choose your favourite genre:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        int choice;

        while (true) {
            System.out.print("Enter a number from 1 to "
                    + genres.length + ": ");

            if (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Please enter a whole number.");
                continue;
            }

            choice = input.nextInt();

            if (choice >= 1 && choice <= genres.length) {
                break;
            }

            System.out.println("That choice is outside the list.");
        }

        String selectedGenre = genres[choice - 1];
        UserProfile profile = new UserProfile(name, selectedGenre);

        System.out.println("Your userProfile was created.");
        System.out.println("Name: " + profile.getUserID());
        System.out.println("Favourite genre: " + profile.getGenre());

        input.close();
    }
}