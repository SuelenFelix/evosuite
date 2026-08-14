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

public class RBTree_getLast_15760582119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;

    public RBTree_getLast_15760582119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term147 = newInstance(Class.forName("java.util.TreeMap"));
        Object term148 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term149 = newInstance(Class.forName("java.time.Instant"));
        setField(term147, term147.getClass(), "comparator", null);
        setLongField(term149, term149.getClass(), "seconds", 1668569229L);
        setIntField(term149, term149.getClass(), "nanos", 825000000);
        setField(term148, term148.getClass(), "key", term149);
        setField(term148, term148.getClass(), "value", null);
        setField(term148, term148.getClass(), "left", null);
        setField(term148, term148.getClass(), "right", null);
        setField(term148, term148.getClass(), "parent", null);
        setBooleanField(term148, term148.getClass(), "color", true);
        setField(term147, term147.getClass(), "root", term148);
        setIntField(term147, term147.getClass(), "size", 1);
        setIntField(term147, term147.getClass(), "modCount", 1);
        setField(term147, term147.getClass(), "entrySet", null);
        setField(term147, term147.getClass(), "navigableKeySet", null);
        setField(term147, term147.getClass(), "descendingMap", null);
        setField(term147, term147.getClass(), "keySet", null);
        setField(term147, term147.getClass(), "values", null);
        setField(term146, term146.getClass(), "map", term147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLast", argTypes, term146, args);
    }

};


