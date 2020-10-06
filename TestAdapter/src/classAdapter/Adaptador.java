package classAdapter;

public class Adaptador extends UK implements EU {

    @Override
    public void corrienteEU() {
        corrienteUK();
    }
}
