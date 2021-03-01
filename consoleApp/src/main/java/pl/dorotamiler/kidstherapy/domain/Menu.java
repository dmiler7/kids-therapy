package pl.dorotamiler.kidstherapy.domain;

/**
 *
 *
 * Menu allowing choice of:
 * - main menu
 * - patient's submenu
 * - facility's submenu
 */

import java.util.Scanner;

public class Menu {
    public static String PATIENT_MENU = "p";
    public static String FACILITY_MENU = "f";
    public static String EXIT = "e";
//    public static String

    public static void printMainMenu() {
        System.out.println();
        System.out.println("************************************************");
        System.out.println("****************  MAIN menu  *******************");
        System.out.println("************************************************");
        System.out.println(" ( " + Menu.PATIENT_MENU + " ) Patient");
        System.out.println(" ( " + Menu.FACILITY_MENU + " ) Facility");
        System.out.println(" ( " + Menu.EXIT + " ) Quit program");
        System.out.println("************************************************");
    }

    public static void showPatientSubmenu() {
        System.out.println();
        System.out.println("--------------   PATIENT's menu   --------------");
        System.out.println("-> choose number from the following options:");
        System.out.println("- (all patients)   ----------------------------");
        System.out.println("1 - Show all patients");
        System.out.println("- (search)   ----------------------------------");
        System.out.println("2 - Find patient");
        System.out.println("3 - Find patient's facility");
        System.out.println("- (edition)  ----------------------------------");
        System.out.println("4 - Add patient");
        System.out.println("5 - Edit patient");
        System.out.println("6 - Delete patient");
        System.out.println("- (other)  ------------------------------------");
        System.out.println("7 - Add patients from file");
        System.out.println("- (quit)   ------------------------------------");
        System.out.println("0 -> EXIT TO MAIN MENU");
        System.out.println("-----------------------------------------------\n");
    }

    public static void showFacilitySubmenu() {
        System.out.println();
        System.out.println("--------------   FACILITY's menu   --------------");
        System.out.println("-> choose number from the following options:");
        System.out.println("- (all facilities)   ----------------------------");
        System.out.println("1 - Show all facilities");
        System.out.println("- (search)   ------------------------------------");
        System.out.println("1 - Show all facilities");
        System.out.println("2 - Find facility");
        System.out.println("- (edition)  ------------------------------------");
        System.out.println("3 - Add facility");
        System.out.println("4 - Edit facility");
        System.out.println("5 - Delete facility");
        System.out.println("- (other)  --------------------------------------");
        System.out.println("6 - Add facilities from file");
        System.out.println("- (quit)   --------------------------------------");
        System.out.println("0 -> EXIT TO MAIN MENU");
        System.out.println("--------------------------------------------------\n");
    }

    public static Integer getScanNumberInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getScanStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void shouldContinue() {
        boolean stopContinue = false;
        while (!stopContinue) {
            System.out.println("Press 'c' button to continue ...");
            String cButton = Menu.getScanStringInput();
            if (cButton.equals("c")) {
                stopContinue = true;
            }
        }
    }
}