public class TesteDietaObserver {

    public static void main(String args[]) {
        BalancaDieta balanca = new BalancaDieta();
        Dieta dieta = new Dieta();
        dieta.registerObserver(balanca);
        dieta.setPeso(150);
    }
}
