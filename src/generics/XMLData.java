package generics;

public class XMLData extends AbstractData implements Storable <String> {
    final Type type = Type.XML;
    private String data;

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String data) {

    }

    public Type getType() {
        return type;
    }

    XMLData(long id){
        super(id);
    }
}
