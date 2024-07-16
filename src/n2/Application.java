package n2;

import static n2.models.Input.*;

public class Application {

    public static void testApplication() {
        testByteMethod();
        testIntMethod();
        testFloatMethod();
        testDoubleMethod();
        testCharMethod();
        testStringMethod();
        testBooleanMethod();
    }

    public static void testByteMethod(){
        String message = "Enter your age: ";
        byte age = readByte(message);
        System.out.println("Your age is: "+age);
    }
    public static void testIntMethod(){
        String message = "Enter your phone number: ";
        int phoneNumber = readInt(message);
        System.out.println("Your phone number is: "+phoneNumber);
    }
    public static void testFloatMethod(){
        String message = "Enter your test mark: ";
        float testMark = readFloat(message);
        System.out.println("Your test mark is: "+testMark);
    }
    public static void testDoubleMethod(){
        String message = "Enter your average mark: ";
        double averageMark = readDouble(message);
        System.out.println("Your average mark is: "+averageMark);
    }
    public static void testCharMethod() {
        String message = "Enter a character: ";
        char character = readChar(message);
        System.out.println("Your character is: "+character);
    }
    public static void testStringMethod()  {
        String message = "Enter your name: ";
        String name = readString(message);
        System.out.println("Your name is: "+name);
    }
    public static void testBooleanMethod()  {
        String message = "Do you give consent for your personal data to be processed? " +
                "(Write 'Y' for 'Yes', 'N' for 'No'): ";
        Boolean answer = readYesNo(message);
        System.out.println("The user gives consent: "+answer);
    }






}
