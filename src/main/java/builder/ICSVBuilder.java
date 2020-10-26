package builder;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.List;

public interface ICSVBuilder<E> {
    public Iterator<E> getCSVFileIterator(BufferedReader reader, Class csvClass) ;
    public List<E> getCSVFileList(BufferedReader reader, Class csvClass);
}