package dev.lpa.generics;
interface Player{}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
public class Main {
    public static void main(String[] args) {
    BaseballTeam ind = new BaseballTeam("India");
    BaseballTeam chn = new BaseballTeam("China");

    SportsTeam ind1 = new SportsTeam("India");
    SportsTeam chn1 = new SportsTeam("China");
        scoreResult(ind,30,chn,10);

        Team ind2 = new Team("India");
        Team chn2 = new Team("China");
        scoreResult(ind,10,chn,30);

    var harper = new BaseballPlayer("Vikram", "Left Handed");
    var modi = new BaseballPlayer("Sachin", "Right Handed");

        var harper1 = new FootballPlayer("Natasha", "Left Handed");
        var modi1 = new FootballPlayer("Deepak", "Right Handed");

    ind1.addTeamMember(harper1);
    ind1.addTeamMember(modi1);
    ind1.listTeamMembers();
        chn.addTeamMember(harper);
        chn.addTeamMember(modi);
        chn.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}