package actucalcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Logger log = Logger.getInstatnce();
        instantiateLoggerTest();
        getEntryArrayListTest();
        makeEntryTest();

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a name: ");
        String userInput = scanner.nextLine(); 
        log.setName(userInput);
        System.out.println("Name set to: " + log.getName());
        scanner.close();
    }
        
        
        
    
    

    private static void instantiateLoggerTest(){
        Logger log = Logger.getInstatnce();
        if (log.toString().equals(Logger.getInstatnce().toString())) {
            System.out.println("Hola");
        }
        else{
            System.out.println("Adios");
        }
    }

    private static void getEntryArrayListTest(){
        Logger log = Logger.getInstatnce();

        if (log.getEntrylist() instanceof ArrayList) {
            System.out.println("getEntryArrayListTest: hola");
        } else{
            System.out.println("getEntryArrayListTest: adios");
        }
    }

    private static void addEntryTest(){
        Logger log = Logger.getInstatnce();

        log.addEntry(null);

        if (log.getEntrylist().size() > 0) {
            System.out.println("addEntryTest: hola");
        } else {
            System.out.println("addEntryTest: adios");
        }
    } 

    private static void makeEntryTest(){
        Logger log = Logger.getInstatnce();
        Entry entry = new Entry("vampire");
        log.addEntry(entry);
        Entry firstEntry = log.getEntrylist().get(0);
        if (log.getEntrylist()  != null && log.getEntrylist().size() > 0 && firstEntry.getMonsterType() != null) {
            System.out.println("makeEntryTest: scuess");
        } else{
            System.out.println("makeEntryTest: Failure");
        }

        



    }


}
