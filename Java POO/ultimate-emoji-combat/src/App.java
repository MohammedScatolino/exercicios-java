
public class App {
    public static void main(String[] args) throws Exception {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 68.9f, 1.75f);

        l[1] = new Lutador ("Putscript", "Brasil", 29, 14, 2, 3, 57.8f, 1.68f);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 80.9f, 1.65f);

        Luta uec1 = new Luta();
        uec1.marcarLuta(l[0], l[1]);
        uec1.lutar();
        





    }
}
