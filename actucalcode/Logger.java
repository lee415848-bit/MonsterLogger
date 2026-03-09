package actucalcode;

import java.util.ArrayList;
import java.util.Scanner;
public class Logger{



    private static Logger instance;
    private ArrayList<Entry> entryList;
    private String name;
   
    
    
    private Logger(){

        entryList = new ArrayList<>();
        
    }

    public void inputName(Scanner scanner){
         System.out.print("Enter a name: ");
        String userInput = scanner.nextLine(); 
        setName(userInput);
        System.out.println("Name set to: " + getName());
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    

    public static Logger getInstatnce(){
        if(instance == null){
            instance = new Logger();
        } 
        return instance;
    }

    public ArrayList<Entry> getEntrylist(){
        return entryList;
    }

    public void addEntry(Entry entry){
        entryList.add(entry);
    }

    



}