package dibujo;

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
import static dibujo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Main_fill_14899946063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;
     Object term956;
     Object term958;
     Object term1127;
     Object term1155;

    public Main_fill_14899946063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term954 = new Integer(-1016503459);
        term956 = new Integer(-1968847291);
        term958 = (Object[]) newObjectArray(Array.newInstance(Class.forName("dibujo.Position"), 0).getClass(), 8);
        Object[] term959 = (Object[]) newArray("dibujo.Position", 6);
        Object term960 = newInstance(Class.forName("dibujo.Position"));
        Object term976 = newInstance(Class.forName("dibujo.Position"));
        Object term992 = newInstance(Class.forName("dibujo.Position"));
        Object term1008 = newInstance(Class.forName("dibujo.Position"));
        Object term1024 = newInstance(Class.forName("dibujo.Position"));
        Object term1040 = newInstance(Class.forName("dibujo.Position"));
        Object[] term1056 = (Object[]) newArray("dibujo.Position", 2);
        Object term1057 = newInstance(Class.forName("dibujo.Position"));
        Object term1073 = newInstance(Class.forName("dibujo.Position"));
        Object[] term1089 = (Object[]) newArray("dibujo.Position", 1);
        Object term1090 = newInstance(Class.forName("dibujo.Position"));
        Object[] term1106 = (Object[]) newArray("dibujo.Position", 9);
        Object term1107 = newInstance(Class.forName("dibujo.Position"));
        Object[] term1123 = (Object[]) newArray("dibujo.Position", 3);
        Object[] term1124 = (Object[]) newArray("dibujo.Position", 5);
        Object[] term1125 = (Object[]) newArray("dibujo.Position", 6);
        Object[] term1126 = (Object[]) newArray("dibujo.Position", 5);
        setIntField(term960, term960.getClass(), "x", 579005622);
        setIntField(term960, term960.getClass(), "y", -14890619);
        setBooleanField(term960, term960.getClass(), "filled", false);
        setField(term960, term960.getClass(), "color", "xOEqzGAmDU");
        setElement(term959, 0, term960);
        setIntField(term976, term976.getClass(), "x", 1632125673);
        setIntField(term976, term976.getClass(), "y", 454281060);
        setBooleanField(term976, term976.getClass(), "filled", true);
        setField(term976, term976.getClass(), "color", "eZFUvlxvGV");
        setElement(term959, 1, term976);
        setIntField(term992, term992.getClass(), "x", -1786399638);
        setIntField(term992, term992.getClass(), "y", 2055867847);
        setBooleanField(term992, term992.getClass(), "filled", true);
        setField(term992, term992.getClass(), "color", "BYqFIqCKAV");
        setElement(term959, 2, term992);
        setIntField(term1008, term1008.getClass(), "x", -1048298087);
        setIntField(term1008, term1008.getClass(), "y", 292681826);
        setBooleanField(term1008, term1008.getClass(), "filled", true);
        setField(term1008, term1008.getClass(), "color", "vrQLuWIDJX");
        setElement(term959, 3, term1008);
        setIntField(term1024, term1024.getClass(), "x", 458147407);
        setIntField(term1024, term1024.getClass(), "y", -184153539);
        setBooleanField(term1024, term1024.getClass(), "filled", true);
        setField(term1024, term1024.getClass(), "color", "flxyYxBRtu");
        setElement(term959, 4, term1024);
        setIntField(term1040, term1040.getClass(), "x", 493620644);
        setIntField(term1040, term1040.getClass(), "y", 1328271830);
        setBooleanField(term1040, term1040.getClass(), "filled", true);
        setField(term1040, term1040.getClass(), "color", "OclPbYPkcH");
        setElement(term959, 5, term1040);
        setElement(term958, 0, term959);
        setIntField(term1057, term1057.getClass(), "x", 1596070772);
        setIntField(term1057, term1057.getClass(), "y", 97029295);
        setBooleanField(term1057, term1057.getClass(), "filled", true);
        setField(term1057, term1057.getClass(), "color", "IoAlmYsBwc");
        setElement(term1056, 0, term1057);
        setIntField(term1073, term1073.getClass(), "x", -1371869594);
        setIntField(term1073, term1073.getClass(), "y", -2095575670);
        setBooleanField(term1073, term1073.getClass(), "filled", false);
        setField(term1073, term1073.getClass(), "color", "TEParAifyi");
        setElement(term1056, 1, term1073);
        setElement(term958, 1, term1056);
        setIntField(term1090, term1090.getClass(), "x", 1225272962);
        setIntField(term1090, term1090.getClass(), "y", 1324040357);
        setBooleanField(term1090, term1090.getClass(), "filled", true);
        setField(term1090, term1090.getClass(), "color", "OWDIEULEFu");
        setElement(term1089, 0, term1090);
        setElement(term958, 2, term1089);
        setIntField(term1107, term1107.getClass(), "x", -1588772968);
        setIntField(term1107, term1107.getClass(), "y", -93135961);
        setBooleanField(term1107, term1107.getClass(), "filled", true);
        setField(term1107, term1107.getClass(), "color", "dWRymuLBtr");
        setElement(term1106, 0, term1107);
        setElement(term1106, 1, term1073);
        setElement(term1106, 2, term1090);
        setElement(term1106, 3, term960);
        setElement(term1106, 4, term1040);
        setElement(term1106, 5, term1008);
        setElement(term1106, 6, term976);
        setElement(term1106, 7, term976);
        setElement(term1106, 8, term1107);
        setElement(term958, 3, term1106);
        setElement(term1123, 0, term1073);
        setElement(term1123, 1, term1073);
        setElement(term1123, 2, term1024);
        setElement(term958, 4, term1123);
        setElement(term1124, 0, term1107);
        setElement(term1124, 1, term1073);
        setElement(term1124, 2, term1040);
        setElement(term1124, 3, term992);
        setElement(term1124, 4, term1024);
        setElement(term958, 5, term1124);
        setElement(term1125, 0, term1073);
        setElement(term1125, 1, term1107);
        setElement(term1125, 2, term1107);
        setElement(term1125, 3, term1008);
        setElement(term1125, 4, term1024);
        setElement(term1125, 5, term1024);
        setElement(term958, 6, term1125);
        setElement(term1126, 0, term976);
        setElement(term1126, 1, term1057);
        setElement(term1126, 2, term1057);
        setElement(term1126, 3, term1090);
        setElement(term1126, 4, term1107);
        setElement(term958, 7, term1126);
        term1127 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term1127, term1127.getClass(), "x", -112921587);
        setIntField(term1127, term1127.getClass(), "y", 933028652);
        setBooleanField(term1127, term1127.getClass(), "filled", true);
        setField(term1127, term1127.getClass(), "color", "AijpHYOFuy");
        HashMap term1156 = new HashMap();
        Set<Object> term1281 =  ((Map) term1156).keySet();
        term1155 = new HashSet((Collection<? extends Object>) term1281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Main");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("dibujo.Position"), 0).getClass(), 0).getClass();
        argTypes[3] = Class.forName("dibujo.Position");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.util.Set");
        Object[] args = new Object[6];
        args[0] = term954;
        args[1] = term956;
        args[2] = term958;
        args[3] = term1127;
        args[4] = "SbAoxhfrkn";
        args[5] = term1155;
        callMethod(klass, "fill", argTypes, null, args);
    }

};


