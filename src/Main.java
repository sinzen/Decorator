public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        VueVehicule vueVehicule1 = new VueVehicule();
        ModeleDecorateur modeleDecorateur1 = new ModeleDecorateur(vueVehicule1);
        MarqueDecorateur marqueDecorateur1 = new MarqueDecorateur(modeleDecorateur1);
        marqueDecorateur1.affiche();
    }
}
