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

public class RBTree_1_init_1303566180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public RBTree_1_init_1303566180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term199 = newInstance(Class.forName("java.util.TreeMap"));
        Object term200 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term201 = newInstance(Class.forName("java.time.Instant"));
        setField(term199, term199.getClass(), "comparator", null);
        setLongField(term201, term201.getClass(), "seconds", 1538078916L);
        setIntField(term201, term201.getClass(), "nanos", 394000000);
        setField(term200, term200.getClass(), "key", term201);
        setField(term200, term200.getClass(), "value", null);
        setField(term200, term200.getClass(), "left", null);
        setField(term200, term200.getClass(), "right", null);
        setField(term200, term200.getClass(), "parent", null);
        setBooleanField(term200, term200.getClass(), "color", true);
        setField(term199, term199.getClass(), "root", term200);
        setIntField(term199, term199.getClass(), "size", 1);
        setIntField(term199, term199.getClass(), "modCount", 1);
        setField(term199, term199.getClass(), "entrySet", null);
        setField(term199, term199.getClass(), "navigableKeySet", null);
        setField(term199, term199.getClass(), "descendingMap", null);
        setField(term199, term199.getClass(), "keySet", null);
        setField(term199, term199.getClass(), "values", null);
        setField(term198, term198.getClass(), "map", term199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Object[] args = new Object[1];
        args[0] = term198;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


