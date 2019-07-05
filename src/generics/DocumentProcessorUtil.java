package generics;

public class DocumentProcessorUtil {
    static long ID_COUNTER;
    DocumentProcessorUtil(long ID_COUNTER){
        this.ID_COUNTER = ID_COUNTER;
    }
    <T extends AbstractData & Storable>
    StringData convert(T data){
        return new StringData(++ID_COUNTER, data.getType(), data);
    }
    static <T> void build (Storable storeObj, T data){
        storeObj = new Storable() {
            @Override
            public Object read() {
                return null;
            }

            @Override
            public void write(Object data) {

            }

            @Override
            public Type getType() {
                return null;
            }
        };
    }
}
