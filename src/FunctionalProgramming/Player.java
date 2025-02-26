package FunctionalProgramming;

import java.util.Comparator;

public class Player implements Comparable<Player> {

    private int ranking;
    private String name;
    private int age;

    public  int getRanking(){
        return  this.ranking;
    }

    public String getname(){
        return  this.name;
    }

    public int getAge(){
        return this.age;
    }
    Player(int ranking,String name, int age){
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player p) {
        return -(this.age - p.age);
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PlayerRankingComparator implements Comparator<Player>{

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
    }
}
