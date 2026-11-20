public class MainCinema {
    public static void main() {
        Ingresso ingresso = new Ingresso();
        System.out.println(ingresso.dublado);

        MeiaEntrada meiaEntrada = new MeiaEntrada();
        System.out.println(meiaEntrada.valorFinal());

        IngressoFamilia ingressoFamilia = new IngressoFamilia(true, 15.90, "moicanos", 4);
        System.out.println(ingressoFamilia.valorFinal());
    }
}
