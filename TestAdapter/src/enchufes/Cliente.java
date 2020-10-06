package enchufes;

public class Cliente {

    public static void main(String[] args) {
        adaptador adapt = new adaptador(new UK());
        adapt.corrienteEU();
    }


}
