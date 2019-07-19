package Guleri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Connect : A place where people share their stories" +
                "\n Choose your passion: " +
                "\n 1. Read stories" +
                "\n 2. Want to add stories" +
                "\n\n \033[1;34m  Enter your choice number : \033[0m " +
                "\n (Example  enter 1 for reading stories) ");
        num = in.nextInt();
        if (num == 1) {
            Stories callStories = new Stories();
            callStories.choiceAction();
        } else if (num == 2) {
           EnterStories writeStory = new EnterStories();
           writeStory.enterStories();
            System.out.println("\033[7;33mWeb page opens were you can access various tools and ideas shared by" +
                    "writers. >>>>>>>>>>>>>>>>>");
        } else {
            System.out.println("\n\n Invalid value \n \033[1;34m Please  re-enter your choice code : \033[0m  :>");
            main(args);
        }
    }
}
