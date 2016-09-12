/**
 * Created by yassirhessane on 10/08/16.
 */
public class ModeleDecorateur extends Decorateur {

    public ModeleDecorateur(ComposantGraphiqueVehicule composantGraphiqueVehicule) {
        super(composantGraphiqueVehicule);
    }

    public void afficheInfosTechniques()
    {
        System.out.println("Information techniques du modèle");
    }

    public void affiche()
    {
        super.affiche();
        this.afficheInfosTechniques();
    }
}
