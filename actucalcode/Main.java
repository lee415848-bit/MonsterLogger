package actucalcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Logger log = Logger.getInstatnce();
        log.inputName(scanner);
        instantiateLoggerTest();
        getEntryArrayListTest();




        makeEntryTest();   }
        
        
        
    
    

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
        Entry entry = new Entry();
        entry.makeEntry();
        log.addEntry(entry);
        Entry firstEntry = log.getEntrylist().get(0);
        if (log.getEntrylist()  != null && log.getEntrylist().size() > 0 && firstEntry.getMonsterType() != null) {
            System.out.println("makeEntryTest: scuess");
        } else{
            System.out.println("makeEntryTest: Failure");
        }

        



    }


}
