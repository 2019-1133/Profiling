package arrayprofiling;

import java.util.Scanner;

public class ArrayProfiling {

    int i = 10;
    int profileindex = 0;
    int deductor = 10;

    String[] names = new String[i];
    String[] nickname = new String[i];
    String[] email = new String[i];
    String[] password = new String[i];
    int[] age = new int[i];

    public static void main(String[] args) {
        ArrayProfiling name;
        name = new ArrayProfiling();
        name.create();
    }

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to create a profile?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int select = sc.nextInt();
        switch (select){
            case 1:
        boolean magenter = true;
        enter:
        while (magenter) {

            System.out.print("Enter Name: ");
            names[profileindex] = sc.next();
            System.out.print("Enter Email: ");
            email[profileindex] = sc.next();
            System.out.print("Enter Password: ");
            password[profileindex] = sc.next();
            System.out.print("Enter Age: ");
            age[profileindex] = sc.nextInt();
            profileindex++;
            deductor--;

            boolean anogagawin = true;
            gagawin:
            while (anogagawin) {
                System.out.println("What do you want to do?");
                sc.nextLine();
                System.out.println("1. Add Profile");
                System.out.println("2. Search Profile");
                System.out.println("3. Show all Profiles");
                System.out.println("4. Exit");
                int number = sc.nextInt();

                if (number == 1) {
                    continue enter;
                }

                if (number == 2) {
                    System.out.println("Enter name!");
                    sc.nextLine();
                    String namessearch = sc.nextLine();
                    for (int i = 0; i < names.length; i++) {

                        if (namessearch.equals(names[i])) {
                            while (namessearch.equals(names[i])) {
                                System.out.println("-----------------------------");
                                System.out.println("Name: " + names[i]);
                                System.out.println("Email: " + email[i]);
                                System.out.println("Password: " + password[i]);
                                System.out.println("Age: " + age[i]);
                                System.out.println("-----------------------------");
                                continue gagawin;
                            }
                        }
                    }
                }
                if (number == 3) {
            for (int j = 0; j < names.length-deductor; j++) {
                
                System.out.println("Profile No. "+j+"\n");
                
                System.out.println("Name: "+names[j]);
                System.out.println("Email: " + email[j]);
                System.out.println("Password: " + password[j]);
                System.out.println("Age: " + age[j]);
                System.out.println("\n");
            }
            continue gagawin;
                }
            if (number == 4) {
                System.exit(0);
            }
            }
        }
            case 2: 
                System.exit(0);
    }
    }}
