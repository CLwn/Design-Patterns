public class File implements Acomponent {
    private int capacity;

    public File(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
