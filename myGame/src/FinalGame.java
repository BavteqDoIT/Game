import players.PlayerComp;
import statistics.WinStatistics;

/**
 * Gra w odgadywanie wylosowanej liczby.
 *
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class FinalGame {
    public static void main(String[] args) {

        Game game = new Game(new WinStatistics());

        game.addPlayer(new PlayerComp("Marek"));
        game.addPlayer(new PlayerComp("Andrzej"));
        game.printPlayers();

        for (int i=0; i<100; ++i) {
            game.play();
        }

        game.stats.print();

    }

}