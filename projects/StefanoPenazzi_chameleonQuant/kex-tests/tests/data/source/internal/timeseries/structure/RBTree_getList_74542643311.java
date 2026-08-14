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

public class RBTree_getList_74542643311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public RBTree_getList_74542643311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term165 = newInstance(Class.forName("java.util.TreeMap"));
        Object term166 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term167 = newInstance(Class.forName("java.time.Instant"));
        setField(term165, term165.getClass(), "comparator", null);
        setLongField(term167, term167.getClass(), "seconds", 1550698994L);
        setIntField(term167, term167.getClass(), "nanos", 689000000);
        setField(term166, term166.getClass(), "key", term167);
        setField(term166, term166.getClass(), "value", null);
        setField(term166, term166.getClass(), "left", null);
        setField(term166, term166.getClass(), "right", null);
        setField(term166, term166.getClass(), "parent", null);
        setBooleanField(term166, term166.getClass(), "color", true);
        setField(term165, term165.getClass(), "root", term166);
        setIntField(term165, term165.getClass(), "size", 1);
        setIntField(term165, term165.getClass(), "modCount", 1);
        setField(term165, term165.getClass(), "entrySet", null);
        setField(term165, term165.getClass(), "navigableKeySet", null);
        setField(term165, term165.getClass(), "descendingMap", null);
        setField(term165, term165.getClass(), "keySet", null);
        setField(term165, term165.getClass(), "values", null);
        setField(term164, term164.getClass(), "map", term165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getList", argTypes, term164, args);
    }

};


