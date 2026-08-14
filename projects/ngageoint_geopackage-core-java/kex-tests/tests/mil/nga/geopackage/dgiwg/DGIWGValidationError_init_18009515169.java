package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DGIWGValidationError_init_18009515169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum28;
     Object term10681;

    public DGIWGValidationError_init_18009515169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10878 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term10877 = ((Class) term10878).getDeclaredField((String) "ZOOM_MATRIX_SETS_MULTIPLE");
        ((Field) term10877).setAccessible(true);
        enum28 = ((Field) term10877).get((Object) null);
        term10681 = (Object[]) newArray("mil.nga.geopackage.dgiwg.DGIWGValidationKey", 7);
        Object term10682 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10707 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10732 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10757 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10782 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10807 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10832 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term10682, term10682.getClass(), "column", "ffYhPOzlUs");
        setField(term10682, term10682.getClass(), "value", "MLqYREekMl");
        setElement(term10681, 0, term10682);
        setField(term10707, term10707.getClass(), "column", "ytSBIKXogI");
        setField(term10707, term10707.getClass(), "value", "nHXjMycHlU");
        setElement(term10681, 1, term10707);
        setField(term10732, term10732.getClass(), "column", "ieCtQFdkii");
        setField(term10732, term10732.getClass(), "value", "dEnhdmILtU");
        setElement(term10681, 2, term10732);
        setField(term10757, term10757.getClass(), "column", "hoicvmsovO");
        setField(term10757, term10757.getClass(), "value", "eqJfYWRaEL");
        setElement(term10681, 3, term10757);
        setField(term10782, term10782.getClass(), "column", "fhkbdRViHi");
        setField(term10782, term10782.getClass(), "value", "uWHnvSvaPl");
        setElement(term10681, 4, term10782);
        setField(term10807, term10807.getClass(), "column", "kBdSllIBVz");
        setField(term10807, term10807.getClass(), "value", "TJmVBGfTML");
        setElement(term10681, 5, term10807);
        setField(term10832, term10832.getClass(), "column", "tPlsykYBqO");
        setField(term10832, term10832.getClass(), "value", "bLPjGVBhlX");
        setElement(term10681, 6, term10832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Number");
        argTypes[3] = Class.forName("java.lang.Number");
        argTypes[4] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        argTypes[5] = Array.newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = "onpbIeEKoi";
        args[1] = "YRHGsAkhxb";
        args[2] = null;
        args[3] = null;
        args[4] = enum28;
        args[5] = term10681;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


