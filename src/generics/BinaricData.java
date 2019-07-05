package generics;

public class BinaricData extends AbstractData implements Storable <byte[]> {
    final Type type = Type.BIN;
    private byte [] data;

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {

    }

    @Override
    public Type getType() {
        return null;
    }
    BinaricData(long id){
        super(id);
    }
}
