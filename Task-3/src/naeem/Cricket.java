package naeem;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("The Match Type : " +matchType);
        System.out.println("Over of the match : " +over);
        System.out.println("Name of a player : " +player.playerName);
        System.out.println("Jersey Number of a player : " +player.jerseyNumber);
    }
}

/*
    Name : Naeem Khan
    ID : 2012020105
    Section : C
    bath : 53
    Email : cse_2012020105@lus.ac.bd
    Date : 11-09-2021
    */
