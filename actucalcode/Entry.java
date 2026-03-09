package actucalcode;

import java.util.Scanner;

public  class Entry{

    private static Entry instance;
    private String monsterType;

    public Entry(){
    }

    public static Entry getInstance(){
        return instance;

    }

    public void makeEntry(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("What monster do you want to make an entry for: ");
        String userInput = scanner.nextLine();
        this.monsterType = userInput;
 
        scanner.close();
    }

    public String getMonsterType(){
        return monsterType;
    }

}


