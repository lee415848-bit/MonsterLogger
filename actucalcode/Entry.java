package actucalcode;

public  class Entry{

    private static Entry instance;
    private String monsterType;

    public Entry(String monsterType){
        this.monsterType = monsterType;
    }

    public static Entry getInstance(){
        return instance;

    }

    public void makeEntry(String monster){
        if (monster == "vampire" || monster == "Vampire") {
            this.monsterType = monster;
        } 
        
    }

    public String getMonsterType(){
        return monsterType;
    }

}


