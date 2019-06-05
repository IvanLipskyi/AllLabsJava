package Generics;

public class StringData extends AbstractData {
    String data;
    private Type type;

    <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(id);
        this.data = data.toString();
        this.type = type;
    }
}
