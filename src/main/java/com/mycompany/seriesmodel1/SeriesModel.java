/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seriesmodel1;

import java.util.Scanner;

/**
 *
 * @author michael
 */
public class SeriesModel {

    private static int currentCount = 0;
    private static final int count = 100;
    private static int[] seriesId = new int[count];
    private static StringBuilder[] seriesName = new StringBuilder[count];
    private static int[] seriesAge = new int[count];
    private static int[] episodeNumber = new int[count];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (launchApp() == 1) {
            int b = -1;
            // pls take note that b is used as the loop contol variable and nothing more
            while (b < 0) {
                int choice = launchMenu();
                if (choice == 6) b = b * b;

                if (choice == 1) {
                    if (captureSeries() == 1) {
                        b = b - 1;
                    } else b = b * b;
                }

                if (choice == 2) {
                    searchSeries();
                }

                if (choice == 3) {
                    if (updateAge() == 1) {
                        b = b - 1;
                    } else b = b * b;
                }

                if (choice == 4) {
                    if (deleteSeries() == 1) {
                        b = b - 1;
                    } else b = b * b;
                }

                if (choice == 5) {
                    printSeries();
                    b = b - 1;
                }
            }
        } else {
            System.out.println("You have chosen to quit.");
        }
    }

    public static int launchApp() {
        System.out.println("LATEST SERIES - 2025");
        System.out.print("Input 1 to launch menu or any other to exit: ");
        String option = scanner.nextLine();
        if (option.equals("1")) {
            return 1;
        } else return 2;
    }
    
    public static int launchMenu() {
        System.out.println("\n1 - Capture a new series" +
                "\n2 - Search for a series" +
                "\n3 - Update series age restriction" +
                "\n4 - Delete a series" +
                "\n5 - Print series report - 2025" +
                "\n6 - Exit application");
        System.out.print("Please select one of the above: ");
        String option = scanner.nextLine();
        return Integer.parseInt(option);
    }

    public static int captureSeries() {
        for (int x = currentCount; x < currentCount + 1; x++) {
            int b = -1;
            while (b < 0) {
                System.out.print("Enter Series ID: ");
                String ID = scanner.nextLine();
                try {
                    seriesId[x] = Integer.parseInt(ID);
                    b = b * b;
                } catch (NumberFormatException e) {
                    System.out.println("Please put in a number.");
                    b = b - 1;
                }
            }

            System.out.print("Enter the series name: ");
            String name = scanner.nextLine();
            seriesName[x] = new StringBuilder();
            seriesName[x].append(name);

            int c = -1;
            while (c < 0) {
                System.out.print("Enter an age between 2 and 18: ");
                String age = scanner.nextLine();
                try {
                    int ageValue = Integer.parseInt(age);
                    if (ageValue >= 2 && ageValue <= 18) {
                        seriesAge[x] = ageValue;
                        c = c * c;
                    } else {
                        System.out.println("Invalid boundaries. 2-18 only.");
                        c = c - 1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Only digits please.");
                    c = c - 1;
                }
            }

            int d = -1;
            while (d < 0) {
                System.out.print("Put in the number of episodes for " + seriesName[x] + ": ");
                String number = scanner.nextLine();
                try {
                    episodeNumber[x] = Integer.parseInt(number);
                    d = d * d;
                } catch (NumberFormatException e) {
                    System.out.println("Number of episodes cannot be in words!");
                    d = d - 1;
                }
            }
        }
        currentCount++;
        System.out.println("SERIES PROCESSED SUCCESSFULLY!");
        System.out.print("Enter 1 to launch menu or any other to quit: ");
        String option = scanner.nextLine();
        return Integer.parseInt(option);
    }

    public static void searchSeries() {
        int b = -1;
        while (b < 0) {
            System.out.print("Kindly put the Series ID of the series: ");
            String Option = scanner.nextLine();
            
            int position = -1;

            try {
                int option = Integer.parseInt(Option);
                for (int i = 0; i < currentCount + 1; i++) {
                    if (seriesId[i] == option) {
                        position = i;
                        System.out.println("\nSeries ID: " + seriesId[position]
                                + "\nSeries Name: " + seriesName[position]
                                + "\nSeries Age: " + seriesAge[position]
                                + "\nNumber of episodes: " + episodeNumber[position]);
                        b = b * b;
                    }
                }
            } catch (NumberFormatException x) {
                System.out.println("Only digits!");
                b = b - 1;
            }
        }
    }

    public static int updateAge() {
        int b = -1;
        while (b < 0) {
            System.out.print("Kindly put the ID of the series you wish to edit: ");
            String Option = scanner.nextLine();
            int position = -1;
            int option = Integer.parseInt(Option);

            for (int i = 0; i < count; i++) {
                if (seriesId[i] == option) {
                    position = i;
                    break;
                } else {
                    System.out.println("The series doesn't exist.");
                    b = b - 1;
                }
            }

            System.out.print("Kindly put in the series name for ID: " + seriesId[position] + ": ");
            String name = scanner.nextLine();
            seriesName[position].replace(0, seriesName[position].length(), name);

            System.out.print("Update the age: ");
            String Age = scanner.nextLine();
            try {
                seriesAge[position] = Integer.parseInt(Age);
            } catch (NumberFormatException e) {
                System.out.println("Must be a digit");
                b = b - 1;
            }

            System.out.print("Update number of episodes: ");
            String number = scanner.nextLine();
            try {
                episodeNumber[position] = Integer.parseInt(number);
                b = b * b;
            } catch (NumberFormatException e) {
                System.out.println("Must be a digit");
                b = b - 1;
            }
        }
        System.out.print("Input 1 to launch main menu or any other option to quit: ");
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public static int deleteSeries() {
        int b = -1;
        while (b < 0) {
            System.out.print("Kindly put the ID of the series you wish to delete: ");
            String Option = scanner.nextLine();
            int position = -1;

            try {
                int option = Integer.parseInt(Option);
                for (int i = 0; i < currentCount; i++) {
                    if (seriesId[i] == option) {
                        position = i;
                        break;
                    }
                }

                if (position == -1) {
                    System.out.println("The series doesn't exist.");
                    b = b - 1;
                } else {
                    System.out.print("Are you sure you wish to delete this series? (y/n): ");
                    String confirm = scanner.nextLine();

                    if (confirm.equalsIgnoreCase("y")) {
                        seriesId[position] = 0;
                        seriesName[position] = null;
                        seriesAge[position] = 0;
                        episodeNumber[position] = 0;
                        System.out.println("Series deleted.");
                    }
                    b = b * b;
                }
            } catch (NumberFormatException x) {
                System.out.println("Please enter a valid digit.");
                b = b - 1;
            }
        }
        System.out.print("Input 1 to launch main menu or any other option to quit: ");
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public static void printSeries() {
        for (int i = 0; i < currentCount; i++) {
            System.out.println("\nSeries ID: " + seriesId[i]
                    + "\nSeries Name: " + seriesName[i]
                    + "\nSeries Age: " + seriesAge[i]
                    + "\nNumber of episodes: " + episodeNumber[i]);
        }
    }
}

