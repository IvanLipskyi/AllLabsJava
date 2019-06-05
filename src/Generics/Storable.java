package Generics;

public interface Storable <S> {
    public S read();
    void write(S data);
    Type getType();
}
