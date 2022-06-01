package Family;

import java.util.Scanner;

    public class Logic {

        public static void start() {
            Human[] allHumans = new Human[10];
            String[] names = new String[10];
            int i = 0;
            while (true) {
                System.out.println("\nEnter your command: ");

                System.out.println("To create new person from scratch, type in \" CreateNewPerson \".");
                System.out.println("To create new person from two parents, type in \" CreateFromParents \".");
                System.out.println("To list all people, type in \" List \"");
                System.out.println("To exit, type in \" Exit \"");

                Scanner in = new Scanner(System.in);
                String n = in.nextLine();

                if (n.equalsIgnoreCase("CreateNewPerson")) {
                    Logic.createNewPerson(allHumans,names,i);
                    i++;
                }

                if (n.equalsIgnoreCase("CreateFromParents")) {
                    if(i < 2){
                        System.out.println("There is not enough people created. Please make sure, that there is at least 2 persons created from scratch.");
                        System.out.println();
                        continue;
                    }
                    Logic.createPersonFromParents(i, names);
                    i++;
                }

                if (n.equalsIgnoreCase("List")) {
                    for (int j = 0; j < names.length; j++) {
                        System.out.println(j + " :" + names[j]);
                    }
                    continue;
                }

                if (n.equalsIgnoreCase("Exit")) {
                    break;
                }


            }
        }

        public static void createNewPerson(Human[] allHumans,String[] names,int i) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of person.");
            String name = in.nextLine();

            boolean isMale = false;
            while (true) {
                System.out.println("Enter sex of person(M or F)");
                String MF = in.nextLine();
                if (MF.equalsIgnoreCase("M")) {
                    isMale = true;
                    break;
                } else if (MF.equalsIgnoreCase("F")) {
                    break;
                } else {
                    System.out.println("Incorrect input.Try again");
                }
            }

            System.out.println("Enter the name of mother.");
            String motherName = in.nextLine();

            System.out.println("Enter the name of father.");
            String fatherName = in.nextLine();
            System.out.println("The person " + name + " was born!");
            if (isMale) {
                System.out.println("He is a boy!");
            } else {
                System.out.println("She is a girl!");
            }
            System.out.println("His/Her parents are " + motherName + " and " + fatherName + ".");
            System.out.println("          " + motherName + "                  " + fatherName);
            System.out.println("           |                      |    ");
            System.out.println("           ------------------------    ");
            System.out.println("                       |               ");
            System.out.println("                      " + name + "               ");

            allHumans[i] = new Human(name, isMale, motherName, fatherName);
            names[i] = name;


        }



        private static void createPersonFromParents(int i, String[] names ) {
            System.out.println("Choose 2 parents( type in 2 names ):");
            for (int j = 0; j < names.length; j++) {
                System.out.println( j + ": " + names[j]);
            }
            Scanner in = new Scanner(System.in);
            String mother = names[in.nextInt()];
            String father = names[in.nextInt()];

            System.out.println("Enter the name of person:");
            Scanner on = new Scanner(System.in);
            String name = on.nextLine();

            names[i] = name;
            boolean isMale = false;
            while (true) {
                System.out.println("Enter sex of person(M or F)");
                String MF = in.nextLine();
                if (MF.equalsIgnoreCase("M")) {
                    isMale = true;
                    break;
                } else if (MF.equalsIgnoreCase("F")) {
                    break;
                } else {
                    System.out.println("Incorrect input.Try again");
                }
            }

            System.out.println("          " + mother + "                  " + father);
            System.out.println("           |                      |    ");
            System.out.println("           ------------------------    ");
            System.out.println("                       |               ");
            System.out.println("                      " + name + "               ");
            new Human(name, isMale, mother, father);
        }
    }

