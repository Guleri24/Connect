package Guleri;

import java.util.Scanner;

class Stories {
    private static Scanner in = new Scanner(System.in);
    private static int choice;
    private StoriesDataAccess dataOfStories = new StoriesDataAccess();

    private int storyCategories() {
        System.out.println("Choose the stories type:" +
                "\n 1. Overcoming The Monster" +
                "\n 2. Rags To Riches" +
                "\n 3. The Quest" +
                "\n 4. Voyage And Return" +
                "\n 5. Comedy" +
                "\n 6. Tragedy" +
                "\n 7. Rebirth" +
                "\n 8. Random" +
                "\n \033[7;34m  Enter your choice number : \033[0m\033[7;33m" +
                "\n ( example 2 for The Quest )");
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            storyCategories();
        }
        return choice;
    }

    void choiceAction() {
        int num = storyCategories();
        switch (num) {
            case 1: {
                dataOfStories.OvercomingTheMonsterAccess();
            }
            break;
            case 2: {
                dataOfStories.RagsToRichesAccess();
            }
            break;
            case 3: {
                dataOfStories.TheQuestAccess();
            }
            break;
            case 4: {
                dataOfStories.VoyageAndReturnAccess();
            }
            break;
            case 5: {
                dataOfStories.ComedyAccess();
            }
            break;
            case 6: {
                dataOfStories.TragedyAccess();
            }
            break;
            case 7: {
                dataOfStories.RebirthAccess();
            }
            break;
            case 8: {
                dataOfStories.RandomAccess();
            }
            break;
            default: {
                System.err.println("Invalid entry");
                storyCategories();
            }
        }

    }

}

