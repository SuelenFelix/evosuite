package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class IntervalUnion_invert_21043482452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1447;
     Object term1451;
     Object term1453;

    public IntervalUnion_invert_21043482452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1447 = newInstance(Class.forName("pikaparser.parser.utils.IntervalUnion"));
        Object term1448 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term1448, term1448.getClass(), "comparator", null);
        setField(term1448, term1448.getClass(), "root", null);
        setIntField(term1448, term1448.getClass(), "size", 0);
        setIntField(term1448, term1448.getClass(), "modCount", 0);
        setField(term1448, term1448.getClass(), "entrySet", null);
        setField(term1448, term1448.getClass(), "navigableKeySet", null);
        setField(term1448, term1448.getClass(), "descendingMap", null);
        setField(term1448, term1448.getClass(), "keySet", null);
        setField(term1448, term1448.getClass(), "values", null);
        setField(term1447, term1447.getClass(), "nonOverlappingRanges", term1448);
        term1451 = new Integer(-117576464);
        term1453 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.IntervalUnion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1451;
        args[1] = term1453;
        callMethod(klass, "invert", argTypes, term1447, args);
    }

};


