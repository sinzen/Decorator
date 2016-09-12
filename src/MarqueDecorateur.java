/**
 * Created by yassirhessane on 10/08/16.
 */
public class MarqueDecorateur extends Decorateur {

    public MarqueDecorateur(ComposantGraphiqueVehicule composantGraphiqueVehicule) {
        super(composantGraphiqueVehicule);
    }

    public void afficheLogo()
    {
        System.out.println("Logo de la marque");
    }

    public void affiche()
    {
        super.affiche();
        this.afficheLogo();
    }
}
