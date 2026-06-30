package loliSnatcher;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static loliSnatcher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ImageWriter_write_18757438082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;
     Object term1046;

    public ImageWriter_write_18757438082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term957 = newInstance(Class.forName("loliSnatcher.ImageWriter"));
        Object term958 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term958, term958.getClass(), "fileURL", "tPlsykYBqO");
        setField(term958, term958.getClass(), "sampleURL", "bLPjGVBhlX");
        setField(term958, term958.getClass(), "thumbnailURL", "whBvTVIIlC");
        setField(term958, term958.getClass(), "tags", "IgRJUzaCwW");
        setField(term958, term958.getClass(), "postURL", "JUmudUmaaV");
        setIntField(term958, term958.getClass(), "id", 679763016);
        setIntField(term958, term958.getClass(), "width", 1962444399);
        setIntField(term958, term958.getClass(), "height", 767834723);
        setField(term957, term957.getClass(), "item", term958);
        setField(term957, term957.getClass(), "localID", "KoyGrUJeJW");
        Class<? extends Object> term1152 = Class.forName((String) "java.io.File$PathStatus");
        Field term1151 = ((Class) term1152).getDeclaredField((String) "INVALID");
        ((Field) term1151).setAccessible(true);
        Object enum2 = ((Field) term1151).get((Object) null);
        term1046 = newInstance(Class.forName("java.io.File"));
        setField(term1046, term1046.getClass(), "path", "MAcUBcBckh");
        setField(term1046, term1046.getClass(), "status", enum2);
        setIntField(term1046, term1046.getClass(), "prefixLength", -602026508);
        setField(term1046, term1046.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.ImageWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = "HqBOwkVqjD";
        args[1] = term1046;
        callMethod(klass, "write", argTypes, term957, args);
    }

};


