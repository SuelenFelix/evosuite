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

public class RBTree_getFirst_19743382938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public RBTree_getFirst_19743382938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term138 = newInstance(Class.forName("java.util.TreeMap"));
        Object term139 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term140 = newInstance(Class.forName("java.time.Instant"));
        setField(term138, term138.getClass(), "comparator", null);
        setLongField(term140, term140.getClass(), "seconds", 1437757323L);
        setIntField(term140, term140.getClass(), "nanos", 580000000);
        setField(term139, term139.getClass(), "key", term140);
        setField(term139, term139.getClass(), "value", null);
        setField(term139, term139.getClass(), "left", null);
        setField(term139, term139.getClass(), "right", null);
        setField(term139, term139.getClass(), "parent", null);
        setBooleanField(term139, term139.getClass(), "color", true);
        setField(term138, term138.getClass(), "root", term139);
        setIntField(term138, term138.getClass(), "size", 1);
        setIntField(term138, term138.getClass(), "modCount", 1);
        setField(term138, term138.getClass(), "entrySet", null);
        setField(term138, term138.getClass(), "navigableKeySet", null);
        setField(term138, term138.getClass(), "descendingMap", null);
        setField(term138, term138.getClass(), "keySet", null);
        setField(term138, term138.getClass(), "values", null);
        setField(term137, term137.getClass(), "map", term138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirst", argTypes, term137, args);
    }

};


