package generics.challenge;

public class Main {
    /*
    ArrayList<Tribe> teams;
    Collections.sort(teams);
    Create a generic class to implement a league table for a sport.
    The class should allow teams to be added to the list, and store
    a list of teams that belong to the league.

    Your class should have a method to print out the teams in order,
    with the team at the top of the league printed first.

    Only teams of the same type should be added to any particular
    instance of the league class - the program should fail to compile
    if an attempt is made to add an incompatible team.
    */

    public static void main(String[] args) {

        League<Tribe<Protoss>> goldLeague = new League<>("Gold Protoss League");

        Tribe<Protoss> shelak = new Tribe<>("Shelak");
        Tribe<Protoss> auriga = new Tribe<>("Auriga");
        Tribe<Protoss> nerazim = new Tribe<>("Nerazim");
        Tribe<Protoss> venetir = new Tribe<>("Venetir");
        Tribe<Zerg> xelnaga = new Tribe<>("Xel'naga");

        venetir.matchResult(auriga, 900, 250);
        nerazim.matchResult(shelak, 380, 0);
        nerazim.matchResult(auriga, 800, 10);

        goldLeague.add(shelak);
        goldLeague.add(auriga);
        goldLeague.add(nerazim);
        goldLeague.add(venetir);

//        goldLeague.add(xelnaga);      // Zergs are not welcome in the Protoss gold League
        goldLeague.showLeagueTable();


// -------> Unchecked warnings:

        Zerg zergling = new Zerg("Zergling");
        Protoss stalker = new Protoss("Stalker");

        Tribe rawTribe = new Tribe("Raw Tribe");
        rawTribe.addPlayer(zergling);
        rawTribe.addPlayer(stalker);

        goldLeague.add(rawTribe);

        League<Tribe> rawLeague = new League<>("Raw");
        rawLeague.add(shelak);
        rawLeague.add(xelnaga);
        rawLeague.add(rawTribe);

        League reallyRaw = new League<>("Really Raw");
        reallyRaw.add(shelak);
        reallyRaw.add(xelnaga);
        reallyRaw.add(rawTribe);



    }
}
