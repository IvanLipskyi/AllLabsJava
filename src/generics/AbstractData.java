package generics;

public abstract class AbstractData {
    private long id;
    public long getId() {
        return id;
    }
    AbstractData(long id){
        this.id = id;
    }
}
