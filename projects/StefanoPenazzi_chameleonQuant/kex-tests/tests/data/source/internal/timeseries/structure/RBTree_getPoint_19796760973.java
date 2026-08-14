package data.source.internal.timeseries.structure;

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
import static data.source.internal.timeseries.structure.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RBTree_getPoint_19796760973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term92;

    public RBTree_getPoint_19796760973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term84 = newInstance(Class.forName("java.util.TreeMap"));
        Object term85 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term86 = newInstance(Class.forName("java.time.Instant"));
        setField(term84, term84.getClass(), "comparator", null);
        setLongField(term86, term86.getClass(), "seconds", 1500721068L);
        setIntField(term86, term86.getClass(), "nanos", 23000000);
        setField(term85, term85.getClass(), "key", term86);
        setField(term85, term85.getClass(), "value", null);
        setField(term85, term85.getClass(), "left", null);
        setField(term85, term85.getClass(), "right", null);
        setField(term85, term85.getClass(), "parent", null);
        setBooleanField(term85, term85.getClass(), "color", true);
        setField(term84, term84.getClass(), "root", term85);
        setIntField(term84, term84.getClass(), "size", 1);
        setIntField(term84, term84.getClass(), "modCount", 1);
        setField(term84, term84.getClass(), "entrySet", null);
        setField(term84, term84.getClass(), "navigableKeySet", null);
        setField(term84, term84.getClass(), "descendingMap", null);
        setField(term84, term84.getClass(), "keySet", null);
        setField(term84, term84.getClass(), "values", null);
        setField(term83, term83.getClass(), "map", term84);
        term92 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term92, term92.getClass(), "seconds", 1797203628L);
        setIntField(term92, term92.getClass(), "nanos", 25000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term92;
        callMethod(klass, "getPoint", argTypes, term83, args);
    }

};


