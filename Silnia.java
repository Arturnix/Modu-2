public class Silnia {
    public static long policzSilnie(int silniaPodstawa) {

        if(silniaPodstawa < 0) {
            System.out.println("Podaj liczbe > 0 aby obliczyc silnie");
            System.exit(1);
        }

        long silnia = 1;

        for(int i = silniaPodstawa; i >= 1; i--) {
            silnia *= i;
        }
        System.out.println(silniaPodstawa + "! = " + silnia);

        return silnia;
    }

}
