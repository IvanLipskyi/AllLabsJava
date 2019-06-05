package Generics;

public class NumericData extends AbstractData implements Storable <Number> {
    final Type type = Type.NUM;
    private Number data;

    @Override
    public Integer read() {
        return null;
    }

    @Override
    public void write(Number data) {

    }

    @Override
    public Type getType() {
        return null;
    }
    NumericData(long id){
        super(id);
    }
}
