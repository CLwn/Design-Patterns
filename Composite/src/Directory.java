import java.util.LinkedList;
import java.util.List;

public class Directory implements Acomponent {
    private List<Acomponent> list;
    private String name;

    public Directory(String name) {
        this.name = name;
        this.list = new LinkedList<>();
    }

    @Override
    public int getCapacity() {
        int result = 0;
        for(Acomponent com: list){
          result = result+com.getCapacity();
        }
        return result;
    }

    public void add(Acomponent child){
        list.add(child);
    }
}
