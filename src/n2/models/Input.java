package n2.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        boolean isCorrect = true;
        byte age = 0;
        do {
            try {
                System.out.println(message);
                age = sc.nextByte();
                isCorrect = true;
            } catch (InputMismatchException eByte) {
                System.out.println("Format error, please try again.");
                isCorrect = false;
                sc.nextLine();
            }
        } while(!isCorrect);
        return age;
    }

    public static int readInt(String message) {
        boolean isCorrect = true;
        int phoneNumber = 0;
        do {
            try {
                System.out.println(message);
                phoneNumber = sc.nextInt();
                isCorrect = true;
            } catch (InputMismatchException eInt) {
                System.out.println("Format error, please try again.");
                isCorrect = false;
                sc.nextLine();
            }
        } while(!isCorrect);
        return phoneNumber;
    }
    public static float readFloat(String message)  {
        boolean isCorrect = true;
        float testMark = 0.0f;
        do {
            try {
                System.out.println(message);
                testMark = sc.nextFloat();
                isCorrect = true;
            } catch (InputMismatchException eFloat) {
                System.out.println("Format error, please try again.");
                isCorrect = false;
                sc.nextLine();
            }
        } while(!isCorrect);
        return testMark;
    }
    public static double readDouble(String message) {
        boolean isCorrect = true;
        double averageMark = 0.0;
        do {
            try {
                System.out.println(message);
                averageMark = sc.nextDouble();
                isCorrect = true;
            } catch (InputMismatchException eDouble) {
                System.out.println("Format error, please try again.");
                isCorrect = false;
                sc.nextLine();
            }
        } while(!isCorrect);
        return averageMark;
    }
    //leer solo un char.
    //Lanzar la exception en el else.
    public static char readChar(String message)  {
        boolean isCorrect = false;
        String word = " ";
        char character = ' ';
        do {
            try {
                System.out.println(message);
                word = sc.next();
                sc.nextLine();
                if (word.length() == 1 && Character.isDigit(word.charAt(0))){
                    character = word.charAt(0);

                } else {
                    throw new Exception ("Format error, please try again.");
                }
                isCorrect = true;

            } catch (Exception eChar) {
                System.out.println(eChar.getMessage());
            }
        } while(!isCorrect);
        return character;
    }
   //asegurarme que solo lee strings (recorrer el string)
    public static String readString(String message) {
        boolean isCorrect = true;
        boolean isName = true;
        String name = " ";
        int i = 0;
        do {
            try {
                System.out.println(message);
                name = sc.nextLine();
                while(i<name.length() && !isName){
                    if(Character.isDigit(name.charAt(i))){
                        isName = false;
                    }
                    i++;
                }
                if(!isName){
                    throw new Exception("Format error, please try again.");
                }

            } catch (Exception eString) {
                System.out.println(eString.getMessage());

            }
        } while(!isCorrect);
        return name;
    }
    public static boolean readYesNo(String message)  {
        boolean isCorrect = false;
        boolean isItYes = true;
        String answer = " ";
        do {
            try {
                System.out.println(message);
                answer = sc.nextLine();
                if(answer.equalsIgnoreCase("Y")){
                    isItYes = true;
                    isCorrect = true;
                } else if (answer.equalsIgnoreCase("N")){
                    isItYes = false;
                    isCorrect = true;
                } else {
                    throw new Exception("Invalid character, please entry 'Y' or 'N':");
                }

            } catch (Exception eBoolean) {
                System.out.println(eBoolean.getMessage());
            }
        } while(!isCorrect);
        return isItYes;
    }







}
