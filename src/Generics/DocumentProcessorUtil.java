package Generics;

public class DocumentProcessorUtil {
    static long ID_COUNTER;
    DocumentProcessorUtil(long ID_COUNTER){
        this.ID_COUNTER = ID_COUNTER;
    }
    <T extends AbstractData & Storable>
    StringData convert(T data){
        return new StringData(++ID_COUNTER, data.getType(), data);
    }
}
