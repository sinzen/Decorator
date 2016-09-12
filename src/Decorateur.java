/**
 * Created by yassirhessane on 10/08/16.
 */
public abstract class Decorateur implements ComposantGraphiqueVehicule {

    protected ComposantGraphiqueVehicule composantGraphiqueVehicule;

    public Decorateur(ComposantGraphiqueVehicule composantGraphiqueVehicule) {
        this.composantGraphiqueVehicule = composantGraphiqueVehicule;
    }

    @Override
    public void affiche() {
        this.composantGraphiqueVehicule.affiche();
    }
}
