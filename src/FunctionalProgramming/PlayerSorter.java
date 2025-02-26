package FunctionalProgramming;

import java.util.*;

public class PlayerSorter {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59,"John",20);
        Player player2 = new Player(67,"Roger",28);
        Player player3 = new Player(45,"Steven",24);

        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);

        PlayerRankingComparator pc = new PlayerRankingComparator();
        Collections.sort(footballTeam,pc);
        System.out.println("After Sorting : " + footballTeam);

        // Comparator using Lambda expression

        Comparator<Player> rankCap = (Player p1, Player p2) -> Integer.compare(p1.getRanking(),p2.getRanking());
        Collections.sort(footballTeam,rankCap);
        System.out.println("After Comparator Sorting : " + footballTeam);

        // One more way
        Collections.sort(footballTeam,Comparator.comparing(Player:: getRanking));
        System.out.println("After sorting ranking: "+ footballTeam);

        Collections.sort(footballTeam,Comparator.comparing(Player:: getname));
        System.out.println("After sorting name : "+ footballTeam);

    }
}
