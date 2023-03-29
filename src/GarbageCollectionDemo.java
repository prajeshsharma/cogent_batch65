public class GarbageCollectionDemo {
    int objId;

    public GarbageCollectionDemo(int objId) {
        this.objId = objId;
        System.out.println("created: " + this.objId);
    }

    @Override
    protected void finalize() {
        System.out.println("finalised: " + this.objId);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 3; i++)
            new GarbageCollectionDemo(i);
    }
}
