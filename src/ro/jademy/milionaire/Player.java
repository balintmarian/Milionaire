package ro.jademy.milionaire;

public class Player {
    private int score;
    private String firstName;
    private String lastName;
    public int idPlayer;

    Player(){

    };
    Player(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    Player(String firstName,String lastName,int score){
        this.firstName=firstName;
        this.lastName=lastName;
        this.score=score;
    }
}
