package enchufes;

public class adaptador implements europeo {
    //esto como object adapter
    private UK enchufeUK;

    public adaptador(UK enchufeUK) {
        this.enchufeUK = enchufeUK;
    }


    public void corrienteEU(){
        enchufeUK.corrienteUK();
    }
}
